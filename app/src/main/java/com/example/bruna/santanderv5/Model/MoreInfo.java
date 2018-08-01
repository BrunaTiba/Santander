package com.example.bruna.santanderv5.Model;

import com.google.gson.annotations.SerializedName;

public class MoreInfo {

    private Month month;
    private Year year;
    @SerializedName("12months")
    private Months months;

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

    public Months getMonths() {
        return months;
    }

    public void setMonths(Months months) {
        this.months = months;
    }


}
