package com.kako351.android.compode_for_wearos_sample.presentation.ui.components.horologist

import android.util.Log
import android.widget.TimePicker
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import com.google.android.horologist.composables.DatePicker
import java.time.LocalDate

@Composable
fun DatePickerExample() {
    var localDate by remember { mutableStateOf(LocalDate.now()) }
    DatePicker(
        onDateConfirm = {
            localDate = it
        },
        date = localDate
    )
}

@Preview
@Composable
fun PreviewDatePickerExample() {
    DatePickerExample()
}