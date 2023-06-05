package org.d3if2029.homeworkout.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "exercise")
data class DataLatihan(
 @PrimaryKey(autoGenerate = true) val id: Int,
 @SerializedName("name") val name: String,
 @SerializedName("image") val image: String,
 @SerializedName("tantangan") val tantangan: String,
 @SerializedName("kesusahan") val kesusahan: String
)
