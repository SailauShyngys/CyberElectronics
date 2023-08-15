package com.example.cyberelectronics.presentation.mvvm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.cyberelectronics.R
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.cyberelectronics.databinding.AutorithationBinding

class AutorithationFragment : Fragment(R.layout.autorithation) {

    private val binding: AutorithationBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.autorBack.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_menuFragment)
        }

        binding.signIn.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_MainFragment)
        }
    }
}
