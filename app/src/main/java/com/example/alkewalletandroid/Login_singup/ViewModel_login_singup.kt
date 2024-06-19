package com.example.alkewalletandroid.Login_singup

import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.alkewalletandroid.data.local.LoginSingup

//Creación de `LiveData` en el `ViewModel2`

    class ViewModel_login_singup(private val model: LoginSingup) : ViewModel() {
        private val _actividadDestino = MutableLiveData<Class<out Fragment>>()
        val actividadDestino: LiveData<Class<out Fragment>> = _actividadDestino

        fun determinarActividadSiguiente(parametro: Int) {
            val siguienteActividad = model.determinarActividadSiguiente(parametro)
            _actividadDestino.value = siguienteActividad
        }
    }







