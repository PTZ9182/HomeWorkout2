
package org.d3if2029.homeworkout.ui.menulatihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import org.d3if2029.homeworkout.R
import org.d3if2029.homeworkout.adapter.DataWorkoutAdapter
import org.d3if2029.homeworkout.databinding.ActivityMenuLatihanBinding
import org.d3if2029.homeworkout.viewmodel.WorkoutViewModel

class MenuLatihanActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuLatihanBinding
    private lateinit var workoutViewModel: WorkoutViewModel
    private lateinit var workoutAdapter: DataWorkoutAdapter



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMenuLatihanBinding.inflate(layoutInflater)
        setContentView(binding.root)
        this.let {
            workoutViewModel = ViewModelProvider(it!!).get(WorkoutViewModel::class.java)
        }
        workoutAdapter = DataWorkoutAdapter(mutableListOf())

        val recyclerView = binding.dataLatihan1

        recyclerView.apply {
            this.adapter = workoutAdapter
            this.layoutManager = LinearLayoutManager(this@MenuLatihanActivity)
        }




        val button : Button = findViewById(R.id.button_simpan_data_form)
        button.setOnClickListener{
            val intent = Intent(this@MenuLatihanActivity,ExerciseActivity
            ::class.java)
            startActivity(intent)
        }

    }

}