package com.example.activitylifecycletest

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.activitylifecycletest.databinding.ActivityMainBinding
import com.example.activitylifecycletest.databinding.ActivityNormalBinding

class NormalActivity : AppCompatActivity() {
    lateinit var binding: ActivityNormalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityNormalBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}