package com.example.alkewalletandroid.Login_singup

import androidx.fragment.app.Fragment
import com.example.alkewalletandroid.Login.LoginFragment
import com.example.alkewalletandroid.Singup.Fragment_singup


class Model_login_singup {
    fun determinarActividadSiguiente(parametro: Int): Class<out Fragment> {
        return when (parametro) {
            1 -> Fragment_singup::class.java
            2 -> LoginFragment::class.java
            else -> Fragment_login_singup::class.java
        }
    }

}