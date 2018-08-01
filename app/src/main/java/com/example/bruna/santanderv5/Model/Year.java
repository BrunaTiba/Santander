package com.example.bruna.santanderv5.Model;


import com.google.gson.annotations.SerializedName;

public class Year {
    private String fund;
    @SerializedName("CDI")
    private String cdi;

    public String getFund() {
        return fund;
    }

    public void setFund(String fund) {
        this.fund = fund;
    }

    public String getCdi() {
        return cdi;
    }

    public void setCdi(String cdi) {
        this.cdi = cdi;
    }


}
