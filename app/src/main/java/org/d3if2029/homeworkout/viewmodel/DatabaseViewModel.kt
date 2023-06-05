package org.d3if2029.homeworkout.viewmodel

import android.app.Application
import androidx.lifecycle.*
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.flatMapLatest
import org.d3if2029.homeworkout.db.WorkoutDatabase
import org.d3if2029.homeworkout.domain.WorkoutRepository
import org.d3if2029.homeworkout.entity.DataWorkout

class DatabaseViewModel(application: Application) : AndroidViewModel(application)  {

    private val repository: WorkoutRepository

    init {
       val exerciseDao = WorkoutDatabase
           .getDatabase(application, viewModelScope, application.resources)
           .exerciseDao()
        repository = WorkoutRepository(exerciseDao)
    }

     val selectedExercise = MutableLiveData<DataWorkout>()

    fun setSelectedExercise(exercise: DataWorkout){
        selectedExercise.value = exercise
    }

    fun getAllExercises(): LiveData<List<DataWorkout>>{
        return repository.getAllWorkout()
    }

}