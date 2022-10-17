package com.kako351.android.compode_for_wearos_sample.presentation.ui.screen

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.wear.compose.material.*
import com.kako351.android.compode_for_wearos_sample.presentation.ui.components.list.ScalingLazyColumnExample
import com.kako351.android.compode_for_wearos_sample.presentation.data.usecase.TopListItemUsecase


@OptIn(ExperimentalWearMaterialApi::class)
@Composable
fun TopScreen (
    listState: ScalingLazyListState = rememberScalingLazyListState(),
    rootNavController: NavHostController,
    items: List<String> = TopListItemUsecase().items
){
    Scaffold(
        timeText = {
            if (!listState.isScrollInProgress) {
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
        ScalingLazyColumnExample(listState = listState, items = items, onClickItem = { routeLabel ->
            rootNavController.navigate(routeLabel)
        })
    }
}

