package com.example.alkewalletandroid.Send_money

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SendViewModel: ViewModel (){
    private val _transferencia = MutableLiveData <String?>()
    val transferencia: LiveData<String?> get() = _transferencia

    private val _notas = MutableLiveData <String?>()
    val notas: LiveData<String?> get() = _notas

    private val _validarIngresos = MutableLiveData<Boolean>()
    val validarIngresos: LiveData<Boolean> get() = _validarIngresos

    fun validar (transferencia:String, notas:String){

        _transferencia.value = transferencia
        _notas.value = notas
        validarIngresos()
    }
    private fun validarIngresos(){

        val ingresoValido = !(_transferencia.value.isNullOrEmpty() || _notas.value.isNullOrEmpty())


        _validarIngresos.value= ingresoValido
    }


}