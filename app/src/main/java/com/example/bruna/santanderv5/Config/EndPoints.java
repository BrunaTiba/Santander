package com.example.bruna.santanderv5.Config;

import com.example.bruna.santanderv5.Model.Fund;

import retrofit2.Call;
import retrofit2.http.GET;

public interface EndPoints {

    @GET("fund.json")
    Call<Fund> getFund();
}
