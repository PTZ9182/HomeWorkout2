package org.d3if2029.homeworkout.ui.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import android.widget.Button
import org.d3if2029.homeworkout.MainActivity
import org.d3if2029.homeworkout.R
import org.d3if2029.homeworkout.uicewek.homecewek.HomeFragmentCewek

@Suppress("DEPRECATION")
class SplasScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button2) // Load the new layout with buttons

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        findViewById<Button>(R.id.button_home).setOnClickListener {
            navigateToHomeFragment()
        }

        findViewById<Button>(R.id.button_home_cewek).setOnClickListener {
            navigateToHomeCewekFragment()
        }
    }

    private fun navigateToHomeFragment() {
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("fragment_to_open", "home")
        startActivity(intent)
        // Tidak perlu memanggil finish() di sini, agar dapat kembali ke Splash Screen jika diperlukan
    }

    private fun navigateToHomeCewekFragment() {
        val intent = Intent(this, HomeFragmentCewek::class.java)
        intent.putExtra("fragment_to_open", "homeCewek")
        startActivity(intent)
        // Tidak perlu memanggil finish() di sini, agar dapat kembali ke Splash Screen jika diperlukan
    }

}
