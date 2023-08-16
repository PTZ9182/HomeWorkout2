package org.d3if2029.homeworkout.domaincewek

import androidx.lifecycle.LiveData
import kotlinx.coroutines.flow.Flow
import org.d3if2029.homeworkout.dbcewek.LatihanDaoCewek
import org.d3if2029.homeworkout.entitycewek.DataLatihanCewek


class LatihanRepositoryCewek(private val latihanDaoCewek: LatihanDaoCewek) {

    fun getAllExercises(): LiveData<List<DataLatihanCewek>> {
        return latihanDaoCewek.getExercises()
    }
    fun getExercisesByDifficulty(difficulty: String): LiveData<List<DataLatihanCewek>>{
        return latihanDaoCewek.getDifficulty(difficulty)
    }

    fun getAllOrSearch(kesusahan: String): Flow<List<DataLatihanCewek>> {
        return if (kesusahan == "semua") {
            latihanDaoCewek.getAllExercises()
        } else {
            latihanDaoCewek.getByDifficulty(kesusahan)
        }
    }
}