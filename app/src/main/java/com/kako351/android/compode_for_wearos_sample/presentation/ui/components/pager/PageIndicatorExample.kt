package com.kako351.android.compode_for_wearos_sample.presentation.ui.components.scaffold

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.wear.compose.material.*
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState
import com.google.accompanist.pager.rememberPagerState
import com.kako351.android.compode_for_wearos_sample.presentation.ui.components.list.ScalingLazyColumnExample

@OptIn(ExperimentalPagerApi::class)
@Composable
fun PageIndicatorExample (
    state: PagerState = rememberPagerState()
) {
    val pageIndicatorState = remember {
        object : PageIndicatorState {
            override val pageCount: Int
                get() = state.pageCount
            override val pageOffset: Float
                get() = state.currentPageOffset
            override val selectedPage: Int
                get() = state.currentPage
        }
    }
    Box(modifier = Modifier.fillMaxSize()) {
        HorizontalPager(count = 3, state = state) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Page ${it + 1}",
                    style = MaterialTheme.typography.title1
                )
            }
        }

        HorizontalPageIndicator(pageIndicatorState = pageIndicatorState)
    }
}