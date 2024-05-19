package com.example.alkewalletandroid.Model

import android.app.Activity
import com.example.alkewalletandroid.View.MainActivity2
import com.example.alkewalletandroid.View.MainActivity3
import com.example.alkewalletandroid.View.MainActivity4


class Model2 {
    fun determinarActividadSiguiente(parametro: Int): Class<out Activity> {
        return when (parametro) {
            1 -> MainActivity4::class.java
            2 -> MainActivity3::class.java
            else -> MainActivity2::class.java
        }
    }

}