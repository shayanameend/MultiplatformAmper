package views.select_seed_color

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Palette
import androidx.compose.material.icons.outlined.Palette
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup
import theme.AppColor
import theme.LocalAppColor
import theme.SeedColor

@Composable
internal fun SelectSeedColorView() {
  var appColor by LocalAppColor.current

  val selectedSeedColor = (appColor as? AppColor.Seed)?.seedColor

  fun onSelected(color: SeedColor) {
    appColor = AppColor.Seed(color)
  }

  var isSeedChooserOpen by remember { mutableStateOf(false) }
  IconButton(onClick = { isSeedChooserOpen = !isSeedChooserOpen }) {
    Icon(Icons.Filled.Palette, contentDescription = null)
  }
  if (isSeedChooserOpen) {
    val shape = RoundedCornerShape(16.dp)
    Popup(onDismissRequest = { isSeedChooserOpen = false }) {
      Column(
        modifier = Modifier
          .shadow(16.dp, shape)
          .clip(shape)
          .background(MaterialTheme.colorScheme.surfaceVariant)
          .padding(vertical = 8.dp)
          .width(IntrinsicSize.Max)
      ) {
        SeedColor.entries.forEach { color ->
          Row(
            modifier = Modifier
              .fillMaxWidth()
              .clickable(enabled = selectedSeedColor != color) {
                onSelected(color)
                isSeedChooserOpen = false
              }
              .then(if (selectedSeedColor == color) Modifier.alpha(0.6f) else Modifier)
              .padding(16.dp)
          ) {
            Icon(
              imageVector = if (selectedSeedColor == color) {
                Icons.Filled.Palette
              } else {
                Icons.Outlined.Palette
              },
              contentDescription = "Select a Seed Color",
              tint = color.value
            )
            Text(
              modifier = Modifier
                .padding(horizontal = 16.dp),
              text = color.colorName
            )
          }
        }
      }
    }
  }
}