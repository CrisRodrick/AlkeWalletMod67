package com.example.alkewalletandroid.data.remote.FromInternet

data class Result<T>(
    val success: T? = null,
    val error: Int? = null,
    val loading: Boolean = false
)