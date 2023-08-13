package com.example.cyberelectronics.presentation.mvvm

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.cyberelectronics.R
import com.example.cyberelectronics.databinding.PaymentBinding

class PaymentFragment : Fragment(R.layout.payment) {
    private val binding: PaymentBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.paymentBack.setOnClickListener {
            findNavController().navigate(R.id.action_PaymentFragment_to_ProductFragment)
        }
        binding.address.setOnClickListener {
            findNavController().navigate(R.id.action_PaymentFragment_to_AddressAddFragment)
        }
        binding.payment.setOnClickListener {
            findNavController().navigate(R.id.action_PaymentFragment_to_PaymentMethodsFragment)
        }
        binding.btnPay.setOnClickListener {
            findNavController().navigate(R.id.action_PaymentFragment_to_PayApprovingFragment)
        }
    }
}