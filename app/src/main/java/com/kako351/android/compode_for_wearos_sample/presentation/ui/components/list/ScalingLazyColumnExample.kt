package com.kako351.android.compode_for_wearos_sample.presentation.ui.components.list

import android.util.Log
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
import com.kako351.android.compode_for_wearos_sample.presentation.data.ExmapleIndexListItem
import com.kako351.android.compode_for_wearos_sample.presentation.data.ExmapleIndexListItems

@Composable
fun ScalingLazyColumnExample(
    listState: ScalingLazyListState = rememberScalingLazyListState(),
    items: ExmapleIndexListItems
) {
    ScalingLazyColumn(
        modifier = Modifier.fillMaxSize(),
        state = listState,
        autoCentering = AutoCenteringParams(itemIndex = 0)
    ) {
        items(items.items) {
            Chip(
                modifier = Modifier.fillMaxSize(),
                label = { Text(text = it.title) },
                onClick = { it.onClick() }
            )
        }
    }
}