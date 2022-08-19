package com.kako351.android.compode_for_wearos_sample.presentation.ui.screen

import android.provider.DocumentsContract.Root
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.wear.compose.navigation.SwipeDismissableNavHost
import androidx.wear.compose.navigation.composable
import androidx.wear.compose.navigation.rememberSwipeDismissableNavController
import com.kako351.android.compode_for_wearos_sample.presentation.data.ExmapleIndexListItem
import com.kako351.android.compode_for_wearos_sample.presentation.data.ExmapleIndexListItems
import com.kako351.android.compode_for_wearos_sample.presentation.ui.components.button.*
import com.kako351.android.compode_for_wearos_sample.presentation.ui.components.dialog.AlertExample
import com.kako351.android.compode_for_wearos_sample.presentation.ui.components.dialog.ConfirmationExample
import com.kako351.android.compode_for_wearos_sample.presentation.ui.components.horologist.DatePickerExample
import com.kako351.android.compode_for_wearos_sample.presentation.ui.components.horologist.SegmentedProgressIndicatorExample
import com.kako351.android.compode_for_wearos_sample.presentation.ui.components.horologist.TimePickerExample
import com.kako351.android.compode_for_wearos_sample.presentation.ui.components.picker.StepperExample

@Composable
fun Root(
    navController: NavHostController = rememberSwipeDismissableNavController()
) {
    val items = ExmapleIndexListItems(items = listOf(
        ExmapleIndexListItem(title = "button", onClick = { navController.navigate("button") }),
        ExmapleIndexListItem(title = "chip", onClick = { navController.navigate("chip") }),
        ExmapleIndexListItem(title = "card", onClick = { navController.navigate("card") }),
        ExmapleIndexListItem(title = "picker", onClick = { navController.navigate("picker") }),
        ExmapleIndexListItem(title = "dialog", onClick = { navController.navigate("dialog") }),
        ExmapleIndexListItem(title = "horologist", onClick = { navController.navigate("horologist") }),
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
        composable("card") {
            CardScreen()
        }
        composable("picker") {
            PickerScreen(onClickStepper = { navController.navigate("stepper") })
        }
        composable("stepper") {
            StepperExample()
        }
        composable("dialog") {
            DialogScreen(onClickAlert = { navController.navigate("alert") }, onClickConfirmation = { navController.navigate("confirmation") })
        }
        composable("alert") {
            AlertExample(onClickPositiveButton = { navController.popBackStack() }, onClickNegativeButton = { navController.popBackStack() })
        }
        composable("confirmation") {
            ConfirmationExample(onTimeout = { navController.popBackStack() })
        }
        composable("horologist") {
            HorologistScreen(
                onClickDatePicker = { navController.navigate("datePicker") },
                onClickTimePicker = { navController.navigate("timePicker") },
                onClickTimePickerWith12HourClock = { navController.navigate("timePickerWith12HourClock") },
                onClickSegmentedProgressIndicator = { navController.navigate("segmentedProgressIndicator") }
            )
        }
        composable("datePicker") {
            DatePickerExample()
        }
        composable("timePicker") {
            TimePickerExample()
        }
        composable("timePickerWith12HourClock") {
            TimePickerExample()
        }
        composable("segmentedProgressIndicator") {
            SegmentedProgressIndicatorExample()
        }
    }
}