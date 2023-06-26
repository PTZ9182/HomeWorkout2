package org.d3if2029.homeworkout.ui.menulatihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import org.d3if2029.homeworkout.MainActivity
import org.d3if2029.homeworkout.R
import org.d3if2029.homeworkout.entity.SqliteOpenHelper
import java.text.SimpleDateFormat
import java.util.*

class SelesaiLatihanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selesai_latihan)

        val button : Button = findViewById(R.id.button_selesai)
        button.setOnClickListener{
            val intent = Intent(this@SelesaiLatihanActivity, MainActivity::class.java)
            startActivity(intent)
        }
        addDateToDB()
    }
    private fun addDateToDB(){
        val calendar = Calendar.getInstance()
        val dateTime = calendar.time
        val sdf = SimpleDateFormat("dd MMM yyyy HH:mm", Locale.getDefault())
        val date = sdf.format(dateTime)

        val dbHandler = SqliteOpenHelper(this,null)
        dbHandler.addDate(date)
    }
}