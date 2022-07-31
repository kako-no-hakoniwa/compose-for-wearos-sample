package com.kako351.android.compode_for_wearos_sample.presentation.ui.components.picker

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.wear.compose.material.Icon
import androidx.wear.compose.material.InlineSlider
import androidx.wear.compose.material.InlineSliderDefaults

@Composable
fun InlineSliderExample() {
    val volume = remember { mutableStateOf(3) }
    InlineSlider(
        value = volume.value,
        onValueChange = { volume.value = it },
        valueProgression = 0..9,
        increaseIcon = { Icon(InlineSliderDefaults.Increase, "Increase") },
        decreaseIcon = { Icon(InlineSliderDefaults.Decrease, "Decrease") }
    )
}

@Preview
@Composable
fun PreviewInlineSliderExample() {
    InlineSliderExample()
}