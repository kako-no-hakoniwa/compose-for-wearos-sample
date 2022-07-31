package com.kako351.android.compode_for_wearos_sample.presentation.ui.components.horologist

import android.util.Log
import com.google.android.horologist.composables.TimePicker
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import java.time.LocalTime

@Composable
fun TimePickerExample() {
    val localTime = remember { mutableStateOf(LocalTime.now()) }
    TimePicker(
        onTimeConfirm = {
            Log.i("TimePickerExample", "localTime = ${it.toString()}")
            localTime.value = it
        },
        time = localTime.value
    )
}

@Preview
@Composable
fun PreviewTimePickerExample() {
    TimePickerExample()
}