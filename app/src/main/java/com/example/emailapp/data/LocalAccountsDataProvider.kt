package com.example.emailapp.data

import com.example.emailapp.R

object LocalAccountsDataProvider {

    private val allUserContactAccount = listOf(
        Account(
            id = 4L,
            fistName = "Lucia",
            lastName = "Alvarez",
            email = "lucia@gmail.com",
            avatar = R.drawable.avatar_0
        ),
        Account(
            id = 5L,
            fistName = "Fred",
            lastName = "Murroz",
            email = "Fred@gmail.com",
            avatar = R.drawable.avatar_1
        ),
        Account(
            id = 6L,
            fistName = "Carmem",
            lastName = "Lucida",
            email = "carmem@gmail.com",
            avatar = R.drawable.avatar_2
        ),
        Account(
            id = 7L,
            fistName = "Joarez",
            lastName = "Tocano",
            email = "joarez@gmail.com",
            avatar = R.drawable.avatar_3
        ),
        Account(
            id = 8L,
            fistName = "Virginia",
            lastName = "Alvez",
            email = "virginia@gmail.com",
            avatar = R.drawable.avatar_4
        ),
        Account(
            id = 9L,
            fistName = "Julia",
            lastName = "Tomates",
            email = "julia@gmail.com",
            avatar = R.drawable.avatar_5
        ),
        Account(
            id = 10L,
            fistName = "Coito",
            lastName = "Fracassado",
            email = "coito@gmail.com",
            avatar = R.drawable.avatar_6
        ),
        Account(
            id = 11L,
            fistName = "Maria",
            lastName = "Dores",
            email = "maria@gmail.com",
            avatar = R.drawable.avatar_7
        ),
        Account(
            id = 12L,
            fistName = "Joao",
            lastName = "Padilha",
            email = "joao@gmail.com",
            avatar = R.drawable.avatar_8
        ),
        Account(
            id = 13L,
            fistName = "Wilker",
            lastName = "Matheus",
            email = "wilker@gmail.com",
            avatar = R.drawable.avatar_9
        ),
        Account(
            id = 14L,
            fistName = "Julio",
            lastName = "Cesar",
            email = "julio@gmail.com",
            avatar = R.drawable.avatar_10
        )

    )

    fun getContactAccountByUid(accountId: Long) = allUserContactAccount.first { it.id == accountId }
}