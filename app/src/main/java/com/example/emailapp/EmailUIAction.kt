package com.example.emailapp

interface EmailUIAction {
    fun navigationToDetail(emailId: Long)
    fun back()
}