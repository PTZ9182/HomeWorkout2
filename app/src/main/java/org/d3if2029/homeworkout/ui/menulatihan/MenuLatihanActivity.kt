
package org.d3if2029.homeworkout.ui.menulatihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import org.d3if2029.homeworkout.R
import org.d3if2029.homeworkout.adapter.DataLatihanAdapter
import org.d3if2029.homeworkout.adapter.DataWorkoutAdapter
import org.d3if2029.homeworkout.databinding.ActivityMenuLatihanBinding
import org.d3if2029.homeworkout.db.WorkoutDatabase
import org.d3if2029.homeworkout.viewmodel.DatabaseViewModel
import org.d3if2029.homeworkout.viewmodel.LatihanViewModel

class MenuLatihanActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuLatihanBinding
    private lateinit var exerciseViewModel: DatabaseViewModel
    private lateinit var exerciseAdapter: DataWorkoutAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMenuLatihanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        this.let {
            exerciseViewModel = ViewModelProvider(it!!).get(DatabaseViewModel::class.java)
        }
        exerciseAdapter = DataWorkoutAdapter(mutableListOf())
//        attachObservers()

        val button : Button = findViewById(R.id.button_simpan_data_form)
        button.setOnClickListener{
            val intent = Intent(this@MenuLatihanActivity,TimerWorkoutActivity::class.java)
            startActivity(intent)
        }

    }
//    private fun attachObservers() {
//        exerciseViewModel.selectedExercise.observe(viewLifecycleOwner) {
//            binding.dataLatihan.apply {
//                adapter = exerciseAdapter
//                layoutManager = LinearLayoutManager(activity)
//            }
//            exerciseAdapter.showData(it)
//        }
//    }

}