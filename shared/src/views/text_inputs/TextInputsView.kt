package views.text_inputs

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp

@Composable
fun TextInputsView() {
}

@Composable
fun TextFieldsView() {
  OutlinedCard {
    Column(
      modifier = Modifier
        .requiredWidthIn(400.dp)
        .width(600.dp)
        .padding(16.dp),
    ) {
      var txt1 by remember { mutableStateOf("") }
      TextField(
        modifier = Modifier
          .fillMaxWidth()
          .padding(8.dp),
        singleLine = true,
        value = txt1,
        onValueChange = { txt1 = it },
        label = { Text("Filled") },
        supportingText = { Text("Supporting Text") },
        leadingIcon = { Icon(Icons.Filled.Search, contentDescription = null) },
        trailingIcon = {
          IconButton(onClick = { txt1 = "" }) {
            Icon(Icons.Filled.Close, contentDescription = null)
          }
        },
        placeholder = { Text("Placeholder Text") },
      )
      Row {
        TextField(
          modifier = Modifier
            .weight(1f)
            .padding(8.dp),
          singleLine = true,
          value = txt1,
          onValueChange = { txt1 = it },
          label = { Text("", overflow = TextOverflow.Ellipsis, maxLines = 1) },
          supportingText = { Text("Error Text") },
          leadingIcon = { Icon(Icons.Filled.Search, contentDescription = null) },
          trailingIcon = {
            IconButton(onClick = { txt1 = "" }) {
              Icon(Icons.Filled.Close, contentDescription = null)
            }
          },
          placeholder = { Text("Placeholder Text", overflow = TextOverflow.Ellipsis, maxLines = 1) },
          isError = true,
        )
        TextField(
          modifier = Modifier
            .weight(1f)
            .padding(8.dp),
          singleLine = true,
          value = txt1,
          onValueChange = { txt1 = it },
          label = { Text("", overflow = TextOverflow.Ellipsis, maxLines = 1) },
          supportingText = { Text("Error Text") },
          leadingIcon = { Icon(Icons.Filled.Search, contentDescription = null) },
          trailingIcon = {
            IconButton(onClick = { txt1 = "" }) {
              Icon(Icons.Filled.Close, contentDescription = null)
            }
          },
          placeholder = { Text("Placeholder Text", overflow = TextOverflow.Ellipsis, maxLines = 1) },
          enabled = false,
        )
      }

      var txt2 by remember { mutableStateOf("") }
      OutlinedTextField(
        modifier = Modifier
          .fillMaxWidth()
          .padding(8.dp),
        singleLine = true,
        value = txt2,
        onValueChange = { txt2 = it },
        label = { Text("Outlined") },
        supportingText = { Text("Supporting Text") },
        leadingIcon = { Icon(Icons.Filled.Search, contentDescription = null) },
        trailingIcon = {
          IconButton(onClick = { txt2 = "" }) {
            Icon(Icons.Filled.Close, contentDescription = null)
          }
        },
        placeholder = { Text("Placeholder Text") },
      )
      Row {
        OutlinedTextField(
          modifier = Modifier
            .weight(1f)
            .padding(8.dp),
          singleLine = true,
          value = txt1,
          onValueChange = { txt1 = it },
          label = { Text("", overflow = TextOverflow.Ellipsis, maxLines = 1) },
          supportingText = { Text("Error Text") },
          leadingIcon = { Icon(Icons.Filled.Search, contentDescription = null) },
          trailingIcon = {
            IconButton(onClick = { txt1 = "" }) {
              Icon(Icons.Filled.Close, contentDescription = null)
            }
          },
          placeholder = { Text("Placeholder Text", overflow = TextOverflow.Ellipsis, maxLines = 1) },
          isError = true,
        )
        OutlinedTextField(
          modifier = Modifier
            .weight(1f)
            .padding(8.dp),
          singleLine = true,
          value = txt1,
          onValueChange = { txt1 = it },
          label = { Text("", overflow = TextOverflow.Ellipsis, maxLines = 1) },
          supportingText = { Text("Error Text") },
          leadingIcon = { Icon(Icons.Filled.Search, contentDescription = null) },
          trailingIcon = {
            IconButton(onClick = { txt1 = "" }) {
              Icon(Icons.Filled.Close, contentDescription = null)
            }
          },
          placeholder = { Text("Placeholder Text", overflow = TextOverflow.Ellipsis, maxLines = 1) },
          enabled = false,
        )
      }
    }
  }
}