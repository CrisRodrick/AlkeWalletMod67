package com.example.alkewalletandroid

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.alkewalletandroid.R
import com.example.alkewalletandroid.databinding.ActivityVisorBinding
import com.example.alkewalletandroid.databinding.FragmentLoginBinding

class visor : AppCompatActivity() {

    private lateinit var binding: ActivityVisorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityVisorBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}