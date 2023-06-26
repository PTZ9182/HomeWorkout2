package org.d3if2029.homeworkout.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "datalatihan")
data class DataWorkout(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @SerializedName("nama") val nama: String,
    @SerializedName("gambar") val gambar: String,
    @SerializedName("banyak") val banyak: String
    )