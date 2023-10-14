package org.d3if2029.homeworkout.uicewek.menulatihancewek

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import org.d3if2029.homeworkout.MainActivity3
import org.d3if2029.homeworkout.R
import org.d3if2029.homeworkout.entity.SqliteCewek
import org.d3if2029.homeworkout.entity.SqliteOpenHelperCewek
import java.security.SecureRandom
import java.text.SimpleDateFormat
import java.util.*

class SelesaiLatihanCewek3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selesai_latihan_cewek)

        val button : Button = findViewById(R.id.button_selesai)
        button.setOnClickListener{
            val intent = Intent(this@SelesaiLatihanCewek3Activity, MainActivity3::class.java)
            startActivity(intent)
            finish()
        }
        addDateToDB()
        addKalori()
    }
    private fun addDateToDB(){
        val calendar = Calendar.getInstance()
        val dateTime = calendar.time
        val sdf = SimpleDateFormat("dd MMM yyyy HH:mm", Locale.getDefault())
        val date = sdf.format(dateTime)

        val dbHandler = SqliteOpenHelperCewek(this,null)
        dbHandler.addDate(date)
    }
    private fun addKalori() {
        val kaloriValues = listOf("200")
        val secureRandom = SecureRandom()

        val randomKalori = kaloriValues[secureRandom.nextInt(kaloriValues.size)]

        val dbHandler = SqliteCewek(this, null)
        dbHandler.addKalori(randomKalori)
    }
}