package com.example.cyberelectronics.presentation.mvvm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.cyberelectronics.R
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.cyberelectronics.databinding.CategoryPageBinding

class CategoryFragment : Fragment(R.layout.category_list2) {

    private val binding: CategoryPageBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.arrowBack.setOnClickListener {
            findNavController().navigate(R.id.action_CategoryFragment_to_MainFragment)
        }
        binding.TopLine.setOnClickListener {
            findNavController().navigate(R.id.action_CategoryFragment_to_ProductFragment)
        }
        binding.TopLine2.setOnClickListener {
            findNavController().navigate(R.id.action_CategoryFragment_to_ProductFragment)
        }
        binding.TopLine3.setOnClickListener {
            findNavController().navigate(R.id.action_CategoryFragment_to_ProductFragment)
        }
        binding.TopLine4.setOnClickListener {
            findNavController().navigate(R.id.action_CategoryFragment_to_ProductFragment)
        }
        binding.TopLine5.setOnClickListener {
            findNavController().navigate(R.id.action_CategoryFragment_to_ProductFragment)
        }
        binding.TopLine6.setOnClickListener {
            findNavController().navigate(R.id.action_CategoryFragment_to_ProductFragment)
        }
        binding.ibtnFFirst.setOnClickListener {
            findNavController().navigate(R.id.action_CategoryFragment_to_ProductFragment)
        }
        binding.ibtnFFirst2.setOnClickListener {
            findNavController().navigate(R.id.action_CategoryFragment_to_ProductFragment)
        }
        binding.ibtnFFirst3.setOnClickListener {
            findNavController().navigate(R.id.action_CategoryFragment_to_ProductFragment)
        }
        binding.ibtnFFirst4.setOnClickListener {
            findNavController().navigate(R.id.action_CategoryFragment_to_ProductFragment)
        }
        binding.ibtnFFirst5.setOnClickListener {
            findNavController().navigate(R.id.action_CategoryFragment_to_ProductFragment)
        }
        binding.ibtnFFirst6.setOnClickListener {
            findNavController().navigate(R.id.action_CategoryFragment_to_ProductFragment)
        }
        binding.cart.setOnClickListener {
            findNavController().navigate(R.id.action_CategoryFragment_to_BinFragment)
        }

    }
}