package com.raed.currency.utils

import androidx.navigation.navOptions
import com.raed.currency.R
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

val defaultNavOptions = navOptions {
    anim {
        enter = R.anim.slide_from_right_to_left
        exit = R.anim.slide_in_left
        popEnter = R.anim.slide_in_right
        popExit = R.anim.slide_from_left_to_right
    }
}