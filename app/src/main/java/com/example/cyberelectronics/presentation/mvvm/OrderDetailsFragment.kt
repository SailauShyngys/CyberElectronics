package com.example.cyberelectronics.presentation.mvvm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.cyberelectronics.R
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.cyberelectronics.databinding.OrderDetailsBinding


class OrderDetailsFragment : Fragment(R.layout.order_details) {

    private val binding: OrderDetailsBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.Back.setOnClickListener {
            findNavController().navigate(R.id.action_OrderDetailsFragment_to_MainFragment)
        }
        binding.RepeatBTN.setOnClickListener {
            findNavController().navigate(R.id.action_OrderDetailsFragment_to_BinFragment)
        }
        binding.RefundBTN.setOnClickListener {
            findNavController().navigate(R.id.action_OrderDetailsFragment_to_RefundFragment)
        }
        binding.FeedbackBTN.setOnClickListener {
            findNavController().navigate(R.id.action_OrderDetailsFragment_to_FeedbackFragment)
        }
        binding.ibtnFFirst.setOnClickListener {
            findNavController().navigate(R.id.action_OrderDetailsFragment_to_ProductFragment)
        }
        binding.ibtnFFirst2.setOnClickListener {
            findNavController().navigate(R.id.action_OrderDetailsFragment_to_ProductFragment)
        }

    }
}
