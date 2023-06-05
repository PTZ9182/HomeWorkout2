package org.d3if2029.homeworkout.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.children
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.chip.Chip
import org.d3if2029.homeworkout.R
import org.d3if2029.homeworkout.adapter.DataLatihanAdapter
import org.d3if2029.homeworkout.databinding.FragmentHomeBinding
import org.d3if2029.homeworkout.viewmodel.LatihanViewModel

class HomeFragment : Fragment() {
    private lateinit var _binding: FragmentHomeBinding
    private val binding get() = _binding
    private lateinit var exerciseViewModel: LatihanViewModel
    private lateinit var exerciseAdapter: DataLatihanAdapter



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
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
           findNavController().navigate(R.id.menuLatihanActivity, arguments, NavOptions.Builder().setPopUpTo(R.id.menuLatihanActivity, true).build())
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