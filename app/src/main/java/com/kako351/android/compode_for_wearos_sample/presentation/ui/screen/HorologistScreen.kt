package com.kako351.android.compode_for_wearos_sample.presentation.ui.components.button

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.wear.compose.material.*
import androidx.wear.compose.navigation.SwipeDismissableNavHost
import androidx.wear.compose.navigation.composable
import androidx.wear.compose.navigation.rememberSwipeDismissableNavController
import com.kako351.android.compode_for_wearos_sample.presentation.theme.CompodeforwearossampleTheme


@Composable
fun HorologistScreen(
    modifier: Modifier = Modifier.fillMaxSize(),
    listState: ScalingLazyListState = rememberScalingLazyListState(),
    onClickDatePicker: () -> Unit,
    onClickTimePicker: () -> Unit,
    onClickTimePickerWith12HourClock: () -> Unit,
    onClickSegmentedProgressIndicator: () -> Unit
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
                    label = { Text(text = "Date Picker") },
                    onClick = onClickDatePicker
                )
            }
            item {
                Chip(
                    modifier = Modifier.fillMaxSize(),
                    label = { Text(text = "Time Picker") },
                    onClick = onClickTimePicker
                )
            }
            item {
                Chip(
                    modifier = Modifier.fillMaxSize(),
                    label = { Text(text = "Time Picker") },
                    secondaryLabel = { Text(text = "With 12 Hour Clock") },
                    onClick = onClickTimePickerWith12HourClock
                )
            }
            item {
                Chip(
                    modifier = Modifier.fillMaxSize(),
                    label = { Text(text = "Segmented Progress Indicator") },
                    onClick = onClickSegmentedProgressIndicator
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewHorologistScreen() {
    CompodeforwearossampleTheme {
        HorologistScreen(
            onClickDatePicker = {},
            onClickTimePicker = {},
            onClickTimePickerWith12HourClock = {},
            onClickSegmentedProgressIndicator = {}
        )
    }
}