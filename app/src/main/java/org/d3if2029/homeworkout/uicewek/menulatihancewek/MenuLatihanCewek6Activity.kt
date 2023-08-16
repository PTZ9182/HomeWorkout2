
package org.d3if2029.homeworkout.uicewek.menulatihancewek

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.d3if2029.homeworkout.databinding.ActivityMenuLatihanCewek6Binding


class MenuLatihanCewek6Activity : AppCompatActivity() {

    private lateinit var _binding: ActivityMenuLatihanCewek6Binding
    private val binding get() = _binding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMenuLatihanCewek6Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Assuming the button is inside the layout specified in ActivityMenuLatihanBinding
        binding.buttonSimpanDataForm.setOnClickListener {
            val intent = Intent(this@MenuLatihanCewek6Activity, ExerciseCewekActivity::class.java)
            startActivity(intent)
        }
    }
}
