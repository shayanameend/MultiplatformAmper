import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import kotlinx.serialization.Serializable
import views.detail.DetailScreen
import views.list.ListScreen

@Serializable
object ListDestination

@Serializable
data class DetailDestination(val objectId: Int)

@Composable
fun AppContent(contentIndexState: MutableState<Int>) {
  Column(
    modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally,
  ) {
    when (contentIndexState.value) {
      0 -> {
        val navController = rememberNavController()

        NavHost(navController, startDestination = ListDestination) {
          composable<ListDestination> {
            ListScreen { objectId ->
              navController.navigate(DetailDestination(objectId))
            }
          }
          composable<DetailDestination> { navBackStackEntry ->
            DetailScreen(
              objectId = navBackStackEntry.toRoute<DetailDestination>().objectId,
            ) {
              navController.popBackStack()
            }
          }
        }
      }

      1 -> {
        Text("Hello, Chat!")
      }

      2 -> {
        Text("Hello, Settings!")
      }
    }
  }
}