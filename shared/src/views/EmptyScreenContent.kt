package views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.resources.painterResource
import shared.generated.resources.Res
import shared.generated.resources.content_based_color_scheme_1

@Composable
fun EmptyScreenContent(
  modifier: Modifier = Modifier,
) {
  Box(
    modifier = modifier,
    contentAlignment = Alignment.Center,
  ) {
    Image(
      painter = painterResource(Res.drawable.content_based_color_scheme_1),
      contentDescription = null,
    )
  }
}