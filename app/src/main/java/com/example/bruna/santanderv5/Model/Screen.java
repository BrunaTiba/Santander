package com.example.bruna.santanderv5.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Screen {


    private  String title;
    private String fundName;
    @SerializedName("whatIs")
    private String whatIs;
    @SerializedName("risk")
    private Risk risk;
    private String definition;
    private MoreInfo moreInfo;
    private List<Info> info;
    private String riskTitle;
    private String infoTitle;
    private String fund;



        public String getFund() {
        return fund;
    }

    public void setFund(String fund) {
        this.fund = fund;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public String getWhatIs() {
        return whatIs;
    }

    public void setWhatIs(String whatIs) {
        this.whatIs = whatIs;
    }

    public Risk getRisk() {
        return risk;
    }

    public void setRisk(Risk risk) {
        this.risk = risk;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public MoreInfo getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(MoreInfo moreInfo) {
        this.moreInfo = moreInfo;
    }

    public List<Info> getInfo() {
        return info;
    }

    public void setInfo(List<Info> info) {
        this.info = info;
    }

    public String getRiskTitle() {
        return riskTitle;
    }

    public void setRiskTitle(String riskTitle) {
        this.riskTitle = riskTitle;
    }

    public String getInfoTitle() {
        return infoTitle;
    }

    public void setInfoTitle(String infoTitle) {
        this.infoTitle = infoTitle;
    }




}
