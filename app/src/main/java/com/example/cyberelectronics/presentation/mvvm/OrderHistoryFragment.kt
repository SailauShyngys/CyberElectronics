package com.example.cyberelectronics.presentation.mvvm

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.cyberelectronics.R
import com.example.cyberelectronics.databinding.OrderHistoryBinding

class OrderHistoryFragment : Fragment(R.layout.order_history) {
    private val binding: OrderHistoryBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.orderhistoryBack.setOnClickListener {
            findNavController().navigate(R.id.action_OrderHistoryFragment_to_ProfileFragment)
        }
        binding.historybtn1.setOnClickListener {
            findNavController().navigate(R.id.action_OrderHistoryFragment_to_OrderDetailsFragment)
        }
        binding.historybtn2.setOnClickListener {
            findNavController().navigate(R.id.action_OrderHistoryFragment_to_OrderDetailsFragment)
        }
        binding.historybtn3.setOnClickListener {
            findNavController().navigate(R.id.action_OrderHistoryFragment_to_OrderDetailsFragment)
        }


    }
}