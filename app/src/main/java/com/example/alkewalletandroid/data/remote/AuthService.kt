package com.example.alkewalletandroid.data.remote

import com.example.alkewalletandroid.data.local.LoginRequest
import com.example.alkewalletandroid.data.local.LoginResponse
import com.example.alkewalletandroid.data.local.SignupRequest
import com.example.alkewalletandroid.data.local.SignupResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthService {
    @POST("/auth/login")
    suspend fun login(@Body request: LoginRequest): Response<LoginResponse>

    @POST("/users")
    suspend fun signup(@Body request: SignupRequest): Response<SignupResponse>
}