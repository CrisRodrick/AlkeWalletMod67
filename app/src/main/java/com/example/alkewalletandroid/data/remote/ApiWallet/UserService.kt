package com.example.alkewalletandroid.data.remote.ApiWallet

import com.example.alkewalletandroid.data.remote.FromInternet.ProfileResponse
import retrofit2.Response
import retrofit2.http.GET

interface UserService {
    @GET("/auth/me")
    suspend fun getUser(): Response<ProfileResponse>
}