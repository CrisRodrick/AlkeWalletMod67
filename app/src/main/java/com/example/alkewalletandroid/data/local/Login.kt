package com.example.alkewalletandroid.data.local


data class LoginRequest(var email: String, var password: String)

data class LoginResponse(var accessToken: String)