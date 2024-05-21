package com.example.alkewalletandroid.Login_singup

import androidx.fragment.app.Fragment
import com.example.alkewalletandroid.Login.Fragment_login
import com.example.alkewalletandroid.Singup.Fragment_singup
import com.example.alkewalletandroid.databinding.FragmentLoginBinding
import com.example.alkewalletandroid.databinding.FragmentLoginSingupBinding
import com.example.alkewalletandroid.databinding.FragmentSingupBinding


class Model_login_singup {
    fun determinarActividadSiguiente(parametro: Int): Class<out Fragment> {
        return when (parametro) {
            1 -> Fragment_singup::class.java
            2 -> Fragment_login::class.java
            else -> Fragment_login_singup::class.java
        }
    }

}