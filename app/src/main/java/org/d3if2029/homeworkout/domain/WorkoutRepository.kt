package org.d3if2029.homeworkout.domain

import androidx.lifecycle.LiveData
import kotlinx.coroutines.flow.Flow
import org.d3if2029.homeworkout.db.LatihanDao
import org.d3if2029.homeworkout.db.WorkoutDao
import org.d3if2029.homeworkout.entity.DataLatihan
import org.d3if2029.homeworkout.entity.DataWorkout

class WorkoutRepository(private val workoutDao: WorkoutDao) {

    fun getAllWorkout(): LiveData<List<DataWorkout>> {
        return workoutDao.getWorkout()
    }
}