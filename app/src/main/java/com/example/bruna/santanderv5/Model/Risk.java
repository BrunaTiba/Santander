package com.example.bruna.santanderv5.Model;

import com.google.gson.annotations.SerializedName;

public enum Risk {

    @SerializedName("1")
    LOW,
    @SerializedName("2")
    LOW_REGULAR,
    @SerializedName("3")
    REGULAR,
    @SerializedName("4")
    REGULAR_HIGH,
    @SerializedName("5")
    HIGH
}
