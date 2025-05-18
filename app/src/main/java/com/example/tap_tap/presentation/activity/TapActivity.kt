package com.example.tap_tap.presentation.activity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.example.tap_tap.R
import com.example.tap_tap.databinding.ActivityMainBinding

class TapActivity : AppCompatActivity() {
   private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
   private val viewModel by lazy { ViewModelProvider(this)[TapViewModel::class.java] }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        viewModel.tapData.observe(this) {
            binding.tvTap.text = it.tap.toString()
        }

        binding.btnIncrement.setOnClickListener {
            viewModel.increment()
        }

        binding.btnDecrement.setOnClickListener {
            viewModel.decrement()
        }
    }
}