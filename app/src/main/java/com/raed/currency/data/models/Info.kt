package com.raed.currency.data.models


import com.google.gson.annotations.SerializedName

data class Info(
    @SerializedName("rate")
    val rate: Double = 0.0,
    @SerializedName("timestamp")
    val timestamp: Int = 0
)