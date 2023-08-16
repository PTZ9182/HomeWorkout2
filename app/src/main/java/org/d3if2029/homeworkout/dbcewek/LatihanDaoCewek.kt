package org.d3if2029.homeworkout.dbcewek

import androidx.lifecycle.LiveData
import androidx.room.*
import kotlinx.coroutines.flow.Flow
import org.d3if2029.homeworkout.entitycewek.DataLatihanCewek


@Dao
interface LatihanDaoCewek {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
     suspend fun insertAllExercises(exercise2: List<DataLatihanCewek>)

    @Query("SELECT * FROM exercise2")
    fun getExercises(): LiveData<List<DataLatihanCewek>>
    @Query("SELECT * FROM exercise2")
    fun getAllExercises(): Flow<List<DataLatihanCewek>>

    @Query("SELECT * FROM exercise2")
    fun getExercisesList(): List<DataLatihanCewek>

    @Query("Select * from exercise2 WHERE kesusahan =:difficulty")
    fun getDifficulty(difficulty: String?): LiveData<List<DataLatihanCewek>>

    @Query("Select * from exercise2 WHERE kesusahan =:difficulty")
    fun getByDifficulty(difficulty: String?): Flow<List<DataLatihanCewek>>


}