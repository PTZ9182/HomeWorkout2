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
import org.d3if2029.homeworkout.entity.DataLatihan


@Database(version = 2, entities = [DataLatihan::class], exportSchema = false)
abstract class LatihanDatabase : RoomDatabase() {

    abstract fun exerciseDao(): LatihanDao

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

        private suspend fun prePopulateDatabase(exerciseDao: LatihanDao) {
            val jsonString = resources.openRawResource(R.raw.exercises).bufferedReader().use {
                it.readText()
            }
            val typeToken = object : TypeToken<List<DataLatihan>>() {}.type
            val exercises = Gson().fromJson<List<DataLatihan>>(jsonString, typeToken)
            exerciseDao.insertAllExercises(exercises)
        }
    }

    companion object {

        @Volatile
        private var INSTANCE: LatihanDatabase? = null

        fun getDatabase(context: Context, coroutineScope: CoroutineScope, resources: Resources): LatihanDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }

            synchronized(this) {
                val instance = Room.databaseBuilder(context.applicationContext,
                    LatihanDatabase::class.java,
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