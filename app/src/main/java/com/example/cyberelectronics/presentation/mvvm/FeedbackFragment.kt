package com.example.cyberelectronics.presentation.mvvm

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.cyberelectronics.R
import com.example.cyberelectronics.databinding.FeedbackBinding

class FeedbackFragment : Fragment(R.layout.feedback) {
    private val binding: FeedbackBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.feedbackBackbtn.setOnClickListener {
            findNavController().navigate(R.id.action_FeedbackFragment_to_OrderDetailsFragment)
        }

        binding.feedbackBtn.setOnClickListener {
            findNavController().navigate(R.id.action_FeedbackFragment_to_MainFragment)
        }


    }
}