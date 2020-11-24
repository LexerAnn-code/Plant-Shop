package com.app.plantstoreapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CategoryList(
    var plantName:String,
    var price:String
):Parcelable