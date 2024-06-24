package com.example.alkewalletandroid.data.remote.FromInternet

import androidx.fragment.app.Fragment
import com.example.alkewalletandroid.Home_page.Fragment_home_page
import com.example.alkewalletandroid.Profile.Fragment_profile
import com.example.alkewalletandroid.Request_money.Fragment_request_money
import com.example.alkewalletandroid.Send_money.Fragment_send_money


class HomePage {
    fun determinarActividadSiguiente(parametro: Int): Class<out Fragment> {
        return when (parametro) {
            1 -> Fragment_send_money::class.java
            2 -> Fragment_request_money::class.java
            3 -> Fragment_profile::class.java
            else -> Fragment_home_page::class.java
        }
    }

}