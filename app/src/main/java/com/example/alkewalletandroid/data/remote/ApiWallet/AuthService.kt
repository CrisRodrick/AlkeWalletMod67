package com.example.alkewalletandroid.data.remote.ApiWallet

import com.example.alkewalletandroid.data.remote.FromInternet.LoginRequest
import com.example.alkewalletandroid.data.remote.FromInternet.LoginResponse
import com.example.alkewalletandroid.data.remote.FromInternet.SignupRequest
import com.example.alkewalletandroid.data.remote.FromInternet.SignupResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthService {
    @POST("/auth/login")
    suspend fun login(@Body request: LoginRequest): Response<LoginResponse>

    @POST("/users")
    suspend fun signup(@Body request: SignupRequest): Response<SignupResponse>
}