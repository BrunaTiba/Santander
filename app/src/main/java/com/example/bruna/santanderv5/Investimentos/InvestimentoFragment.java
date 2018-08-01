package com.example.bruna.santanderv5.Investimentos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.bruna.santanderv5.Config.EndPoints;
import com.example.bruna.santanderv5.Config.IRetrofitConfig;
import com.example.bruna.santanderv5.Model.Fund;
import com.example.bruna.santanderv5.Model.MoreInfo;
import com.example.bruna.santanderv5.Model.Screen;
import com.example.bruna.santanderv5.R;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class InvestimentoFragment extends Fragment {

    private Screen screen;

    private TextView title, whatIs, fundName, definition, riskTitle, infoTitle;
    private MoreInfo moreInfo;

            //cdi,fundMonth;;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_investimento, container, false);
        title = view.findViewById(R.id.title);
        whatIs = view.findViewById(R.id.whatIs);
        fundName = view.findViewById(R.id.fundName);
        definition = view.findViewById(R.id.definition);
        riskTitle = view.findViewById(R.id.riskTitle);
        infoTitle = view.findViewById(R.id.infoTitle);

        init();

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
                definition.setText(fundReturn.getScreen().getDefinition());
                riskTitle.setText(fundReturn.getScreen().getRiskTitle());
                infoTitle.setText(fundReturn.getScreen().getInfoTitle());
              //  cdi.setText(fundReturn.getScreen().getCdi());
               // fundMonth.setText(fundReturn.getScreen().getFundMonth());


            }
            @Override
            public void onFailure(Call<Fund> call, Throwable t) {
               // Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
