package com.example.cyberelectronics.presentation.mvvm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.cyberelectronics.R
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.cyberelectronics.databinding.EmailCodeBinding

class EmailCodeFragment : Fragment(R.layout.email_code) {

    private val binding: EmailCodeBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.CodeBack.setOnClickListener {
            findNavController().navigate(R.id.action_codeFragment_to_emailFragment)
        }

        binding.CodeBtn.setOnClickListener {
            findNavController().navigate(R.id.action_codeFragment_to_newPassFragment)
        }
    }
}
