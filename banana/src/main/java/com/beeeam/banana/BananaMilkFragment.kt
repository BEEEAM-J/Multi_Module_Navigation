package com.beeeam.banana

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.core.net.toUri
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.fragment.findNavController
import com.beeeam.banana.databinding.FragmentBananaMilkBinding

class BananaMilkFragment : Fragment() {

    private lateinit var binding: FragmentBananaMilkBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentBananaMilkBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireActivity().onBackPressedDispatcher.addCallback(object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                findNavController().popBackStack()
            }
        })

        binding.tvRecommendDurianCookie.setOnClickListener {
            val request = NavDeepLinkRequest.Builder
                .fromUri("durian://fragmentDurianCookie".toUri())
                .build()
            findNavController().navigate(request)
        }
    }
}