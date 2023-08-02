package com.example.cyberelectronics.presentation.mvvm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.cyberelectronics.R
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.cyberelectronics.databinding.BinPageBinding
import com.example.cyberelectronics.databinding.PayedPageBinding

class PayedFragment : Fragment(R.layout.payed_page) {

    private val binding: PayedPageBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnPayedBack.setOnClickListener {
            findNavController().navigate(R.id.action_payedFragment_to_MainFragment)
        }
    }

}