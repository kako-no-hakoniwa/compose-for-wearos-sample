package com.kako351.android.compode_for_wearos_sample.presentation.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Message
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.wear.compose.material.AppCard
import androidx.wear.compose.material.Icon
import androidx.wear.compose.material.Text

@Composable
fun AppCardExample(
    modifier: Modifier = Modifier,
    iconModifier: Modifier = Modifier
) {
    AppCard(
        modifier = modifier,
        appImage = {
            Icon(
                imageVector = Icons.Rounded.Message,
                contentDescription = "triggers open message action",
                modifier = iconModifier
            )
        },
        appName = { Text("Messages") },
        time = { Text("12m") },
        title = { Text("Kim Green") },
        onClick = { /* ... */ }
    ) {
        Text("On my way!")
    }
}

@Preview
@Composable
fun PreviewAppCardExample() {
    AppCardExample()
}