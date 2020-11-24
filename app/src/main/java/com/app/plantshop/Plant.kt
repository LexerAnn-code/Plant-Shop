package com.app.plantstoreapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Plant(
    var name:String,
    var price:String,
    var image:Int,
    var size:String?,
    var familt:String?,
    var desc:String?
):Parcelable