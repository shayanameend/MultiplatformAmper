import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppTopBar(
  modifier: Modifier = Modifier,
  contentIndexState: MutableState<Int>,
) {
  TopAppBar(
    modifier = modifier,
    title = {
      Text("Multiplatform Amper")
    },
  )
}