package org.d3if2029.homeworkout.ui.menulatihan

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.d3if2029.homeworkout.R

class TimerWorkoutActivity : AppCompatActivity() {
    lateinit var textView : TextView
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timer_workout)
        textView = findViewById(R.id.textView)

        val button : Button = findViewById(R.id.button_selanjutnya)
        button.setOnClickListener{
            val intent = Intent(this@TimerWorkoutActivity,SelesaiLatihanActivity::class.java)
            startActivity(intent)
        }
        val button2 : Button = findViewById(R.id.button_sebelumnya)
        button2.setOnClickListener{
            val intent2 = Intent(this@TimerWorkoutActivity,MenuLatihanActivity::class.java)
            startActivity(intent2)
        }

        object : CountDownTimer(30000, 1000) {

            override fun onTick(millisUntilFinished: Long) {
                textView.setText("Sisa Waktu: " + millisUntilFinished / 1000)
            }

            // Callback function, fired
            // when the time is up
            override fun onFinish() {
                val intent3 = Intent(this@TimerWorkoutActivity,MenuLatihanActivity::class.java)
                startActivity(intent3)
            }
        }.start()
    }
}