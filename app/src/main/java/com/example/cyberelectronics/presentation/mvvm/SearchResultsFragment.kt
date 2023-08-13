package com.example.cyberelectronics.presentation.mvvm

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.cyberelectronics.R
import com.example.cyberelectronics.databinding.SearchResultsBinding

class SearchResultsFragment : Fragment(R.layout.search_results) {
    private val binding: SearchResultsBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.ResultBack.setOnClickListener {
            findNavController().navigate(R.id.action_SearchResultsFragment_to_SearchFragment)
        }

        binding.ibtnFFirst1.setOnClickListener {
            findNavController().navigate(R.id.action_SearchResultsFragment_to_ProductFragment)
        }
        binding.ibtnFFirst2.setOnClickListener {
            findNavController().navigate(R.id.action_SearchResultsFragment_to_ProductFragment)
        }
        binding.ibtnFFirst3.setOnClickListener {
            findNavController().navigate(R.id.action_SearchResultsFragment_to_ProductFragment)
        }
        binding.ibtnFFirst4.setOnClickListener {
            findNavController().navigate(R.id.action_SearchResultsFragment_to_ProductFragment)
        }
        binding.ibtnFFirst5.setOnClickListener {
            findNavController().navigate(R.id.action_SearchResultsFragment_to_ProductFragment)
        }
        binding.ibtnFFirst6.setOnClickListener {
            findNavController().navigate(R.id.action_SearchResultsFragment_to_ProductFragment)
        }

        binding.CButton.setOnClickListener {
            findNavController().navigate(R.id.action_SearchResultsFragment_to_BinFragment)
        }
    }
}