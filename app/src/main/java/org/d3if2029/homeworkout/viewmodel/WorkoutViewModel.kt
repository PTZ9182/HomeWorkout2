package org.d3if2029.homeworkout.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.Flow
import org.d3if2029.homeworkout.db.WorkoutDatabase
import org.d3if2029.homeworkout.domain.WorkoutRepository
import org.d3if2029.homeworkout.entity.DataWorkout

class WorkoutViewModel(application: Application) : AndroidViewModel(application) {

    private val repository2: WorkoutRepository

    init {
        val workoutDao = WorkoutDatabase
            .getDatabase(application, viewModelScope, application.resources)
            .workouDao()
        repository2 = WorkoutRepository(workoutDao)
    }


    fun workou(): Flow<List<DataWorkout>> {
        return repository2.getAllOrWorkout()
    }



}