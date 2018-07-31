package com.example.bruna.santanderv5.Model.Fund;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MoreInfo {

    //Json Propertys
    @JsonProperty("month")
    private Month month;

    @JsonProperty("year")
    private Year year;

    @JsonProperty("12months")
    private TwelveMonths twelveMonths;

    //Getters and Setters
    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public TwelveMonths getTwelveMonths() {
        return twelveMonths;
    }

    public void setTwelveMonths(TwelveMonths twelveMonths) {
        this.twelveMonths = twelveMonths;
    }


}
