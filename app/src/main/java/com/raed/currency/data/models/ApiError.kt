package com.raed.currency.data.models


import com.google.gson.annotations.SerializedName

data class ApiError(
    @SerializedName("code")
    val code: Int = 0,
    @SerializedName("info")
    val info: String = "",
    @SerializedName("type")
    val type: String = ""
)