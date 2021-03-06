package com.tuongnv.retrofitexample.model;

import com.google.gson.annotations.SerializedName;

public class Quote {
    @SerializedName("USDVND")
    private int usdVnd;

    public int getUsdVnd() {
        return usdVnd;
    }

    public void setUsdVnd(int usdVnd) {
        this.usdVnd = usdVnd;
    }
}
