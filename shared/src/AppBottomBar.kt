import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Chat
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier

@Composable
fun AppBottomBar(
  modifier: Modifier = Modifier,
  contentIndexState: MutableState<Int>,
) {
  NavigationBar(
    modifier = modifier,
  ) {
    NavigationBarItem(
      selected = contentIndexState.value == 0,
      onClick = {
        contentIndexState.value = 0
      },
      icon = {
        Icon(
          Icons.Default.Home,
          contentDescription = "Home",
        )
      },
      label = {
        Text("Home")
      },
    )
    NavigationBarItem(
      selected = contentIndexState.value == 1,
      onClick = {
        contentIndexState.value = 1
      },
      icon = {
        Icon(
          Icons.AutoMirrored.Filled.Chat,
          contentDescription = "Chat",
        )
      },
      label = {
        Text("Chat")
      },
    )
    NavigationBarItem(
      selected = contentIndexState.value == 2,
      onClick = {
        contentIndexState.value = 2
      },
      icon = {
        Icon(
          Icons.Default.Settings,
          contentDescription = "Settings",
        )
      },
      label = {
        Text("Settings")
      },
    )
  }
}