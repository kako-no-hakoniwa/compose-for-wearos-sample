package com.kako351.android.compode_for_wearos_sample.presentation.ui.components.dialog

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Adb
import androidx.compose.material.icons.rounded.Message
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.Button
import androidx.wear.compose.material.ButtonDefaults
import androidx.wear.compose.material.Icon
import androidx.wear.compose.material.Text
import androidx.wear.compose.material.dialog.Alert

@Composable
fun AlertExample(
    onClickPositiveButton: () -> Unit,
    onClickNegativeButton: () -> Unit
) {
    Alert(
        icon = {
            Icon(
                imageVector = Icons.Rounded.Adb,
                contentDescription = "AppIcon",
                modifier = Modifier
                    .size(24.dp)
                    .wrapContentSize(align = Alignment.Center)
            )
        },
        title = { Text(text = "Alert") },
        negativeButton = {
            Button(
                colors = ButtonDefaults.secondaryButtonColors(),
                onClick = onClickNegativeButton
            ) {
                Text("No")
            }
        },
        positiveButton = {
            Button(onClick = onClickPositiveButton) {
                Text("Yes")
            }
        }
    ) {
        Text(
            text = "Alertの表示例です",
            textAlign = TextAlign.Center
        )
    }
}

@Preview
@Composable
fun PreviewAlertExample() {
    AlertExample(onClickPositiveButton = {}, onClickNegativeButton = {})
}