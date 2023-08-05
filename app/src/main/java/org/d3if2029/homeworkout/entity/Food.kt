package org.d3if2029.homeworkout.entity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Food(val name: String, val imageResourceId: Int, val description: String) : Parcelable