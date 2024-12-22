import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import theme.AppTheme

@Composable
fun App() = AppTheme {
  val contentIndexState = mutableStateOf(0)

  Scaffold(
    topBar = {
      AppTopBar(
        contentIndexState = contentIndexState,
      )
    },
    content = { safePadding ->
      AppContent(
        modifier = Modifier.padding(safePadding),
        contentIndexState = contentIndexState,
      )
    },
    bottomBar = {
      AppBottomBar(
        contentIndexState = contentIndexState,
      )
    },
  )
}