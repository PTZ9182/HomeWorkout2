package org.d3if2029.homeworkout.ui.splashscreen


import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.findNavController
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import org.d3if2029.homeworkout.R
import org.d3if2029.homeworkout.databinding.FragmentPraloginBinding



class PraloginFragment : Fragment() {
    private var _binding: FragmentPraloginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPraloginBinding.inflate(inflater, container, false)


        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.praLoginPragment.setOnRefreshListener {
            binding.praLoginPragment.isRefreshing = false
        }

        binding.dpButtonLakilaki.setOnClickListener{
            it.findNavController().navigate(R.id.action_praloginFragment_to_BMIAwalActivity)
        }
        binding.dpButtonPerempuan.setOnClickListener{
            it.findNavController().navigate(R.id.action_praloginFragment_to_BMIAwalActivity2)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        // Set _binding to null when the view is destroyed to avoid memory leaks
        _binding = null
    }
}