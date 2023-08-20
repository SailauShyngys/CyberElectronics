package com.example.cyberelectronics.presentation.mvvm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.cyberelectronics.R
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.cyberelectronics.databinding.NewPasswordBinding

class NewPassFragment : Fragment(R.layout.new_password) {

    private val binding: NewPasswordBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.NewPassBack.setOnClickListener {
            findNavController().navigate(R.id.action_newPassFragment_to_codeFragment)
        }

        binding.NewPassBtn.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_AutorithationFragment)
        }
    }
}
