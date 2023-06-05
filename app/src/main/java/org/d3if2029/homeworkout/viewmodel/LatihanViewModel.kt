package org.d3if2029.homeworkout.viewmodel

import android.app.Application
import androidx.lifecycle.*
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.flatMapLatest
import org.d3if2029.homeworkout.db.LatihanDatabase
import org.d3if2029.homeworkout.domain.LatihanRepository
import org.d3if2029.homeworkout.entity.DataLatihan

class LatihanViewModel(application: Application) : AndroidViewModel(application)  {

    private val repository: LatihanRepository
    val difficulty = MutableStateFlow("semua")

    init {
       val exerciseDao = LatihanDatabase
           .getDatabase(application, viewModelScope, application.resources)
           .exerciseDao()
        repository = LatihanRepository(exerciseDao)
    }

     val selectedExercise = MutableLiveData<DataLatihan>()

    fun setSelectedExercise(exercise: DataLatihan){
        selectedExercise.value = exercise
    }

    fun getAllExercises(): LiveData<List<DataLatihan>>{
        return repository.getAllExercises()
    }

    val exercises = difficulty.flatMapLatest {
        repository.getAllOrSearch(it)
    }.asLiveData()

    fun getExercisesByDifficulty(difficulty: String): LiveData<List<DataLatihan>>{
        return repository.getExercisesByDifficulty(difficulty)
    }


}