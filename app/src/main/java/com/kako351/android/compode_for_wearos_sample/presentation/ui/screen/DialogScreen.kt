package com.kako351.android.compode_for_wearos_sample.presentation.ui.components.button

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.*
import com.kako351.android.compode_for_wearos_sample.presentation.theme.CompodeforwearossampleTheme
import com.kako351.android.compode_for_wearos_sample.presentation.ui.components.ButtonExample
import com.kako351.android.compode_for_wearos_sample.presentation.ui.components.CompactButtonExample
import com.kako351.android.compode_for_wearos_sample.presentation.ui.components.ToggleButtonExample
import com.kako351.android.compode_for_wearos_sample.presentation.ui.components.chip.AvatarChipExample
import com.kako351.android.compode_for_wearos_sample.presentation.ui.components.chip.ChipExample
import com.kako351.android.compode_for_wearos_sample.presentation.ui.components.chip.ImageChipExample
import com.kako351.android.compode_for_wearos_sample.presentation.ui.components.chip.ToggleChipExample
import com.kako351.android.compode_for_wearos_sample.presentation.ui.components.picker.InlineSliderExample
import com.kako351.android.compode_for_wearos_sample.presentation.ui.components.picker.PickerExample
import com.kako351.android.compode_for_wearos_sample.presentation.ui.components.picker.StepperExample

@Composable
fun DialogScreen(
    modifier: Modifier = Modifier.fillMaxSize(),
    listState: ScalingLazyListState = rememberScalingLazyListState(),
    onClickAlert: () -> Unit,
    onClickConfirmation: () -> Unit
) {
    Scaffold(
        positionIndicator = {
            PositionIndicator(
                scalingLazyListState = listState
            )
        }
    ) {
        ScalingLazyColumn(
            modifier = modifier,
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            autoCentering = AutoCenteringParams(itemIndex = 0),
            state = listState
        ) {
            item {
                Chip(
                    modifier = Modifier.fillMaxSize(),
                    label = { Text(text = "Alert") },
                    onClick = onClickAlert
                )
            }
            item {
                Chip(
                    modifier = Modifier.fillMaxSize(),
                    label = { Text(text = "Confirmation") },
                    onClick = onClickConfirmation
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewDialogScreen() {
    CompodeforwearossampleTheme {
        DialogScreen(onClickAlert = {}, onClickConfirmation = {})
    }
}