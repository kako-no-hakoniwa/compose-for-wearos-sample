package com.kako351.android.compode_for_wearos_sample.presentation.ui.components.scaffold

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.wear.compose.material.*
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import com.kako351.android.compode_for_wearos_sample.presentation.ui.components.list.ScalingLazyColumnExample

@OptIn(ExperimentalPagerApi::class)
@Composable
fun ScaffoldExample(
    listState: ScalingLazyListState = rememberScalingLazyListState()
) {
    Scaffold(
        timeText = {
            if(!listState.isScrollInProgress) {
                TimeText()
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
        ScalingLazyColumn(
            modifier = Modifier.fillMaxSize(),
            state = listState,
            autoCentering = AutoCenteringParams(itemIndex = 0)
        ) {}
    }
}