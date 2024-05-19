package com.example.alkewalletandroid.View

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.alkewalletandroid.ViewModel.ViewModel2
import com.example.alkewalletandroid.databinding.ActivityMain2Binding
import androidx.activity.viewModels


//Observando el `LiveData` en MainActivy2

class MainActivity2 : AppCompatActivity() {

    private val viewModel2 by viewModels<ViewModel2>()
    private lateinit var binding: ActivityMain2Binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Observando el LiveData en el ViewModel2
        viewModel2.actividadDestino.observe(this, Observer { actividad ->
            val intent = Intent(this, actividad)
            startActivity(intent)
        })

        binding.button1.setOnClickListener {
            viewModel2.determinarActividadSiguiente(1)
        }

        binding.txt2.setOnClickListener {
            viewModel2.determinarActividadSiguiente(2)
        }
    }
}



