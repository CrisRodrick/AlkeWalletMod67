package com.example.alkewalletandroid.Login

import android.provider.ContactsContract.CommonDataKinds.Email

data class LoginModel (
    val nombre: String,
    val apellido: String,
    val email: String?,
    val clave : String?


)