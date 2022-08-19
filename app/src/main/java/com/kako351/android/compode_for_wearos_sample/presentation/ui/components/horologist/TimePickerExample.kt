package com.kako351.android.compode_for_wearos_sample.presentation.ui.components.horologist

import android.util.Log
import androidx.compose.runtime.*
import com.google.android.horologist.composables.TimePicker
import androidx.compose.ui.tooling.preview.Preview
import java.time.LocalTime

@Composable
fun TimePickerExample() {
    var localTime by remember { mutableStateOf(LocalTime.now()) }
    TimePicker(
        onTimeConfirm = {
            localTime = it
        },
        time = localTime
    )
}

@Preview
@Composable
fun PreviewTimePickerExample() {
    TimePickerExample()
}