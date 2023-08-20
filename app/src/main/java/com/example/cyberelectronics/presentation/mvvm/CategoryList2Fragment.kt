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

        binding.binBack.setOnClickListener {
            findNavController().navigate(R.id.action_CategoryList2Fragment_to_CategoryList1Fragment)
        }
        binding.BTNcateg13.setOnClickListener {
            findNavController().navigate(R.id.action_CategoryList2Fragment_to_CategoryFragment)
        }
        binding.BTNcateg14.setOnClickListener {
            findNavController().navigate(R.id.action_CategoryList2Fragment_to_CategoryFragment)
        }
        binding.BTNcateg15.setOnClickListener {
            findNavController().navigate(R.id.action_CategoryList2Fragment_to_CategoryFragment)
        }
        binding.BTNcateg16.setOnClickListener {
            findNavController().navigate(R.id.action_CategoryList2Fragment_to_CategoryFragment)
        }
        binding.BTNcateg17.setOnClickListener {
            findNavController().navigate(R.id.action_CategoryList2Fragment_to_CategoryFragment)
        }
        binding.BTNcateg18.setOnClickListener {
            findNavController().navigate(R.id.action_CategoryList2Fragment_to_CategoryFragment)
        }
        binding.BTNcateg19.setOnClickListener {
            findNavController().navigate(R.id.action_CategoryList2Fragment_to_CategoryFragment)
        }
        binding.BTNcateg20.setOnClickListener {
            findNavController().navigate(R.id.action_CategoryList2Fragment_to_CategoryFragment)
        }
        binding.BTNcateg21.setOnClickListener {
            findNavController().navigate(R.id.action_CategoryList2Fragment_to_CategoryFragment)
        }
        binding.BTNcateg22.setOnClickListener {
            findNavController().navigate(R.id.action_CategoryList2Fragment_to_CategoryFragment)
        }
        binding.BTNcateg23.setOnClickListener {
            findNavController().navigate(R.id.action_CategoryList2Fragment_to_CategoryFragment)
        }
        binding.BTNcateg24.setOnClickListener {
            findNavController().navigate(R.id.action_CategoryList2Fragment_to_CategoryFragment)
        }
    }
}