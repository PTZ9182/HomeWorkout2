package org.d3if2029.homeworkout.uicewek.homecewek

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
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.chip.Chip
import org.d3if2029.homeworkout.R
import org.d3if2029.homeworkout.R.id.menuLatihanCewekActivity
import org.d3if2029.homeworkout.adaptercewek.DataLatihanAdapterCewek
import org.d3if2029.homeworkout.databinding.FragmentHomeCewekBinding
import org.d3if2029.homeworkout.ui.menulatihan.*
import org.d3if2029.homeworkout.uicewek.menulatihancewek.*
import org.d3if2029.homeworkout.viewmodelcewek.LatihanViewModelCewek


class HomeFragmentCewek : Fragment() {
    private lateinit var _binding: FragmentHomeCewekBinding
    private val binding get() = _binding
    private lateinit var exerciseViewModel: LatihanViewModelCewek
    private lateinit var exerciseAdapter: DataLatihanAdapterCewek
    private val exerciseActivityMap = mapOf(
        1 to MenuLatihanCewekActivity::class.java,
        2 to MenuLatihanCewek2Activity::class.java,
        3 to MenuLatihanCewek3Activity::class.java,
        4 to MenuLatihanCewek4Activity::class.java,
        5 to MenuLatihanCewek5Activity::class.java,
        6 to MenuLatihanCewek6Activity::class.java
        // Tambahkan pemetaan lain sesuai kebutuhan
    )



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeCewekBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        activity.let {
            exerciseViewModel = ViewModelProvider(it!!).get(LatihanViewModelCewek::class.java)
        }
        exerciseAdapter = DataLatihanAdapterCewek(mutableListOf())

        exerciseAdapter.setOnExerciseListenerCewek { exercise ->
            exerciseViewModel.setSelectedExerciseCewek(exercise)

            val intent = exerciseActivityMap[exercise.id]
                ?.let { Intent(requireContext(), it) }
                ?: Intent(requireContext(), MenuLatihanCewek6Activity::class.java)

            startActivity(intent)
        }

        withTags()
        attachObservers()
    }

    private fun attachObservers() {
        exerciseViewModel.exercisesCewek.observe(viewLifecycleOwner) {
            binding.dataLatihanCewek.apply {
                adapter = exerciseAdapter
                layoutManager = LinearLayoutManager(activity)
            }
            exerciseAdapter.showDataCewek(it)
        }
    }


    private fun withTags() {
        binding.chipGroupFilter2.children.forEach {
            val chip  = (it as Chip)
            chip.setOnCheckedChangeListener { _, b ->
                if (b) {
                    exerciseViewModel.difficulty.value = chip.tag as String
                }
            }
        }

    }

}