package com.example.cyberelectronics.presentation.mvvm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.cyberelectronics.R
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.cyberelectronics.databinding.CategoryList2Binding

class CategoryList2Fragment : Fragment(R.layout.category_list2) {

    private val binding: CategoryList2Binding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.List2Back.setOnClickListener {
            findNavController().navigate(R.id.action_CategoryList2Fragment_to_CategoryList1Fragment)
        }
    }
}