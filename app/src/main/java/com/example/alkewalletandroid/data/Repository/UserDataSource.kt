package com.example.alkewalletandroid.data.Repository

import android.util.Log
import com.example.alkewalletandroid.data.remote.ApiWallet.AuthService
import com.example.alkewalletandroid.data.remote.ApiWallet.UserService
import com.example.alkewalletandroid.data.remote.FromInternet.LoginRequest
import com.example.alkewalletandroid.data.remote.FromInternet.SignupRequest
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class UserDataSource @Inject constructor(
    private val authService: AuthService,
    private val userService: UserService
) {

    fun login(email: String, password: String) = flow {
        emit(authService.login(LoginRequest(email, password)))
    }.catch {
        Log.e(this.javaClass.name, "Login failed", it)
    }.flowOn(Dispatchers.IO)

    fun signup(name: String, lastName: String, email: String, password: String) = flow {
        val request = SignupRequest(
            name = name,
            lastName = lastName,
            email = email,
            password = password,
            roleId = 2,
            points = 0
        )
        emit(authService.signup(request))
    }.catch {
        Log.e(this.javaClass.name, "Signup failed", it)
    }.flowOn(Dispatchers.IO)

    fun profile() = flow {
        emit(userService.getUser())
    }.catch {
        Log.e(this.javaClass.name, "Retrieve profile failed", it)
    }.flowOn(Dispatchers.IO)
}