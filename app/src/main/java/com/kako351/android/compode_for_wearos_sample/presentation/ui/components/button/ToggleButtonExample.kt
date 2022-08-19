package com.kako351.android.compode_for_wearos_sample.presentation.ui.components

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.VolumeMute
import androidx.compose.material.icons.rounded.VolumeOff
import androidx.compose.material.icons.rounded.VolumeUp
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.wear.compose.material.Icon
import androidx.wear.compose.material.ToggleButton
import androidx.wear.compose.material.ToggleButtonDefaults
import com.kako351.android.compode_for_wearos_sample.presentation.theme.CompodeforwearossampleTheme

@Composable
fun ToggleButtonExample() {
    var checked by remember { mutableStateOf(true) }
    ToggleButton(
        checked = checked,
        onCheckedChange = {
            checked = it
        }
    ) {
        Icon(
            imageVector = when(checked) {
                true -> Icons.Rounded.VolumeUp
                false -> Icons.Rounded.VolumeOff
            },
            contentDescription = "volumeUp",
            modifier = Modifier
                .size(ToggleButtonDefaults.DefaultIconSize)
                .wrapContentSize(align = Alignment.Center)
        )
    }
}

@Preview
@Composable
fun PreviewToggleButtonExample() {
    CompodeforwearossampleTheme {
        ToggleButtonExample()
    }
}