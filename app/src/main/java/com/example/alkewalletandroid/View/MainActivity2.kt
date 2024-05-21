package com.example.alkewalletandroid.View

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.alkewalletandroid.Login_singup.ViewModel_login_singup
import com.example.alkewalletandroid.databinding.ActivityMain2Binding
import androidx.activity.viewModels


//Observando el `LiveData` en MainActivy2

class MainActivity2 : AppCompatActivity() {

    private val viewModelLoginsingup by viewModels<ViewModel_login_singup>()
    private lateinit var binding: ActivityMain2Binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Observando el LiveData en el ViewModel2
        viewModelLoginsingup.actividadDestino.observe(this, Observer { actividad ->
            val intent = Intent(this, actividad)
            startActivity(intent)
        })

        binding.button1.setOnClickListener {
            viewModelLoginsingup.determinarActividadSiguiente(1)
        }

        binding.txt2.setOnClickListener {
            viewModelLoginsingup.determinarActividadSiguiente(2)
        }
    }
}



