package com.example.alkewalletandroid.View

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.alkewalletandroid.R
import com.example.alkewalletandroid.databinding.ActivityMain1Binding


class MainActivity1 : AppCompatActivity() {
    private lateinit var binding: ActivityMain1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain1Binding.inflate(layoutInflater)
        setContentView(binding.getRoot())

        findViewById<ImageView>(R.id.imageView)

        binding.imageView.setOnClickListener {
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)



        }

    }
}
