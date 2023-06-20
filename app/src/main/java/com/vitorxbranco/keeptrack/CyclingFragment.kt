package com.vitorxbranco.keeptrack

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.vitorxbranco.keeptrack.databinding.FragmentCyclingBinding

class CyclingFragment : Fragment() {

    private lateinit var binding: FragmentCyclingBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCyclingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupClickListeners()
    }

    private fun setupClickListeners() {
        binding.containerLongestRide.setOnClickListener { launchRunningRecordScreen("Corrida mais longa") }
        binding.containerBiggestClimb.setOnClickListener { launchRunningRecordScreen("Maior altitude") }
        binding.containerBestSpeed.setOnClickListener { launchRunningRecordScreen("Melhor velocidade média") }
    }

    private fun launchRunningRecordScreen(type: String) {
        val intent = Intent(context, EditCyclingRecordActivity::class.java)
        intent.putExtra("type", type)
        startActivity(intent)
    }

}