package org.d3if2029.homeworkout.ui.menulatihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import org.d3if2029.homeworkout.MainActivity
import org.d3if2029.homeworkout.R

class SelesaiLatihanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selesai_latihan)

        val button : Button = findViewById(R.id.button_selesai)
        button.setOnClickListener{
            val intent = Intent(this@SelesaiLatihanActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}