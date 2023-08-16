
package org.d3if2029.homeworkout.uicewek.menulatihancewek

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import org.d3if2029.homeworkout.R
import org.d3if2029.homeworkout.databinding.ActivityMenuLatihanCewekBinding
import org.d3if2029.homeworkout.viewmodelcewek.LatihanViewModelCewek


class MenuLatihanCewekActivity : AppCompatActivity() {

    private lateinit var _binding: ActivityMenuLatihanCewekBinding
    private val binding get() = _binding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMenuLatihanCewekBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Assuming the button is inside the layout specified in ActivityMenuLatihanBinding
        binding.buttonSimpanDataForm.setOnClickListener {
            val intent = Intent(this@MenuLatihanCewekActivity, ExerciseCewekActivity6::class.java)
            startActivity(intent)
        }
    }
}
