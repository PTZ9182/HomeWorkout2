package org.d3if2029.homeworkout.entity

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class Sqlite(context : Context, factory: SQLiteDatabase.CursorFactory?)
    : SQLiteOpenHelper(context, DATABASE_NAME, factory, DATABASE_VERSION){

    companion object{
        private val DATABASE_VERSION = 2
        private val DATABASE_NAME = "kalori.db"
        private val TABLE_HISTORY = "kalori"
        private val COLUMN_ID = "_id"
        private val COLUMN_KALORI = "kalori_completed"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        val CREATE_EXERCISE_TABLE = ("CREATE TABLE " + TABLE_HISTORY
                + "(" + COLUMN_ID + " INTEGER PRIMARY KEY,"
                + COLUMN_KALORI + " TEXT)")
        // CREATE TABLE history (_id INTEGER PRIMARY KEY, completed_date TEXT)
        db?.execSQL(CREATE_EXERCISE_TABLE)

    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("DROP TABLE IF EXISTS " + TABLE_HISTORY)
        // recreate again
        onCreate(db)
    }

    fun addKalori(kalori : String){
        val values = ContentValues()
        values.put(COLUMN_KALORI, kalori)
        val db2 = this.writableDatabase
        db2.insert(TABLE_HISTORY,null,values)
        db2.close()
    }

    fun getAllKalori() : ArrayList<String>{
        val kalori = ArrayList<String>()
        val db2 = this.readableDatabase

        val cursor2 = db2.rawQuery("SELECT * FROM $TABLE_HISTORY",null)

        while(cursor2.moveToNext()){
            val kaloriValue = (cursor2.getString(cursor2.getColumnIndex(COLUMN_KALORI)))
            kalori.add(kaloriValue)
        }
        cursor2.close()
        return kalori
    }

}