package org.d3if2029.homeworkout.dbcewek

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
import org.d3if2029.homeworkout.entitycewek.DataLatihanCewek


@Database(version = 1, entities = [DataLatihanCewek::class], exportSchema = false)
abstract class LatihanDatabaseCewek : RoomDatabase() {

    abstract fun LatihanDaoCewek(): LatihanDaoCewek

    private class ExerciseDatabaseCallback(
        private val scope: CoroutineScope,
        private val resources: Resources
    ) : RoomDatabase.Callback() {

        override fun onCreate(db: SupportSQLiteDatabase) {
            super.onCreate(db)
            INSTANCE?.let { database ->
                scope.launch {
                    val LatihanDaoCewek = database.LatihanDaoCewek()
                    prePopulateDatabase(LatihanDaoCewek)
                }
            }
        }

        private suspend fun prePopulateDatabase(LatihanDaoCewek: LatihanDaoCewek) {
            val jsonString = resources.openRawResource(R.raw.exercises2).bufferedReader().use {
                it.readText()
            }
            val typeToken = object : TypeToken<List<DataLatihanCewek>>() {}.type
            val exercises = Gson().fromJson<List<DataLatihanCewek>>(jsonString, typeToken)
            LatihanDaoCewek.insertAllExercises(exercises)
        }
    }

    companion object {

        @Volatile
        private var INSTANCE: LatihanDatabaseCewek? = null

        fun getDatabase(context: Context, coroutineScope: CoroutineScope, resources: Resources): LatihanDatabaseCewek {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }

            synchronized(this) {
                val instance = Room.databaseBuilder(context.applicationContext,
                    LatihanDatabaseCewek::class.java,
                    "player_database")
                    .addCallback(ExerciseDatabaseCallback(coroutineScope, resources))
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                return instance
            }
        }
    }
}