package com.kako351.android.compode_for_wearos_sample.presentation.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Done
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Device
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.*
import com.kako351.android.compode_for_wearos_sample.presentation.theme.CompodeforwearossampleTheme

@Composable
fun ButtonExample() {
    Button(
        modifier = Modifier.size(ButtonDefaults.LargeButtonSize),
        onClick = { /*TODO*/ }
    ) {
        Icon(
            imageVector = Icons.Rounded.Phone,
            contentDescription = "phone"
        )
    }
}

@Preview(device = Devices.WEAR_OS_LARGE_ROUND)
@Composable
fun PreviewButtonExample() {
    CompodeforwearossampleTheme {
        ButtonExample()
    }
}