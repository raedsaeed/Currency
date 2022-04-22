package com.raed.currency.utils

import java.text.DecimalFormat


/**
 * Created By Raed Saeed on 22/04/2022
 */
fun Float?.toFloatOrZero(): Float {
    return this ?: 0f
}

fun String?.toFloatOrZero(): Float {
    return this?.toFloatOrNull().toFloatOrZero()
}

fun Float?.format(): String {
    return DecimalFormat("#.###").format(this)
}