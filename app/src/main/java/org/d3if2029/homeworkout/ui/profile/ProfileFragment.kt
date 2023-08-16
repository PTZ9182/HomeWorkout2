package org.d3if2029.homeworkout.ui.profile


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import org.d3if2029.homeworkout.R
import org.d3if2029.homeworkout.databinding.FragmentProfileBinding


class ProfileFragment : Fragment() {
    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)

        _binding?.beriNilai?.setOnClickListener {
            val websiteUrl = "https://forms.gle/RDApaD9f3ipEdzra7"

            // Buat Intent untuk membuka tautan website
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(websiteUrl)

            // Cek apakah ada aplikasi browser yang dapat menangani intent ini sebelum memulai aktivitas
            if (intent.resolveActivity(requireContext().packageManager) != null) {
                startActivity(intent)
            }
        }

        _binding?.pageBmi?.setOnClickListener{
            it.findNavController().navigate(R.id.action_profileFragment_to_BMIActivity)
        }

        _binding?.masukkan?.setOnClickListener{
            it.findNavController().navigate(R.id.action_profileFragment_to_nutrisiActivity)
        }
        _binding?.pilihgender?.setOnClickListener{
            it.findNavController().navigate(R.id.action_profileFragment_to_homeFragmentCewek)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        // Set _binding to null when the view is destroyed to avoid memory leaks
        _binding = null
    }
}