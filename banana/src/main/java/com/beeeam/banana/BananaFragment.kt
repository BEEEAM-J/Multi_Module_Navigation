package com.beeeam.banana

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.beeeam.banana.databinding.FragmentBananaBinding

class BananaFragment : Fragment() {

    private lateinit var binding: FragmentBananaBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentBananaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            tvBananaBread.setOnClickListener {
                Log.d("Text Click Listener", "Banana Bread!")
                findNavController().navigate(R.id.action_navigation_b_to_navigation_banana_bread)
            }

            tvBananaMilk.setOnClickListener {
                Log.d("Text Click Listener", "Banana Milk!")
                findNavController().navigate(R.id.action_navigation_b_to_navigation_banana_milk)
            }
        }
    }
}