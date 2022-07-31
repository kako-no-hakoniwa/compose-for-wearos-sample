package com.kako351.android.compode_for_wearos_sample.presentation.ui.components.picker

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.Picker
import androidx.wear.compose.material.Text
import androidx.wear.compose.material.rememberPickerState

@Composable
fun PickerExample() {
    val items = listOf("One", "Two", "Three", "Four", "Five")
    val state = rememberPickerState(items.size)
    val contentDescription = remember { derivedStateOf { "${state.selectedOption + 1}" } }
    Picker(
        modifier = Modifier.size(100.dp, 100.dp),
        state = state,
        contentDescription = contentDescription.value
    ) {
        Text(items[it])
    }
}

@Preview
@Composable
fun PreviewPickerExample() {
    PickerExample()
}