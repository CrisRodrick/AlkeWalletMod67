package com.example.alkewalletandroid.Request_money

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RequestViewModel: ViewModel (){
    private val _cantidad = MutableLiveData <String?>()
    val cantidad: LiveData<String?> get() = _cantidad

    private val _notas = MutableLiveData <String?>()
    val notas: LiveData<String?> get() = _notas

    private val _validarIngresos = MutableLiveData<Boolean>()
    val validarIngresos: LiveData<Boolean> get() = _validarIngresos

    fun validar (cantidad:String, notas:String){

        _cantidad.value = cantidad
        _notas.value = notas
        validarIngresos()
    }
    private fun validarIngresos(){

        val ingresoValido = !(_cantidad.value.isNullOrEmpty() || _notas.value.isNullOrEmpty())


        _validarIngresos.value= ingresoValido
    }



}