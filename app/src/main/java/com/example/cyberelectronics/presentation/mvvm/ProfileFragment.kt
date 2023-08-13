package com.example.cyberelectronics.presentation.mvvm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.cyberelectronics.R
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.cyberelectronics.databinding.ProfileBinding

class ProfileFragment : Fragment(R.layout.profile) {

    private val binding: ProfileBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.Back.setOnClickListener {
            findNavController().navigate(R.id.action_profileFragment_to_MainFragment)
        }
        binding.exitbtn.setOnClickListener {
            findNavController().navigate(R.id.action_profileFragment_to_menuFragment)
        }
        binding.historybtn.setOnClickListener {
            findNavController().navigate(R.id.action_profileFragment_to_OrderHistoryFragment)
        }
        binding.editbtn.setOnClickListener {
            findNavController().navigate(R.id.action_profileFragment_to_EditProfileFragment)
        }
        binding.paymentbtn.setOnClickListener {
            findNavController().navigate(R.id.action_profileFragment_to_PaymentMethodsFragment)
        }
        binding.addressbtn.setOnClickListener {
            findNavController().navigate(R.id.action_profileFragment_to_AddressAddFragment)
        }
    }
}
