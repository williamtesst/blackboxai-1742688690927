import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import ui.AccountCreationScreen

@Composable
fun App() {
    MaterialTheme(
        colors = lightColors(
            primary = Color(0xFF2196F3),
            onPrimary = Color.White,
            surface = Color.White,
            onSurface = Color(0xFF1C1B1F),
            background = Color(0xFFF8F8F8)
        )
    ) {
        Surface {
            AccountCreationScreen(
                onContinueClick = { /* Handle continue click */ },
                onBackClick = { /* Handle back click */ }
            )
        }
    }
}