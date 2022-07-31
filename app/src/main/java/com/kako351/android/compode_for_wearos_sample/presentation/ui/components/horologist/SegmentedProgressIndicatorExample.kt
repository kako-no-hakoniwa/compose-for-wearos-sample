package com.kako351.android.compode_for_wearos_sample.presentation.ui.components.horologist

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.ProgressIndicatorDefaults
import com.google.android.horologist.composables.ExperimentalHorologistComposablesApi
import com.google.android.horologist.composables.ProgressIndicatorSegment
import com.google.android.horologist.composables.SegmentedProgressIndicator

@OptIn(ExperimentalHorologistComposablesApi::class)
@Composable
fun SegmentedProgressIndicatorExample() {
    val trackSegments = listOf(
        ProgressIndicatorSegment(1f, Color(0xFFFFFF00)),
        ProgressIndicatorSegment(1f, Color(0xFFFFC107)),
        ProgressIndicatorSegment(1f, Color(0xFFFF9800)),
        ProgressIndicatorSegment(1f, Color(0xFFFF5722)),
        ProgressIndicatorSegment(1f, Color(0xFFF44336)),
        ProgressIndicatorSegment(1f, Color(0xFFE91E63)),
    )
    SegmentedProgressIndicator(
        trackSegments = trackSegments,
        progress = 0.95f,
        paddingAngle = 2f
    )
}

@Preview
@Composable
fun PreviewSegmentedProgressIndicatorExample() {
    SegmentedProgressIndicatorExample()
}