package com.example.alkewalletandroid.data.remote.FromInternet


data class LoginRequest(var email: String, var password: String)

data class LoginResponse(var accessToken: String)