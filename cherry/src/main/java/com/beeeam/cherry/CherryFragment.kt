package com.beeeam.cherry

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.beeeam.cherry.databinding.FragmentCherryBinding

class CherryFragment : Fragment() {

    private lateinit var binding: FragmentCherryBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentCherryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            tvCherry.setOnClickListener {
                Log.d("Text Click Listener", "Cherry!")
                findNavController().navigate(R.id.action_navigation_c_to_navigation_cherry_image)
            }

            tvCherryCandy.setOnClickListener {
                Log.d("Text Click Listener", "Cherry Candy!")
                findNavController().navigate(R.id.action_navigation_c_to_navigation_cherry_candy)
            }
        }
    }
}