package com.example.cyberelectronics.presentation.mvvm

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.cyberelectronics.R
import com.example.cyberelectronics.databinding.ProductViewBinding

class ProductFragment : Fragment(R.layout.product_view){
    private val binding: ProductViewBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.ProductBack.setOnClickListener {
            findNavController().navigate(R.id.action_ProductFragment_to_MainFragment)
        }
        binding.arrow.setOnClickListener {
            findNavController().navigate(R.id.action_ProductFragment_to_MainFragment)
        }
        binding.viewAll.setOnClickListener {
            findNavController().navigate(R.id.action_ProductFragment_to_ProductCharachFragment)
        }
        binding.AddProductBtn.setOnClickListener {
            findNavController().navigate(R.id.action_ProductFragment_to_BinFragment_add)
        }
        binding.ProductBtn.setOnClickListener {
            findNavController().navigate(R.id.action_ProductFragment_to_BinFragment)
        }
    }
}