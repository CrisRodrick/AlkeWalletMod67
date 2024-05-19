package com.example.alkewalletandroid.ViewModel

import android.app.Activity
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.alkewalletandroid.Model.Model2

//Creación de `LiveData` en el `ViewModel2`

    class ViewModel2(private val model: Model2) : ViewModel() {
        private val _actividadDestino = MutableLiveData<Class<out Activity>>()
        val actividadDestino: LiveData<Class<out Activity>> = _actividadDestino

        fun determinarActividadSiguiente(parametro: Int) {
            val siguienteActividad = model.determinarActividadSiguiente(parametro)
            _actividadDestino.value = siguienteActividad
        }
    }







