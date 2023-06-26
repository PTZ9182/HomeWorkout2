package org.d3if2029.homeworkout.ui.profile


import android.content.Context
import android.os.Bundle
import android.preference.Preference
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import org.d3if2029.homeworkout.R
import org.d3if2029.homeworkout.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {
    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!
    private lateinit var pref: Preference

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentProfileBinding.inflate(inflater, container, false)

        val contextt: Context
        contextt = requireActivity()
        pref = Preference(contextt)

        binding.constraintLayout4.setOnClickListener {
            it.findNavController().navigate(R.id.action_profileFragment_to_editProfileFragment)
        }
        binding.pageBmi.setOnClickListener{
            it.findNavController().navigate(R.id.action_profileFragment_to_BMIActivity)
        }
        binding.constraintLayout5.setOnClickListener {
            it.findNavController().navigate(R.id.action_profileFragment_to_gantiPasswordFragment)
        }
        return binding.root
    }
}