package com.kako351.android.compode_for_wearos_sample.presentation.ui.components.scaffold

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.runtime.*
import androidx.wear.compose.material.*
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState
import com.kako351.android.compode_for_wearos_sample.presentation.ui.components.list.ScalingLazyColumnExample

@OptIn(ExperimentalPagerApi::class)
@Composable
fun PageIndicatorExample () {
val selectedPage by remember { mutableStateOf(0) }
var finalValue by remember { mutableStateOf(0) }
val animatedSelectedPage by animateFloatAsState(
    targetValue = selectedPage.toFloat(),
) {
    finalValue = it.toInt()
}
val pageIndicatorState = remember {
    object : PageIndicatorState {
        override val pageCount: Int
            get() = 2
        override val pageOffset: Float
            get() = animatedSelectedPage - finalValue
        override val selectedPage: Int
            get() = selectedPage
    }
}
Scaffold(
    pageIndicator = {
        HorizontalPageIndicator(pageIndicatorState = pageIndicatorState)
    }
) {

}

//    val maxPage = 2
//    val pagerState = rememberPagerState()
//    var finalValue by remember { mutableStateOf(0) }
//    val animatedSelectedPage = animateFloatAsState(
//        targetValue = pagerState.currentPage.toFloat(),
//    ) {
//        finalValue = it.toInt()
//    }
//    val pageIndicatorState = remember {
//        object : PageIndicatorState {
//            override val pageCount: Int
//                get() = pagerState.pageCount
//            override val pageOffset: Float
//                get() = animatedSelectedPage.value - finalValue
//            override val selectedPage: Int
//                get() = pagerState.currentPage
//        }
//    }
//    Scaffold(
//        timeText = {
//            TimeText()
//        },
//        vignette = {
//            Vignette(vignettePosition = VignettePosition.TopAndBottom)
//        },
//        pageIndicator = {
//
//        }
//    ) {
//
//    }
}