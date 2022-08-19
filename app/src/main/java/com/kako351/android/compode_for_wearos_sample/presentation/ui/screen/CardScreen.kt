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
import com.kako351.android.compode_for_wearos_sample.presentation.ui.components.card.AppCardExample
import com.kako351.android.compode_for_wearos_sample.presentation.ui.components.card.TitleCardExample
import com.kako351.android.compode_for_wearos_sample.presentation.ui.components.chip.AvatarChipExample
import com.kako351.android.compode_for_wearos_sample.presentation.ui.components.chip.ChipExample
import com.kako351.android.compode_for_wearos_sample.presentation.ui.components.chip.ImageChipExample
import com.kako351.android.compode_for_wearos_sample.presentation.ui.components.chip.ToggleChipExample

@Composable
fun CardScreen(
    modifier: Modifier = Modifier.fillMaxSize(),
    listState: ScalingLazyListState = rememberScalingLazyListState()
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
                ScreenListItem(title = "App Card") {
                    AppCardExample()
                }
            }
            item {
                ScreenListItem(title = "Title Chip") {
                    TitleCardExample()
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewCardScreen() {
    CompodeforwearossampleTheme {
        CardScreen()
    }
}