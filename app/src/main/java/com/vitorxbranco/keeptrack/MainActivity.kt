package com.vitorxbranco.keeptrack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import com.vitorxbranco.keeptrack.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.commit {
            replace(R.id.frame_container, RunningFragment())
        }

        binding.buttonCycling.setOnClickListener { onCyclingClicked() }
        binding.buttonRunning.setOnClickListener { onRunningClicked() }

    }

    private fun onRunningClicked() {
        supportFragmentManager.commit {
            replace(R.id.frame_container, RunningFragment())
        }
    }

    private fun onCyclingClicked() {
        supportFragmentManager.commit {
            replace(R.id.frame_container, CyclingFragment())
        }
    }
}