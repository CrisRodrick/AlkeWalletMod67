package com.example.alkewalletandroid.Login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class LoginViewModel : ViewModel (){

    private val _loginModel= MutableLiveData<LoginModel>()
    val loginModel: LiveData<LoginModel>
        get() = _loginModel

    fun setLoginData (email: String, password: String) = viewModelScope.launch {

        _loginModel.value = LoginModel(email, password)

    }


}