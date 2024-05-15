package com.example.emailapp.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.emailapp.EmailUIAction
import com.example.emailapp.data.Email
import com.example.emailapp.data.LocalEmailDataProvider

@Composable
fun EmailDetail(email: Email, modifier: Modifier = Modifier, uiAction: EmailUIAction) {

    LazyColumn(modifier = modifier.fillMaxSize()) {
        item {
            EmailDetailAppBar(email = email) {
                uiAction.back()
            }
        }
        item {
            Spacer(modifier = modifier.padding(16.dp))
            EmailDetailItem(email = email)
        }
    }

}

@Preview
@Composable
fun EmailDetailPreview() {
    EmailDetail(email = LocalEmailDataProvider.get(2), uiAction = object : EmailUIAction{
        override fun navigationToDetail(emailId: Long) {
            TODO("Not yet implemented")
        }

        override fun back() {
            TODO("Not yet implemented")
        }
    })
}