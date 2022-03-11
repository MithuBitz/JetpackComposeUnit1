package com.example.mgmail.model

data class Account(
    val icon: Int? = null,
    val userName: String,
    val eMail: String,
    val unreadMail: Int
)
