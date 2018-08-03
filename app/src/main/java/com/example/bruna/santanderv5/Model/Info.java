package com.example.bruna.santanderv5.Model;


public class Info {

    public String name;
    public String data;


    public Info(String name, String data) {
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
