package com.kako351.android.compode_for_wearos_sample.presentation.ui.components.chip

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.wear.compose.material.*

@Composable
fun ChipExample() {
    Chip(
        label = {
            Text(
                text = "Primary Label",
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        },
        secondaryLabel = {
            Text(
                text = "Secondary Label",
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        },
        icon = {
           Icon(
               imageVector = Icons.Rounded.Add,
               contentDescription = "add",
               modifier = Modifier
                   .size(ChipDefaults.IconSize)
                   .wrapContentSize(align = Alignment.Center)
           )
        },
        onClick = { /*TODO*/ }
    )
}

@Preview
@Composable
fun PreviewChipExample() {
    MaterialTheme {
        ChipExample()
    }
}