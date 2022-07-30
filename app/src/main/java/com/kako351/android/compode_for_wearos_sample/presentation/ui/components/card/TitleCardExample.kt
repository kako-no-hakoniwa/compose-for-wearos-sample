package com.kako351.android.compode_for_wearos_sample.presentation.ui.components.card

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.wear.compose.material.Text
import androidx.wear.compose.material.TitleCard

@Composable
fun TitleCardExample() {
    TitleCard(
        onClick = { /*TODO*/ },
        title = { Text(text = "TitleCard") },
        time = { Text(text = "now") }
    ) {
        Text(
            text = "これはTitleCardのサンプルです。TitleCardは3つのスロットがあります。",
            maxLines = 3,
            overflow = TextOverflow.Ellipsis
        )
    }
}

@Preview
@Composable
fun PreviewTitleCardExample() {
    TitleCardExample()
}