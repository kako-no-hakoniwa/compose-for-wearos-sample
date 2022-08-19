package com.kako351.android.compode_for_wearos_sample.presentation.ui.components.horologist

import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import com.google.android.horologist.composables.TimePickerWith12HourClock
import java.time.LocalTime

@Composable
fun TimePickerWith12HourClockExample() {
    var localTime by remember { mutableStateOf(LocalTime.now()) }
    TimePickerWith12HourClock(
        onTimeConfirm = {
            localTime = it
        },
        time = localTime
    )
}

@Preview
@Composable
fun PreviewTimePickerWith12HourClockExample() {
    TimePickerWith12HourClockExample()
}