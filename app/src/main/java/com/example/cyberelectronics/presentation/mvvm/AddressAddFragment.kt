package com.example.cyberelectronics.presentation.mvvm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.cyberelectronics.R
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.cyberelectronics.databinding.AddAddressBinding

class AddressAddFragment : Fragment(R.layout.add_address) {
    private val binding: AddAddressBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.addressBack.setOnClickListener {
            findNavController().navigate(R.id.action_AddressAddFragment_to_ProfileFragment)
        }

        binding.addressBtn.setOnClickListener {
            findNavController().navigate(R.id.action_AddressAddFragment_to_ProfileFragmentsave)
        }
    }
}