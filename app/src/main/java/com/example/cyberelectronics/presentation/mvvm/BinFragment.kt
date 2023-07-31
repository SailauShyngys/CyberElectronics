package com.example.cyberelectronics.presentation.mvvm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.cyberelectronics.R
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.cyberelectronics.databinding.BinPageBinding

class BinFragment : Fragment(R.layout.bin_page) {

    private val binding: BinPageBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.binBack.setOnClickListener {
            findNavController().navigate(R.id.action_binFragment_to_MainFragment)
        }

        binding.binBtn.setOnClickListener {
            findNavController().navigate(R.id.action_binFragment_to_payedFragment)
        }
    }
}