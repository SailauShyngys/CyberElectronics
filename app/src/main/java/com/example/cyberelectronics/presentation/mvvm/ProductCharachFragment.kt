package com.example.cyberelectronics.presentation.mvvm

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.cyberelectronics.R
import com.example.cyberelectronics.databinding.ProductViewCharacteristicBinding

class ProductCharachFragment : Fragment(R.layout.product_view_characteristic) {
    private val binding: ProductViewCharacteristicBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.arrow.setOnClickListener {
            findNavController().navigate(R.id.action_ProductCharachFragment_to_ProductFragment)
        }
        binding.ibtnFFirst.setOnClickListener {
            findNavController().navigate(R.id.action_ProductCharachFragment_to_ProductFragment)
        }
        binding.ibtnFFirst2.setOnClickListener {
            findNavController().navigate(R.id.action_ProductCharachFragment_to_ProductFragment)
        }
        binding.TopLine.setOnClickListener {
            findNavController().navigate(R.id.action_ProductCharachFragment_to_ProductFragment)
        }
        binding.TopLine2.setOnClickListener {
            findNavController().navigate(R.id.action_ProductCharachFragment_to_ProductFragment)
        }
    }
}