package com.example.emailapp.data

import androidx.annotation.DrawableRes

data class Account(
    val id: Long,
    val fistName: String,
    val lastName: String,
    val email: String,
    @DrawableRes val avatar: Int
){
    val fullName: String = "$fistName $lastName"
}
