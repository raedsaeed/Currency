package com.raed.currency.data


/**
 * Created By Raed Saeed on 22/04/2022
 */
sealed class Result {
    object Loading : Result()
    class Success<T>(val item: T?) : Result() where T : Any
    class Error(val error: Throwable) : Result()
}