package com.kako351.android.compode_for_wearos_sample.presentation.ui.components.list

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Numbers
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.*

@Composable
fun ScalingLazyColumnExample() {
    val listState = rememberScalingLazyListState()
    Box {
        ScalingLazyColumn(
            modifier = Modifier.fillMaxSize(),
            state = listState,
            autoCentering = AutoCenteringParams(itemIndex = 0)
        ) {
            items((0..10).toList()) {
                Chip(
                    modifier = Modifier.fillMaxSize(),
                    label = { Text(text = "${it}th Item") },
                    icon = {
                        Icon(
                            imageVector = Icons.Rounded.Numbers,
                            contentDescription = "Numbers",
                            modifier = Modifier
                                .size(ChipDefaults.IconSize)
                                .wrapContentSize(align = Alignment.Center)
                        )
                    },
                    onClick = { /*TODO*/ }
                )
            }
        }

        PositionIndicator(
            scalingLazyListState = listState
        )
    }
}