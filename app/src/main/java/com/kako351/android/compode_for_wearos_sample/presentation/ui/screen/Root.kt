package com.kako351.android.compode_for_wearos_sample.presentation.ui.screen

import android.provider.DocumentsContract.Root
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.wear.compose.navigation.SwipeDismissableNavHost
import androidx.wear.compose.navigation.composable
import androidx.wear.compose.navigation.rememberSwipeDismissableNavController
import com.kako351.android.compode_for_wearos_sample.presentation.data.ExmapleIndexListItem
import com.kako351.android.compode_for_wearos_sample.presentation.data.ExmapleIndexListItems
import com.kako351.android.compode_for_wearos_sample.presentation.ui.components.button.ButtonScreen
import com.kako351.android.compode_for_wearos_sample.presentation.ui.components.button.ChipScreen

@Composable
fun Root(
    navController: NavHostController = rememberSwipeDismissableNavController()
) {
    val items = ExmapleIndexListItems(items = listOf(
        ExmapleIndexListItem(title = "button", onClick = { navController.navigate("button") }),
        ExmapleIndexListItem(title = "chip", onClick = { navController.navigate("chip") }),
        ExmapleIndexListItem(title = "card", onClick = { navController.navigate("card") }),
        ExmapleIndexListItem(title = "picker", onClick = { navController.navigate("picker") }),
    ))
    SwipeDismissableNavHost(
        navController = navController,
        startDestination = "root"
    ) {
        composable("root") {
            TopScreen(items = items)
        }
        composable("button") {
            ButtonScreen()
        }
        composable("chip") {
            ChipScreen()
        }
    }
}