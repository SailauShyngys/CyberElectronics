package com.example.cyberelectronics.presentation.mvvm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.cyberelectronics.R
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.cyberelectronics.databinding.CategoryList1Binding

class CategoryList1Fragment : Fragment(R.layout.category_list1) {

    private val binding: CategoryList1Binding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.List1Back.setOnClickListener {
            findNavController().navigate(R.id.action_CategoryList1Fragment_to_MainFragment)
        }

        binding.List2Next.setOnClickListener {
            findNavController().navigate(R.id.action_CategoryList1Fragment_to_CategoryList2Fragment)
        }
    }
}