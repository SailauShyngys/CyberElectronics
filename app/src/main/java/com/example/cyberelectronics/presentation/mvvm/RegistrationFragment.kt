package com.example.cyberelectronics.presentation.mvvm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.cyberelectronics.R
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.cyberelectronics.databinding.RegistrationBinding

class RegistrationFragment : Fragment(R.layout.registration) {

    private val binding: RegistrationBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.regBack.setOnClickListener {
            findNavController().navigate(R.id.action_registrationFragment_to_menuFragment)
        }

        binding.register.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_loginFragment)
        }
    }
}
