package com.vitorxbranco.keeptrack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vitorxbranco.keeptrack.databinding.ActivityEditRunningRecordBinding

class EditRunningRecordActivity : AppCompatActivity() {

    private lateinit var binding : ActivityEditRunningRecordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditRunningRecordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val distance = intent.getStringExtra("Distance")

        title = "Registro - $distance"
    }
}