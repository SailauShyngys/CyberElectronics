package com.example.cyberelectronics.presentation.mvvm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.cyberelectronics.R
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.cyberelectronics.databinding.EmailBinding

class EmailFragment : Fragment(R.layout.email) {

    private val binding: EmailBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.EmailBack.setOnClickListener {
            findNavController().navigate(R.id.action_emailFragment_to_loginFragment)
        }

        binding.EmailBtn.setOnClickListener {
            findNavController().navigate(R.id.action_emailFragment_to_codeFragment)
        }
    }
}
