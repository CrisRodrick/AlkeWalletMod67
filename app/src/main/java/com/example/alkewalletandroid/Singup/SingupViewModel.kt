package com.example.alkewalletandroid.Singup

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SingupViewModel : ViewModel() {
    private val _nombre = MutableLiveData <String?>()
    val nombre : LiveData<String?> get() = _nombre

    private val _apellido = MutableLiveData <String?>()
    val apellido : LiveData<String?> get() = _apellido

    private val _email = MutableLiveData <String?>()
    val email : LiveData<String?> get() = _email

    private val _contrasena = MutableLiveData <String?>()
    val contrasena : LiveData<String?> get() = _contrasena

    private val _recontrasena = MutableLiveData <String?>()
    val recontrasena : LiveData<String?> get() = _recontrasena

    private val _validarUsuario = MutableLiveData<Boolean>()
    val validarUsuario: LiveData<Boolean> get() = _validarUsuario

    fun validar(
        nombre: String,
        apellido: String,
        email: String,
        contrasena: String,
        recontrasena: String
    ) {

        _nombre.value = nombre
        _apellido.value = apellido
        _email.value = email
        _contrasena.value = contrasena
        _recontrasena.value = recontrasena
        validarUsuario()
    }


    private fun validarUsuario() {

        val usuarioValido = !(_nombre.value.isNullOrEmpty() || _apellido.value.isNullOrEmpty()
                || _email.value.isNullOrEmpty() || _contrasena.value.isNullOrEmpty()
                || _recontrasena.value.isNullOrEmpty())

        _validarUsuario.value = usuarioValido
    }

}