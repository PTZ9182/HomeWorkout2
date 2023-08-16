
package org.d3if2029.homeworkout.uicewek.menulatihancewek

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.d3if2029.homeworkout.databinding.ActivityMenuLatihanCewek5Binding


class MenuLatihanCewek5Activity : AppCompatActivity() {

    private lateinit var _binding: ActivityMenuLatihanCewek5Binding
    private val binding get() = _binding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMenuLatihanCewek5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Assuming the button is inside the layout specified in ActivityMenuLatihanBinding
        binding.buttonSimpanDataForm.setOnClickListener {
            val intent = Intent(this@MenuLatihanCewek5Activity, ExerciseCewekActivity2::class.java)
            startActivity(intent)
        }
    }
}
