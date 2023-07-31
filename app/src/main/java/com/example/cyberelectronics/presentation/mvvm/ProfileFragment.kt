package com.example.cyberelectronics.presentation.mvvm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.cyberelectronics.R
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.cyberelectronics.databinding.ProfileBinding

class ProfileFragment : Fragment(R.layout.profile) {

    private val binding: ProfileBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.Edit.setOnClickListener {
            findNavController().navigate(R.id.action_profileFragment_to_EditProfileFragment)
        }

        binding.Exit.setOnClickListener {
            findNavController().navigate(R.id.action_profileFragment_to_menuFragment)
        }
    }
}
