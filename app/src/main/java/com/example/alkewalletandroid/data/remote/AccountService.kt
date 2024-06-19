package com.example.alkewalletandroid.data.remote

import android.accounts.Account
import retrofit2.Response
import retrofit2.http.GET

interface AccountService {
    @GET("/accounts/me")
    suspend fun getAccounts(): Response<List<Account>>
}