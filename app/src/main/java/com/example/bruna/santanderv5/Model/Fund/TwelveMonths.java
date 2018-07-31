package com.example.bruna.santanderv5.Model.Fund;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TwelveMonths {

    //Json Propertys
    @JsonProperty("fund")
    private double fund;

    @JsonProperty("CDI")
    private double CDI;

    //Getters and Setters
    public double getFund() {
        return fund;
    }

    public void setFund(double fund) {
        this.fund = fund;
    }

    public double getCDI() {
        return CDI;
    }

    public void setCDI(double CDI) {
        this.CDI = CDI;
    }


}
