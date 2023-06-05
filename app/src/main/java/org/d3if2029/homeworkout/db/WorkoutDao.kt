package org.d3if2029.homeworkout.db

import androidx.lifecycle.LiveData
import androidx.room.*
import kotlinx.coroutines.flow.Flow
import org.d3if2029.homeworkout.entity.DataWorkout

@Dao
interface WorkoutDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE )
    suspend fun insertAllWorkout(exercise: List<DataWorkout>)

    @Query("SELECT * FROM workout")
    fun getWorkout(): LiveData<List<DataWorkout>>

    @Query("SELECT * FROM workout")
    fun getAllWorkout(): Flow<List<DataWorkout>>

    @Query("SELECT * FROM workout")
    fun getWorkoutList(): List<DataWorkout>
}