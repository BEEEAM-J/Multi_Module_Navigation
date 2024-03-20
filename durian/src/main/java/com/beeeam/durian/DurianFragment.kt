package com.beeeam.durian

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.beeeam.durian.databinding.FragmentDurianBinding

class DurianFragment : Fragment() {

    private lateinit var binding: FragmentDurianBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentDurianBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvDurianCookie.setOnClickListener {
            Log.d("Text Click Listener", "Durian Cookie!")
            findNavController().navigate(R.id.action_navigation_d_to_navigation_durian_cookie)
        }
    }
}