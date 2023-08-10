package com.example.cyberelectronics.presentation.mvvm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.cyberelectronics.R
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.cyberelectronics.databinding.EditProfileBinding

class EditProfileFragment : Fragment(R.layout.edit_profile) {

    private val binding: EditProfileBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.arrow.setOnClickListener {
            findNavController().navigate(R.id.action_EditProfileFragment_to_MainFragment)
        }
        binding.save_btn.setOnClickListener {
            findNavController().navigate(R.id.action_EditProfileFragment_to_profileFragment)
        }
    }
}
