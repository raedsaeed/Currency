package com.raed.currency.presentation.uimodels

import android.os.Parcel
import android.os.Parcelable


/**
 * Created By Raed Saeed on 22/04/2022
 */
open class BaseObject() : Parcelable {
    var resourceId = 0

    constructor(parcel: Parcel) : this() {
        resourceId = parcel.readInt()
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(resourceId)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<BaseObject> {
        override fun createFromParcel(parcel: Parcel): BaseObject {
            return BaseObject(parcel)
        }

        override fun newArray(size: Int): Array<BaseObject?> {
            return arrayOfNulls(size)
        }
    }
}