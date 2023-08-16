package org.d3if2029.homeworkout.viewmodelcewek

import android.app.Application
import androidx.lifecycle.*
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.flatMapLatest
import org.d3if2029.homeworkout.dbcewek.LatihanDatabaseCewek
import org.d3if2029.homeworkout.domaincewek.LatihanRepositoryCewek
import org.d3if2029.homeworkout.entitycewek.DataLatihanCewek

class LatihanViewModelCewek(application: Application) : AndroidViewModel(application)  {

    private val repository: LatihanRepositoryCewek
    val difficulty = MutableStateFlow("semua")

    init {
       val exerciseDao = LatihanDatabaseCewek
           .getDatabase(application, viewModelScope, application.resources)
           .LatihanDaoCewek()
        repository = LatihanRepositoryCewek(exerciseDao)
    }

     val selectedExercise = MutableLiveData<DataLatihanCewek>()

    fun setSelectedExerciseCewek(exercise: DataLatihanCewek){
        selectedExercise.value = exercise
    }

    fun getAllExercises(): LiveData<List<DataLatihanCewek>>{
        return repository.getAllExercises()
    }

    val exercisesCewek = difficulty.flatMapLatest {
        repository.getAllOrSearch(it)
    }.asLiveData()

    fun getExercisesByDifficulty(difficulty: String): LiveData<List<DataLatihanCewek>>{
        return repository.getExercisesByDifficulty(difficulty)
    }


}