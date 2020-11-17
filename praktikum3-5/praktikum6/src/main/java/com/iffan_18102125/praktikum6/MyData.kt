package com.iffan_18102125.praktikum6

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

class MyData {
    @Parcelize
    data class MyData(
        var name: String,
        var description: String,
        var photo: String
    ) : Parcelable

}