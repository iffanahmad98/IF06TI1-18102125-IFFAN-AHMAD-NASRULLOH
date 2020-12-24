package com.iffan_18102125.praktikum9.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

    @Parcelize
    data class SettingModel (
        var name: String? = null,
        var email: String? = null,
        var age: Int = 0,
        var phoneNumber: String? = null,
        var gender : String? = null,
        var city: String? = null,
        var isDarkTheme: Boolean = false
    ): Parcelable
