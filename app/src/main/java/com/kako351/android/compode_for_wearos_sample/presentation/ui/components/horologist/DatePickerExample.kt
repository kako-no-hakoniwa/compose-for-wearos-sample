package com.kako351.android.compode_for_wearos_sample.presentation.ui.components.horologist

import android.util.Log
import android.widget.TimePicker
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import com.google.android.horologist.composables.DatePicker
import java.time.LocalDate

@Composable
fun DatePickerExample() {
    val localDate = remember { mutableStateOf(LocalDate.now()) }
    DatePicker(
        onDateConfirm = {
            Log.i("DatePickerExample", "localdate = ${it.toString()}")
            localDate.value = it
        },
        date = localDate.value
    )
}

@Preview
@Composable
fun PreviewDatePickerExample() {
    DatePickerExample()
}