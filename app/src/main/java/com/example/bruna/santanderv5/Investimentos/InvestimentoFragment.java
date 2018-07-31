package com.example.bruna.santanderv5.Investimentos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bruna.santanderv5.Model.Fund.Info;
import com.example.bruna.santanderv5.Model.Fund.Screen;
import com.example.bruna.santanderv5.R;
import com.example.bruna.santanderv5.Utils.MyAdapter;

import java.util.ArrayList;


public class InvestimentoFragment extends Fragment {

//    private Config config;
    RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    private ArrayList<Info> infos;
    private Screen screen;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_investimento, container, false);



        recyclerView = view.findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));


        MyAdapter adapter = new MyAdapter(infos, getContext());
        recyclerView.setAdapter(adapter);

//        loadRecyclerViewData();

//        getData();


        return view;

    }


}
