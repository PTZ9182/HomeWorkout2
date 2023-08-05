
package org.d3if2029.homeworkout.ui.menulatihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import org.d3if2029.homeworkout.R
import org.d3if2029.homeworkout.adapter.DataLatihanAdapter
import org.d3if2029.homeworkout.databinding.ActivityMenuLatihanBinding
import org.d3if2029.homeworkout.viewmodel.LatihanViewModel

class MenuLatihanActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuLatihanBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuLatihanBinding.inflate(layoutInflater)
        setContentView(binding.root)



        // Assuming the button is inside the layout specified in ActivityMenuLatihanBinding
        binding.buttonSimpanDataForm.setOnClickListener {
            val intent = Intent(this@MenuLatihanActivity, ExerciseActivity::class.java)
            startActivity(intent)
        }
    }
}
