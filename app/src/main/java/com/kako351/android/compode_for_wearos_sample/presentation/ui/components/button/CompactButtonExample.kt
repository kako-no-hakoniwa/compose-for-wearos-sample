package com.kako351.android.compode_for_wearos_sample.presentation.ui.components

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.PhoneDisabled
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposeCompilerApi
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.wear.compose.material.ButtonDefaults
import androidx.wear.compose.material.CompactButton
import androidx.wear.compose.material.Icon

@Composable
fun CompactButtonExample() {
    CompactButton(onClick = { /*TODO*/ }) {
        Icon(
            imageVector = Icons.Rounded.PhoneDisabled,
            contentDescription = "phone disabled",
            modifier = Modifier
                .size(ButtonDefaults.SmallIconSize).wrapContentSize(align = Alignment.Center),
        )
    }
}

@Preview
@Composable
fun PreviewCompactButtonExample() {
    CompactButtonExample()
}