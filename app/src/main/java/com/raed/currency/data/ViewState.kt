package com.raed.currency.data


/**
 * Created By Raed Saeed on 22/04/2022
 */
sealed class ViewState {
    object Loading : ViewState()
    class Success<T>(val item: T?) : ViewState() where T : Any
    class Error(val error: Throwable) : ViewState()
}