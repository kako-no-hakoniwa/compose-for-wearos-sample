package com.kako351.android.compode_for_wearos_sample.presentation.ui.components.picker

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Headphones
import androidx.compose.material.icons.rounded.VolumeOff
import androidx.compose.material.icons.rounded.VolumeUp
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.wear.compose.material.*

@Composable
fun StepperExample() {
    val volume = remember { mutableStateOf(3) }
    Stepper(
        value = volume.value,
        onValueChange = { volume.value = it },
        valueProgression = 0..9,
        increaseIcon = { Icon(InlineSliderDefaults.Increase, "Increase") },
        decreaseIcon = { Icon(InlineSliderDefaults.Decrease, "Decrease") }
    ) {
        Chip(
            label = {
                Text(
                    text = "Volume",
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            },
            icon = {
                Icon(
                    imageVector = Icons.Rounded.Headphones,
                    contentDescription = "headphones",
                    modifier = Modifier
                        .size(ChipDefaults.IconSize)
                        .wrapContentSize(align = Alignment.Center)
                )
            },
            onClick = { /*TODO*/ }
        )
    }
}

@Preview
@Composable
fun PreviewStepperExample() {
    StepperExample()
}