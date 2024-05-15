package com.example.emailapp.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.emailapp.EmailUIAction
import com.example.emailapp.EmailUIState
import com.example.emailapp.R
import com.example.emailapp.data.LocalEmailDataProvider

@Composable
fun EmailApp(
    uiState: EmailUIState,
    uiAction: EmailUIAction
) {
    EmailAppContent(uiState = uiState, uiAction = uiAction)
}

@Composable
fun EmailAppContent(
    uiState: EmailUIState,
    uiAction: EmailUIAction
) {
    Column(modifier = Modifier.fillMaxSize()) {

        val selectedDestination = remember { mutableStateOf(EmailRoutes.INBOX) }

        if (selectedDestination.value == EmailRoutes.INBOX) {
            InboxScreen(uiState = uiState, uiAction = uiAction, modifier = Modifier.weight(1f))
        } else {
            EmptyScreen(Modifier.weight(1f))
        }

        NavigationBar(modifier = Modifier.fillMaxWidth()) {
            TOP_LEVEL_DESTINATION.forEach { destination ->
                NavigationBarItem(
                    selected = selectedDestination.value == destination.route,
                    onClick = { selectedDestination.value = destination.route },
                    icon = {
                        Icon(
                            imageVector = destination.selectedIcon,
                            contentDescription = stringResource(
                                id = destination.iconTextId
                            )
                        )
                    })
            }
        }

    }
}

object EmailRoutes {
    const val INBOX = "Inbox"
    const val FAVORITES = "Favorites"
    const val SETTINGS = "Settings"
    const val PROFILE = "Profile"
}

data class EmailTopLevelDestination(
    val route: String,
    val selectedIcon: ImageVector,
    val iconTextId: Int
)

val TOP_LEVEL_DESTINATION = listOf(
    EmailTopLevelDestination(
        route = EmailRoutes.INBOX,
        selectedIcon = Icons.Default.Email,
        iconTextId = R.string.tab_inbox
    ),
    EmailTopLevelDestination(
        route = EmailRoutes.FAVORITES,
        selectedIcon = Icons.Default.Favorite,
        iconTextId = R.string.tab_favorite
    ),
    EmailTopLevelDestination(
        route = EmailRoutes.SETTINGS,
        selectedIcon = Icons.Default.Settings,
        iconTextId = R.string.tab_settings
    ),
    EmailTopLevelDestination(
        route = EmailRoutes.PROFILE,
        selectedIcon = Icons.Default.Person,
        iconTextId = R.string.tab_profile
    )
)

@Preview
@Composable
fun EmailAppContentPreview() {
    EmailAppContent(uiState = EmailUIState(emails = LocalEmailDataProvider.allEmail),
        uiAction = object : EmailUIAction {
            override fun navigationToDetail(emailId: Long) {
                TODO("Not yet implemented")
            }

            override fun back() {
                TODO("Not yet implemented")
            }
        }
    )
}