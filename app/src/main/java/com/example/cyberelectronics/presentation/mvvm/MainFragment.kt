package com.example.cyberelectronics.presentation.mvvm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.cyberelectronics.R
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.cyberelectronics.databinding.MainPageBinding

class MainFragment : Fragment(R.layout.main_page) {

    private val binding: MainPageBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.Himage1.setOnClickListener {
            findNavController().navigate(R.id.action_MainFragment_to_binFragment)
        }

        binding.Himage3.setOnClickListener {
            findNavController().navigate(R.id.action_MainFragment_to_profileFragment)
        }

        binding.tvViewAll.setOnClickListener {
            findNavController().navigate(R.id.action_MainFragment_to_CategoryList1Fragment)
        }

        binding.PowerUnit.setOnClickListener {
            findNavController().navigate(R.id.action_MainFragment_to_CategoryFragment)
        }
        binding.Lamps.setOnClickListener {
            findNavController().navigate(R.id.action_MainFragment_to_CategoryFragment)
        }
        binding.Keyboards.setOnClickListener {
            findNavController().navigate(R.id.action_MainFragment_to_CategoryFragment)
        }
        binding.Stands.setOnClickListener {
            findNavController().navigate(R.id.action_MainFragment_to_CategoryFragment)
        }
        binding.Humidifiers.setOnClickListener {
            findNavController().navigate(R.id.action_MainFragment_to_CategoryFragment)
        }
        binding.Mouses.setOnClickListener {
            findNavController().navigate(R.id.action_MainFragment_to_CategoryFragment)
        }
        binding.Watches.setOnClickListener {
            findNavController().navigate(R.id.action_MainFragment_to_CategoryFragment)
        }
        binding.RGB.setOnClickListener {
            findNavController().navigate(R.id.action_MainFragment_to_CategoryFragment)
        }


    }
}
