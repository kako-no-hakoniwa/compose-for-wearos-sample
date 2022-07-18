package com.kako351.android.compode_for_wearos_sample.presentation.ui.components.chip

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.wear.compose.material.Chip
import androidx.wear.compose.material.ChipDefaults
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.Text
import com.kako351.android.compode_for_wearos_sample.R

@Composable
fun ImageChipExample() {
    Chip(
        label = {
            Text(
                text = "Cafe Latte",
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        },
        colors = ChipDefaults.imageBackgroundChipColors(
            backgroundImagePainter = painterResource(id = R.drawable.latte)
        ),
        onClick = { /*TODO*/ }
    )
}

@Preview
@Composable
fun PreviewImageChipExample() {
    MaterialTheme {
        ImageChipExample()
    }
}
