package com.example.cyberelectronics.presentation.mvvm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.cyberelectronics.R
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.cyberelectronics.databinding.PayApprovingBinding

class PayApprovingFragment : Fragment(R.layout.pay_approving) {

    private val binding: PayApprovingBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnNo.setOnClickListener {
            findNavController().navigate(R.id.action_payapprovingFragment_to_PaymentFragment)
        }

        binding.btnYes.setOnClickListener {
            findNavController().navigate(R.id.action_payapprovingFragment_to_payedFragment)
        }
    }

}