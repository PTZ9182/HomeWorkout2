package org.d3if2029.homeworkout.ui.home

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.children
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.NavigationUI.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.chip.Chip
import org.d3if2029.homeworkout.R
import org.d3if2029.homeworkout.adapter.DataLatihanAdapter
import org.d3if2029.homeworkout.databinding.FragmentHomeBinding
import org.d3if2029.homeworkout.ui.menulatihan.*
import org.d3if2029.homeworkout.viewmodel.LatihanViewModel

class HomeFragment : Fragment() {
    private lateinit var _binding: FragmentHomeBinding
    private val binding get() = _binding
    private lateinit var exerciseViewModel: LatihanViewModel
    private lateinit var exerciseAdapter: DataLatihanAdapter
    private val exerciseActivityMap = mapOf(
        1 to MenuLatihanActivity::class.java,
        2 to MenuLatihan2Activity::class.java,
        3 to MenuLatihan3Activity::class.java,
        4 to MenuLatihan4Activity::class.java,
        5 to MenuLatihan5Activity::class.java,
        6 to MenuLatihan6Activity::class.java,
        7 to MenuLatihan7Activity::class.java,
        8 to MenuLatihan8Activity::class.java,
        9 to MenuLatihan9Activity::class.java
        // Tambahkan pemetaan lain sesuai kebutuhan
    )



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        activity.let {
            exerciseViewModel = ViewModelProvider(it!!).get(LatihanViewModel::class.java)
        }
        exerciseAdapter = DataLatihanAdapter(mutableListOf())


        exerciseAdapter.setOnExerciseListener { exercise ->
            exerciseViewModel.setSelectedExercise(exercise)

            val intent = exerciseActivityMap[exercise.id]
                ?.let { Intent(requireContext(), it) }
                ?: Intent(requireContext(), MenuLatihan6Activity::class.java)

            startActivity(intent)
        }

        withTags()
        attachObservers()
    }

    private fun attachObservers() {
        exerciseViewModel.exercises.observe(viewLifecycleOwner) {
            binding.dataLatihan.apply {
                adapter = exerciseAdapter
                layoutManager = LinearLayoutManager(activity)
            }
            exerciseAdapter.showData(it)
        }
    }


    private fun withTags() {
        binding.chipGroupFilter.children.forEach {
            val chip  = (it as Chip)
            chip.setOnCheckedChangeListener { _, b ->
                if (b) {
                    exerciseViewModel.difficulty.value = chip.tag as String
                }
            }
        }

    }

}