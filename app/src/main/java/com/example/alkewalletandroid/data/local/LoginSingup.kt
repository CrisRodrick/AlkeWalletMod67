package com.example.alkewalletandroid.data.local

import androidx.fragment.app.Fragment
import com.example.alkewalletandroid.Login.Fragment_login
import com.example.alkewalletandroid.Login_singup.Fragment_login_singup
import com.example.alkewalletandroid.Singup.SingupFragment


class LoginSingup {
    fun determinarActividadSiguiente(parametro: Int): Class<out Fragment> {
        return when (parametro) {
            1 -> SingupFragment::class.java
            2 -> Fragment_login::class.java
            else -> Fragment_login_singup::class.java
        }
    }

}