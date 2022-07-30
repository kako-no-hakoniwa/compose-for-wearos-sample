package com.kako351.android.compode_for_wearos_sample.presentation.ui.components.card

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Message
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.wear.compose.material.*

@Composable
fun AppCardExample() {
    AppCard(
        onClick = { /*TODO*/ },
        appName = { Text(text = "AppName") },
        appImage = {
            Icon(
                imageVector = Icons.Rounded.Message,
                contentDescription = "message",
                modifier = Modifier.size(CardDefaults.AppImageSize)
                    .wrapContentSize(align = Alignment.Center)
            )
        },
        title = { Text(text = "AppCard") },
        time = { Text(text = "now") }
    ) {
        Text(
            text = "これはAppCardのサンプルです。AppCardは5つのスロットがあります。",
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )
    }
}

@Preview
@Composable
fun PreviewAppCardExample() {
    AppCardExample()
}