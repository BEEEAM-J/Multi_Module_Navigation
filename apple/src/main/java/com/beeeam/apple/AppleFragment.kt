package com.beeeam.apple

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.beeeam.apple.databinding.FragmentAppleBinding

class AppleFragment : Fragment() {

    private lateinit var binding : FragmentAppleBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentAppleBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            tvAppleJuice.setOnClickListener {
                Log.d("Text Click Listener", "Apple Juice!")
                findNavController().navigate(R.id.action_navigation_a_to_navigation_apple_juice)
            }

            tvApplePie.setOnClickListener {
                Log.d("Text Click Listener", "Apple Pie!")
                findNavController().navigate(R.id.action_navigation_a_to_navigation_apple_pie)
            }
        }
    }
}
