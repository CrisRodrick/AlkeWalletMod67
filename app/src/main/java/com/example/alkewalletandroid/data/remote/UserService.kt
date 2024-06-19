package com.example.alkewalletandroid.data.remote

import com.example.alkewalletandroid.data.local.ProfileResponse
import retrofit2.Response
import retrofit2.http.GET

interface UserService {
    @GET("/auth/me")
    suspend fun getUser(): Response<ProfileResponse>
}