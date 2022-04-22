package com.raed.currency.data.models


import com.google.gson.annotations.SerializedName

data class ConvertResponse(
    @SerializedName("date")
    val date: String = "",
    @SerializedName("historical")
    val historical: String = "",
    @SerializedName("info")
    var info: Info? = null,
    @SerializedName("query")
    var query: Query? = null,
    @SerializedName("result")
    val result: Double = 0.0,
    @SerializedName("success")
    val success: Boolean = false
)