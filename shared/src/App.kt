import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import theme.AppTheme

@Composable
fun App() = AppTheme {
  val contentIndexState = mutableStateOf(0)

  Scaffold(
    topBar = { AppTopBar(contentIndexState) },
    content = { AppContent(contentIndexState) },
    bottomBar = { AppBottomBar(contentIndexState) },
  )
}