package com.example.alkewalletandroid.data.remote.FromInternet

data class UserFormState(
    val nameError: Int? = null,
    val lastNameError: Int? = null,
    val emailError: Int? = null,
    val passwordError: Int? = null,
    val passwordConfirmError: Int? = null,
    val isDataValid: Boolean = false
)

data class TransactionFormState(
    val amountError: Int? = null,
    val isDataValid: Boolean = false
)