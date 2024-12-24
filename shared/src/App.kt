import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.TextSnippet
import androidx.compose.material.icons.filled.FormatPaint
import androidx.compose.material.icons.filled.Opacity
import androidx.compose.material.icons.filled.Widgets
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.layout.onGloballyPositioned
import theme.AppTheme

const val narrowScreenWidthThreshold = 1300

data class Screen(
  val title: String,
  val icon: ImageVector,
  val content: @Composable () -> Unit,
)

val screens = listOf(
  Screen("Components", Icons.Filled.Widgets) {},
  Screen("Color", Icons.Filled.FormatPaint) {},
  Screen("Typography", Icons.AutoMirrored.Filled.TextSnippet) {},
  Screen("Elevation", Icons.Filled.Opacity) {},
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun App() = AppTheme {
  var screenWidth by remember { mutableStateOf(0) }

  val snackbarHostState = remember { SnackbarHostState() }
  var selectedScreen by remember { mutableStateOf(screens[0]) }
  val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()

  Scaffold(
    modifier = Modifier
      .nestedScroll(scrollBehavior.nestedScrollConnection)
      .onGloballyPositioned {
        screenWidth = it.size.width
      },
    snackbarHost = {
      SnackbarHost(hostState = snackbarHostState)
    },
    topBar = {
      @Composable
      fun title() {
        Text("Multiplatform App")
      }

      @Composable
      fun actions() {
        IconButton(
          onClick = {}
        ) {}

        IconButton(
          onClick = {}
        ) {}
      }

      if (screenWidth <= narrowScreenWidthThreshold) {
        TopAppBar(
          title = { title() },
          scrollBehavior = scrollBehavior,
          actions = { actions() },
        )
      } else {
        CenterAlignedTopAppBar(
          title = { title() },
          scrollBehavior = scrollBehavior,
          actions = { actions() },
        )
      }
    },
    bottomBar = {
      if (screenWidth <= narrowScreenWidthThreshold) {
        NavigationBar {
          screens.forEach { screen ->
            NavigationBarItem(
              icon = { Icon(screen.icon, contentDescription = screen.title) },
              label = { Text(screen.title) },
              selected = selectedScreen == screen,
              onClick = {
                scrollBehavior.state.contentOffset = 0f
                selectedScreen = screen
              }
            )
          }
        }
      }
    },
  ) {
    selectedScreen.content()
  }
}

//internal expect fun openUrl(url: String)