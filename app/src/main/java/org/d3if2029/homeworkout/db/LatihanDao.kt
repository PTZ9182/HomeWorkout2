package org.d3if2029.homeworkout.db

import androidx.lifecycle.LiveData
import androidx.room.*
import kotlinx.coroutines.flow.Flow
import org.d3if2029.homeworkout.entity.DataLatihan


@Dao
interface LatihanDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllExercises(exercises: List<DataLatihan>)

    @Query("SELECT * FROM exercise")
    fun getExercises(): LiveData<List<DataLatihan>>
    @Query("SELECT * FROM exercise")
    fun getAllExercises(): Flow<List<DataLatihan>>

    @Query("SELECT * FROM exercise")
    fun getExercisesList(): List<DataLatihan>

    @Query("Select * from exercise WHERE kesusahan =:difficulty")
    fun getDifficulty(difficulty: String?): LiveData<List<DataLatihan>>

    @Query("Select * from exercise WHERE kesusahan =:difficulty")
    fun getByDifficulty(difficulty: String?): Flow<List<DataLatihan>>


}