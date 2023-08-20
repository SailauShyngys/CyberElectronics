package com.example.cyberelectronics.presentation.mvvm

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.cyberelectronics.R
import com.example.cyberelectronics.databinding.SearchPageBinding

class SearchFragment : Fragment(R.layout.search_page) {
    private val binding: SearchPageBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.arrowBack.setOnClickListener {
            findNavController().navigate(R.id.action_SearchFragment_to_MainFragment)
        }

        binding.searchResults1.setOnClickListener {
            findNavController().navigate(R.id.action_SearchFragment_to_SearchResultsFragment)
        }
        binding.searchResults2.setOnClickListener {
            findNavController().navigate(R.id.action_SearchFragment_to_SearchResultsFragment)
        }
        binding.searchResults3.setOnClickListener {
            findNavController().navigate(R.id.action_SearchFragment_to_SearchResultsFragment)
        }
        binding.searchResults4.setOnClickListener {
            findNavController().navigate(R.id.action_SearchFragment_to_SearchResultsFragment)
        }
        binding.searchResults5.setOnClickListener {
            findNavController().navigate(R.id.action_SearchFragment_to_SearchResultsFragment)
        }
        binding.searchResults6.setOnClickListener {
            findNavController().navigate(R.id.action_SearchFragment_to_SearchResultsFragment)
        }
        binding.searchResults7.setOnClickListener {
            findNavController().navigate(R.id.action_SearchFragment_to_SearchResultsFragment)
        }
        binding.searchResults8.setOnClickListener {
            findNavController().navigate(R.id.action_SearchFragment_to_SearchResultsFragment)
        }
        binding.searchResults9.setOnClickListener {
            findNavController().navigate(R.id.action_SearchFragment_to_SearchResultsFragment)
        }
    }
}