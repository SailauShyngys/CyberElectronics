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

        binding.categoryBack.setOnClickListener {
            findNavController().navigate(R.id.action_CategoryFragment_to_MainFragment)
        }
    }
}