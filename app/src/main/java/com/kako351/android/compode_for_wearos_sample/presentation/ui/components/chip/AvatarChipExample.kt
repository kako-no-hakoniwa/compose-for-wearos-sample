package com.kako351.android.compode_for_wearos_sample.presentation.ui.components.chip

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.wear.compose.material.*
import com.kako351.android.compode_for_wearos_sample.R

@Composable
fun AvatarChipExample() {
    Chip(
        label = {
            Text(text = "kako351")
        },
        icon = {
            Image(
                painter = painterResource(id = R.drawable.avatar),
                contentDescription = "kako351",
                modifier = Modifier
                    .size(ChipDefaults.LargeIconSize)
                    .wrapContentSize(align = Alignment.Center)
            )
        },
        onClick = { /*TODO*/ }
    )
}

@Preview
@Composable
fun PreviewAvatarChipExample() {
    MaterialTheme {
        AvatarChipExample()
    }
}