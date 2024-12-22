import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun AppContent(contentIndexState: MutableState<Int>) {
  Column(
    modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally,
  ) {
    when (contentIndexState.value) {
      0 -> {
        Text("Hello, Home!")
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