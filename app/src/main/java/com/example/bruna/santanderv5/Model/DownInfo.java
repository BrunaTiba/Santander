package com.example.bruna.santanderv5.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DownInfo {

    //Json Propertys
    @JsonProperty("name")
    private String name;

    @JsonProperty("data")
    private String data;

    public DownInfo(String name, String data) {
        this.name = name;
        this.data = data;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
