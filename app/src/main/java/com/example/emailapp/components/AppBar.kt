package com.example.emailapp.components

import androidx.activity.OnBackPressedCallback
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.emailapp.R
import com.example.emailapp.data.Email
import com.example.emailapp.data.LocalEmailDataProvider

@Composable
fun SearchBar(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = Icons.Default.Search,
            contentDescription = stringResource(R.string.search),
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = stringResource(R.string.search),
            modifier = Modifier
                .padding(16.dp)
                .weight(1f),
            style = MaterialTheme.typography.bodyMedium
        )
        ProfileImage(
            drawableResource = R.drawable.avatar_6,
            descriptor = stringResource(id = R.string.profile),
            modifier = Modifier
                .padding(12.dp)
                .size(40.dp)
        )
    }
}

@Preview
@Composable
fun SearchBarPreview() {
    SearchBar(Modifier)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EmailDetailAppBar(modifier: Modifier, email: Email, onBackPressed: () -> Unit) {
    TopAppBar(title = {
        Text(
            text = email.subject,
            style = MaterialTheme.typography.bodyMedium,
            overflow = TextOverflow.Ellipsis,
            maxLines = 1
        )
    }, navigationIcon = {
        FilledIconButton(
            onClick = onBackPressed,
            modifier = Modifier.padding(8.dp),
            colors = IconButtonDefaults.filledTonalIconButtonColors(
                containerColor = MaterialTheme.colorScheme.surface
            )
        ) {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = stringResource(R.string.back),
                modifier = Modifier.padding(14.dp)
            )
        }
    }, actions = {
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                imageVector = Icons.Default.MoreVert,
                contentDescription = stringResource(R.string.more)
            )
        }
    })

}

@Preview
@Composable
fun EmailDetailAppBarPreview() {
    EmailDetailAppBar(
        modifier = Modifier,
        email = LocalEmailDataProvider.get(8),
        onBackPressed = {})
}