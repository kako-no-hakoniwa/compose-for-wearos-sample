package com.kako351.android.compode_for_wearos_sample.presentation.ui.components.chip

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.wear.compose.material.*

@Composable
fun ToggleChipExample() {
    val checked = remember { mutableStateOf(true) }
    ToggleChip(
        checked = checked.value,
        onCheckedChange = {
            checked.value = it
        },
        label = {
            Text(
                text = "Alerm",
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        },
        toggleControl = {
            Icon(
                imageVector = ToggleChipDefaults
                    .switchIcon(checked = checked.value),
                contentDescription = if(checked.value) "On" else "Off"
            )
        },
        colors = ToggleChipDefaults.toggleChipColors(
            uncheckedToggleControlColor = ToggleChipDefaults.SwitchUncheckedIconColor
        ),
    )
}

@Preview
@Composable
fun PreviewToggleChipExample() {
    MaterialTheme {
        ToggleChipExample()
    }
}