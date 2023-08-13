package com.example.cyberelectronics.presentation.mvvm

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.cyberelectronics.R
import com.example.cyberelectronics.databinding.RefundPageBinding

class RefundFragment : Fragment(R.layout.profile) {
    private val binding: RefundPageBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.RefundBack.setOnClickListener {
            findNavController().navigate(R.id.action_RefundFragment_to_OrderDetailsFragment)
        }
        binding.RefundBTN.setOnClickListener {
            findNavController().navigate(R.id.action_RefundFragment_to_MainFragment)
        }

    }
}