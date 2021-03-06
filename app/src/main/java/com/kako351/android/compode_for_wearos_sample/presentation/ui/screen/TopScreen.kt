package com.kako351.android.compode_for_wearos_sample.presentation.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.*
import com.kako351.android.compode_for_wearos_sample.presentation.theme.CompodeforwearossampleTheme
import com.kako351.android.compode_for_wearos_sample.presentation.ui.components.*
import com.kako351.android.compode_for_wearos_sample.presentation.ui.components.chip.AvatarChipExample
import com.kako351.android.compode_for_wearos_sample.presentation.ui.components.chip.ChipExample
import com.kako351.android.compode_for_wearos_sample.presentation.ui.components.chip.ImageChipExample
import com.kako351.android.compode_for_wearos_sample.presentation.ui.components.chip.ToggleChipExample

@OptIn(ExperimentalWearMaterialApi::class)
@Composable
fun TopScreen (){
    val listState = rememberScalingLazyListState()
    Scaffold(
        timeText = {
            if (!listState.isScrollInProgress) {
//                TimeText()
            }
        },
        vignette = {
            Vignette(vignettePosition = VignettePosition.TopAndBottom)
        },
        positionIndicator = {
            PositionIndicator(
                scalingLazyListState = listState
            )
        }
    ) {
        val contentModifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 8.dp)
        val iconModifier = Modifier
            .size(24.dp)
            .wrapContentSize(align = Alignment.Center)
        ScalingLazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            autoCentering = AutoCenteringParams(itemIndex = 0),
            state = listState
        ) {
//            item { AppCardExample() }
//            item { PickerExample() }
//            item { ButtonExample() }
//            item { CompactButtonExample() }
//            item { ToggleButtonExample() }
//            item { ChipExample() }
//            item { ImageChipExample() }
//            item { AvatarChipExample() }
            item { ToggleChipExample() }
        }
    }
}

@Preview(device = Devices.WEAR_OS_SMALL_ROUND, showSystemUi = true)
@Composable
fun PreviewTopScreen() {
    CompodeforwearossampleTheme {
        TopScreen()
    }
}
