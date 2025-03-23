package ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AccountCreationScreen(
    onContinueClick: () -> Unit = {},
    onBackClick: () -> Unit = {}
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Back button
        IconButton(
            onClick = onBackClick,
            modifier = Modifier.align(Alignment.Start)
        ) {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "Back"
            )
        }

        // Header
        Text(
            text = "Start Your EOS Wallet journey",
            style = MaterialTheme.typography.h4,
            modifier = Modifier.padding(vertical = 16.dp)
        )

        Text(
            text = "An EOS account name is your passport to the EOS blockchain, allowing you to send, receive, and manage digital assets securely.",
            style = MaterialTheme.typography.body1,
            color = MaterialTheme.colors.onSurface.copy(alpha = 0.7f)
        )

        Text(
            text = "So you want create a ?",
            style = MaterialTheme.typography.h6,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Account options
        AccountOption(
            title = "Standard Account Name",
            description = "A full 12-character name. Ideal for those who prefer traditional identifiers.",
            example = "Example: dson21, hdang2k, vlink9x..."
        )

        AccountOption(
            title = "Premium Account Name",
            description = "Under 12 characters with a .man suffix for a perfect personalized touch. Easy to remember and share.",
            example = "Example: dson21, hdang2k, vlink9x..."
        )

        AccountOption(
            title = "Create an account for your friend",
            description = "You must import an account first.",
            example = "Example: dson21, hdang2k, vlink9x..."
        )

        Spacer(modifier = Modifier.weight(1f))

        // Continue button
        Button(
            onClick = onContinueClick,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            shape = MaterialTheme.shapes.medium
        ) {
            Text("Continue")
        }
    }
}

@Composable
private fun AccountOption(
    title: String,
    description: String,
    example: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        shape = MaterialTheme.shapes.medium
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = title,
                    style = MaterialTheme.typography.subtitle1,
                    modifier = Modifier.weight(1f)
                )
                Icon(
                    imageVector = Icons.Default.Info,
                    contentDescription = "Information",
                    tint = MaterialTheme.colors.primary
                )
            }

            Text(
                text = description,
                style = MaterialTheme.typography.body2,
                color = MaterialTheme.colors.onSurface.copy(alpha = 0.7f)
            )

            Text(
                text = example,
                style = MaterialTheme.typography.caption,
                color = MaterialTheme.colors.onSurface.copy(alpha = 0.7f)
            )
        }
    }
}