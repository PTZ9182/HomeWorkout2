
package org.d3if2029.homeworkout.ui.menulatihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import org.d3if2029.homeworkout.R
import org.d3if2029.homeworkout.adapter.DataLatihanAdapter
import org.d3if2029.homeworkout.databinding.ActivityMenuLatihan5Binding
import org.d3if2029.homeworkout.databinding.ActivityMenuLatihanBinding
import org.d3if2029.homeworkout.viewmodel.LatihanViewModel

class MenuLatihan5Activity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuLatihan5Binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuLatihan5Binding.inflate(layoutInflater)
        setContentView(binding.root)



        // Assuming the button is inside the layout specified in ActivityMenuLatihanBinding
        binding.buttonSimpanDataForm.setOnClickListener {
            val intent = Intent(this@MenuLatihan5Activity, Exercise2Activity::class.java)
            startActivity(intent)
        }
    }
}
