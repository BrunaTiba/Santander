package com.example.bruna.santanderv5.Investimentos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bruna.santanderv5.Config.EndPoints;
import com.example.bruna.santanderv5.Config.IRetrofitConfig;
import com.example.bruna.santanderv5.Model.Fund;
import com.example.bruna.santanderv5.Model.Info;
import com.example.bruna.santanderv5.Model.Screen;
import com.example.bruna.santanderv5.R;
import com.example.bruna.santanderv5.Config.MyAdapter;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class InvestimentoFragment extends Fragment {

//    private Config config;
    RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    private ArrayList<Info> infos;
    private Screen screen;

    private TextView title, whatIs, fundName;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_investimento, container, false);
        title = view.findViewById(R.id.title);
        whatIs = view.findViewById(R.id.whatIs);
        fundName = view.findViewById(R.id.fundName);


        init();



        recyclerView = view.findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));


        MyAdapter adapter = new MyAdapter(infos, getContext());
        recyclerView.setAdapter(adapter);

//        loadRecyclerViewData();

//        getData();


        return view;

    }
    private void init(){
        EndPoints endPoints = IRetrofitConfig.retrofit.create(EndPoints.class);

        Call<Fund> fund = endPoints.getFund();

        fund.enqueue(new Callback<Fund>() {
            @Override
            public void onResponse(Call<Fund> call, Response<Fund> response) {

                Fund fundReturn = response.body();

                title.setText(fundReturn.getScreen().getTitle());
                fundName.setText(fundReturn.getScreen().getFundName());
                whatIs.setText(fundReturn.getScreen().getWhatIs());



            }
            @Override
            public void onFailure(Call<Fund> call, Throwable t) {
               // Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
