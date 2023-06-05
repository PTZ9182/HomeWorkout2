package org.d3if2029.homeworkout.db

import android.content.Context
import android.content.res.Resources
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.*
import org.d3if2029.homeworkout.R
import org.d3if2029.homeworkout.entity.DataWorkout


@Database(version = 2, entities = [DataWorkout::class], exportSchema = false)
abstract class WorkoutDatabase : RoomDatabase() {

    abstract fun exerciseDao(): WorkoutDao

    private class ExerciseDatabaseCallback(
        private val scope: CoroutineScope,
        private val resources: Resources
    ) : RoomDatabase.Callback() {

        override fun onCreate(db: SupportSQLiteDatabase) {
            super.onCreate(db)
            INSTANCE?.let { database ->
                scope.launch {
                    val exerciseDao = database.exerciseDao()
                    prePopulateDatabase(exerciseDao)
                }
            }
        }

        private suspend fun prePopulateDatabase(exerciseDao: WorkoutDao) {
            val jsonString = resources.openRawResource(R.raw.exercises).bufferedReader().use {
                it.readText()
            }
            val typeToken = object : TypeToken<List<DataWorkout>>() {}.type
            val exercises = Gson().fromJson<List<DataWorkout>>(jsonString, typeToken)
            exerciseDao.insertAllWorkout(exercises)
        }
    }

    companion object {

        @Volatile
        private var INSTANCE: WorkoutDatabase? = null

        fun getDatabase(context: Context, coroutineScope: CoroutineScope, resources: Resources): WorkoutDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }

            synchronized(this) {
                val instance = Room.databaseBuilder(context.applicationContext,
                    WorkoutDatabase::class.java,
                    "players_database")
                    .addCallback(ExerciseDatabaseCallback(coroutineScope, resources))
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                return instance
            }
        }
    }
}