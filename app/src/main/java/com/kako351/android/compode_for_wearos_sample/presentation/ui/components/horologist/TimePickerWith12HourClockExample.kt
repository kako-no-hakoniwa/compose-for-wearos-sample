package com.kako351.android.compode_for_wearos_sample.presentation.ui.components.horologist

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import com.google.android.horologist.composables.TimePickerWith12HourClock
import java.time.LocalTime

@Composable
fun TimePickerWith12HourClockExample() {
    val localTime = remember { mutableStateOf(LocalTime.now()) }
    TimePickerWith12HourClock(
        onTimeConfirm = {
            localTime.value = it
        },
        time = localTime.value
    )
}

@Preview
@Composable
fun PreviewTimePickerWith12HourClockExample() {
    TimePickerWith12HourClockExample()
}