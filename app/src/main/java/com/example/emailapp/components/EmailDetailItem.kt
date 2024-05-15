package com.example.emailapp.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.emailapp.R
import com.example.emailapp.data.Email
import com.example.emailapp.data.LocalEmailDataProvider

@Composable
fun EmailDetailItem(email: Email, modifier: Modifier = Modifier) {

    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            ProfileImage(
                drawableResource = email.sender.avatar,
                descriptor = email.sender.fullName
            )

            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 12.dp, vertical = 4.dp)
            ) {
                Text(text = email.sender.fistName)
                Text(text = email.createAt)
            }
        }

        Text(text = email.subject, modifier = modifier.padding(12.dp, bottom = 8.dp))
        Text(text = email.body, modifier = modifier.padding(12.dp, bottom = 8.dp))

        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {

            Button(onClick = { /*TODO*/ }, modifier = modifier.weight(1f)) {
                Text(text = stringResource(R.string.reply))
            }

            Button(onClick = { /*TODO*/ }, modifier = modifier.weight(1f)) {
                Text(text = stringResource(R.string.reply_all))
            }
        }
    }

}

@Preview
@Composable
fun EmailDetailItemPreview() {
    EmailDetailItem(LocalEmailDataProvider.get(2))
}