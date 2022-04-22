package com.raed.currency.presentation.uimodels

import android.os.Parcel
import android.os.Parcelable


/**
 * Created By Raed Saeed on 22/04/2022
 */
data class UICurrency(val symbol: String?, val value: Float, val date: String? = null) :
    BaseObject() {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readFloat(),
        parcel.readString()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        super.writeToParcel(parcel, flags)
        parcel.writeString(symbol)
        parcel.writeFloat(value)
        parcel.writeString(date)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<UICurrency> {
        override fun createFromParcel(parcel: Parcel): UICurrency {
            return UICurrency(parcel)
        }

        override fun newArray(size: Int): Array<UICurrency?> {
            return arrayOfNulls(size)
        }
    }
}