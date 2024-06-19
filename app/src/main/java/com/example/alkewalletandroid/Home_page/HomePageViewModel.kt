package com.example.alkewalletandroid.Home_page

import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.alkewalletandroid.data.local.HomePage


//Creacion de LiveData

class HomePageViewModel (private val model: HomePage) : ViewModel(){
    private val _actividadDestino = MutableLiveData<Class<out Fragment>>()
    val actividadDestino: LiveData<Class<out Fragment>> = _actividadDestino

    fun determinarActividadSiguiente(parametro: Int) {
        val siguienteActividad = model.determinarActividadSiguiente(parametro)
        _actividadDestino.value = siguienteActividad
    }

}