package com.kako351.android.compode_for_wearos_sample.presentation.ui.components.dialog

import androidx.compose.animation.graphics.ExperimentalAnimationGraphicsApi
import androidx.compose.animation.graphics.res.animatedVectorResource
import androidx.compose.animation.graphics.res.rememberAnimatedVectorPainter
import androidx.compose.animation.graphics.vector.AnimatedImageVector
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Check
import androidx.compose.material.icons.rounded.Message
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.ButtonDefaults
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.Text
import androidx.wear.compose.material.dialog.Confirmation
import androidx.wear.compose.material.dialog.DialogDefaults
import com.kako351.android.compode_for_wearos_sample.R
import com.kako351.android.compode_for_wearos_sample.presentation.theme.wearColorPalette

@Composable
fun ConfirmationExample() {
    val show = remember { mutableStateOf(true) }
    if(show.value){
        Confirmation(
            onTimeout = {
                show.value = false
            },
            icon = {
                Image(
                    imageVector = Icons.Rounded.Check,
                    contentDescription = "check",
                    modifier = Modifier.size(48.dp),
                    colorFilter = ColorFilter.tint(color = Color.Cyan)
                )
            },
            durationMillis = DialogDefaults.ShortDurationMillis,
        ) {
            Text(
                text = "Confirmationの表示例です",
                textAlign = TextAlign.Center
            )
        }
    }
}

@Preview
@Composable
fun PreviewConfirmationExample() {
    ConfirmationExample()
}
