package com.beeeam.apple

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.core.net.toUri
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.fragment.findNavController
import com.beeeam.apple.databinding.FragmentApplePieBinding

class ApplePieFragment : Fragment() {

    private lateinit var binding: FragmentApplePieBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentApplePieBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireActivity().onBackPressedDispatcher.addCallback(object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                findNavController().popBackStack()
            }
        })

        binding.tvRecommendCherry.setOnClickListener {
            val request = NavDeepLinkRequest.Builder
                .fromUri("cherry://fragmentCherryImage".toUri())
                .build()
            findNavController().navigate(request)
        }
    }
}