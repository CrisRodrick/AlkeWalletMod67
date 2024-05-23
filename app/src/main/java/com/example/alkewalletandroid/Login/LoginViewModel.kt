package com.example.alkewalletandroid.Login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class LoginViewModel : ViewModel (){

    private val _email = MutableLiveData <String?>()
    val email : LiveData<String?> get() = _email

    private val _contrasena = MutableLiveData <String?>()
    val contrasena : LiveData<String?> get() = _contrasena

    private val _validarUsuario = MutableLiveData<Boolean>()
    val validarUsuario: LiveData<Boolean> get() = _validarUsuario

    fun validar (email:String, contrasena:String){

        _email.value = email
        _contrasena.value = contrasena
        validarUsuario()
    }

    private fun validarUsuario(){

        val usuarioValido = !(_email.value.isNullOrEmpty() || _contrasena.value.isNullOrEmpty())


        _validarUsuario.value= usuarioValido
    }
    }


