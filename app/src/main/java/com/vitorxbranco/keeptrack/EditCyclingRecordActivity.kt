package com.vitorxbranco.keeptrack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vitorxbranco.keeptrack.databinding.ActivityEditCyclingRecordBinding

class EditCyclingRecordActivity : AppCompatActivity() {

    private lateinit var binding : ActivityEditCyclingRecordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditCyclingRecordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val type = intent.getStringExtra("type")

        title = "Registro - $type"
    }
}