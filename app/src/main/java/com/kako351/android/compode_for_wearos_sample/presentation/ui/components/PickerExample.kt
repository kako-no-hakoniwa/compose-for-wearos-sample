package com.kako351.android.compode_for_wearos_sample.presentation.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
    Column {
        Picker(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            state = state
        ) {
            Text(text = items[it])
        }

        if(!state.isScrollInProgress) {
            Text(text = "selected item = ${items[state.selectedOption]}")
        }
    }
}

@Preview
@Composable
fun PreviewPickerExample() {
    PickerExample()
}