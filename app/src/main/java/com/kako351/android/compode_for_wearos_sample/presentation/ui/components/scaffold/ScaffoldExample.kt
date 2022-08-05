package com.kako351.android.compode_for_wearos_sample.presentation.ui.components.scaffold

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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
    val maxPage = 2
    val pagerState = rememberPagerState()
    val finalValue = remember { mutableStateOf(0) }
    val animatedSelectedPage = animateFloatAsState(
        targetValue = pagerState.currentPage.toFloat(),
    ) {
        finalValue.value = it.toInt()
    }
    val pageIndicatorState = remember {
        object : PageIndicatorState {
            override val pageCount: Int
                get() = pagerState.pageCount
            override val pageOffset: Float
                get() = animatedSelectedPage.value - finalValue.value
            override val selectedPage: Int
                get() = pagerState.currentPage
        }
    }
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
        },
        pageIndicator = {
            HorizontalPageIndicator(pageIndicatorState = pageIndicatorState)
        }
    ) {
        HorizontalPager(count = maxPage, state = pagerState) {
            if(this.currentPage == 0) {
                ScalingLazyColumnExample(listState)
            } else {
                Text(text = "page ${this.currentPage}")
            }
        }
    }
}