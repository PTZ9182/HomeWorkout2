
package org.d3if2029.homeworkout.ui.menulatihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import org.d3if2029.homeworkout.R
import org.d3if2029.homeworkout.adapter.DataLatihanAdapter
import org.d3if2029.homeworkout.databinding.ActivityMenuLatihan3Binding
import org.d3if2029.homeworkout.databinding.ActivityMenuLatihanBinding
import org.d3if2029.homeworkout.viewmodel.LatihanViewModel

class MenuLatihan3Activity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuLatihan3Binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuLatihan3Binding.inflate(layoutInflater)
        setContentView(binding.root)



        // Assuming the button is inside the layout specified in ActivityMenuLatihanBinding
        binding.buttonSimpanDataForm.setOnClickListener {
            val intent = Intent(this@MenuLatihan3Activity, Exercise4Activity::class.java)
            startActivity(intent)
        }
    }
}
