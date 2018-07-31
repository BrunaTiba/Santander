package com.example.bruna.santanderv5.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Cells {

    //Json Propertys
    @JsonProperty("id")
    private int id;

    @JsonProperty("type")
    private int type;

    @JsonProperty("message")
    private String message;

    @JsonProperty("typefield")
    private String typefield;

    @JsonProperty("hidden")
    private boolean hidden;

    @JsonProperty("topSpacing")
    private int topSpacing;

    @JsonProperty("show")
    private int show;

    @JsonProperty("required")
    private boolean required;

    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTypefield() {
        return typefield;
    }

    public void setTypefield(String typefield) {
        this.typefield = typefield;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public int getTopSpacing() {
        return topSpacing;
    }

    public void setTopSpacing(int topSpacing) {
        this.topSpacing = topSpacing;
    }

    public int getShow() {
        return show;
    }

    public void setShow(int show) {
        this.show = show;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }
}
