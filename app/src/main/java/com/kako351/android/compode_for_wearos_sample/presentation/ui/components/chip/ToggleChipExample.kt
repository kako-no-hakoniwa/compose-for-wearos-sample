package com.kako351.android.compode_for_wearos_sample.presentation.ui.components.chip

import androidx.compose.runtime.*
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.wear.compose.material.*

@Composable
fun ToggleChipExample() {
    var checked by remember { mutableStateOf(true) }
    ToggleChip(
        checked = checked,
        onCheckedChange = {
            checked = it
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
                    .switchIcon(checked = checked),
                contentDescription = if(checked) "On" else "Off"
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