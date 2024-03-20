package com.beeeam.durian

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.core.net.toUri
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.beeeam.durian.databinding.FragmentDurianCookieBinding

class DurianCookieFragment : Fragment() {

    private lateinit var binding: FragmentDurianCookieBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentDurianCookieBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireActivity().onBackPressedDispatcher.addCallback(object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                findNavController().popBackStack()
            }
        })

        binding.tvRecommendBananaMilk.setOnClickListener {
            val request = NavDeepLinkRequest.Builder
                .fromUri("banana://fragmentBananaMilk".toUri())
                .build()
            findNavController().navigate(request)
        }
    }
}