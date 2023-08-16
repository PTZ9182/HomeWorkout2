
package org.d3if2029.homeworkout.uicewek.menulatihancewek

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.d3if2029.homeworkout.databinding.ActivityMenuLatihanCewek4Binding


class MenuLatihanCewek4Activity : AppCompatActivity() {

    private lateinit var _binding: ActivityMenuLatihanCewek4Binding
    private val binding get() = _binding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMenuLatihanCewek4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Assuming the button is inside the layout specified in ActivityMenuLatihanBinding
        binding.buttonSimpanDataForm.setOnClickListener {
            val intent = Intent(this@MenuLatihanCewek4Activity, ExerciseCewekActivity3::class.java)
            startActivity(intent)
        }
    }
}
