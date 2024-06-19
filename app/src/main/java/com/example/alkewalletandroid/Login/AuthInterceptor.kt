package com.example.alkewalletandroid.Login

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.tasks.await
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class AuthInterceptor @Inject constructor(private val sessionManager: com.example.alkewalletandroid.Login.SessionManager) :
    Interceptor {
    private lateinit var auth: FirebaseAuth

   /* override fun intercept(chain: Interceptor.Chain): Response {
        val token = runBlocking {
            sessionManager.getToken()
        }
        val request = chain.request().newBuilder()
        request.addHeader("Authorization", "Bearer $token")
        return chain.proceed(request.build())
    }*/

    override fun intercept(chain: Interceptor.Chain): Response {
        auth = Firebase.auth

        val user = auth.currentUser
        val token = if (user != null) {
            runBlocking {
                user.getIdToken(true).await().token
            }
        } else {
            null
        }

        val requestBuilder = chain.request().newBuilder()
        if (token != null) {
            requestBuilder.addHeader("Authorization", "Bearer $token")
        }
        return chain.proceed(requestBuilder.build())
    }
}