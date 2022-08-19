package com.kako351.android.compode_for_wearos_sample.presentation.data

import android.icu.text.CaseMap.Title
import androidx.compose.runtime.Immutable

@Immutable
data class ExmapleIndexListItem(
    val title: String,
    val onClick: () -> Unit
)
