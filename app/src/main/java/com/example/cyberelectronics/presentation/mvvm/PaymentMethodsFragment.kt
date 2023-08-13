package com.example.cyberelectronics.presentation.mvvm

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.cyberelectronics.R
import com.example.cyberelectronics.databinding.PayMethodsBinding

class PaymentMethodsFragment : Fragment(R.layout.product_view_characteristic) {
    private val binding: PayMethodsBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.PaymentBack.setOnClickListener {
            findNavController().navigate(R.id.action_PaymentMethodsFragment_to_ProfileFragment)
        }
        binding.ChooseCity.setOnClickListener {
            findNavController().navigate(R.id.action_PaymentMethodsFragment_to_AddressAddFragment)
        }
        binding.PayBtn.setOnClickListener {
            findNavController().navigate(R.id.action_PaymentMethodsFragment_to_ProfileFragmentsave)
        }
    }
}