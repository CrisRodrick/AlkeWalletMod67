package com.example.alkewalletandroid.data.remote

import com.example.alkewalletandroid.data.local.Transaction
import com.example.alkewalletandroid.data.local.TransactionsResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Url

interface TransactionService {
    @GET
    suspend fun getTransactions(@Url url: String): Response<TransactionsResponse>

    @POST("/transactions")
    suspend fun createTransaction(@Body transaction: Transaction): Response<Transaction>
}