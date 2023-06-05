package org.d3if2029.homeworkout.domain

import androidx.lifecycle.LiveData
import kotlinx.coroutines.flow.Flow
import org.d3if2029.homeworkout.db.LatihanDao
import org.d3if2029.homeworkout.entity.DataLatihan

class LatihanRepository(private val latihanDao: LatihanDao) {

    fun getAllExercises(): LiveData<List<DataLatihan>> {
        return latihanDao.getExercises()
    }
    fun getExercisesByDifficulty(difficulty: String): LiveData<List<DataLatihan>>{
        return latihanDao.getDifficulty(difficulty)
    }

    fun getAllOrSearch(kesusahan: String): Flow<List<DataLatihan>> {
        return if (kesusahan == "semua") {
            latihanDao.getAllExercises()
        } else {
            latihanDao.getByDifficulty(kesusahan)
        }
    }
}