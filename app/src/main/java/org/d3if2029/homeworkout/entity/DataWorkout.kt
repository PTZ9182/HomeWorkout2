package org.d3if2029.homeworkout.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "workout")
data class DataWorkout(
 @SerializedName("nama") val nama: String,
 @SerializedName("image") val image: String,
 @SerializedName("waktu") val waktu: String,
 @PrimaryKey(autoGenerate = true) val id: Int
)

