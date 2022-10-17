package com.kako351.android.compode_for_wearos_sample.presentation.ui.screen

import android.provider.DocumentsContract.Root
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.wear.compose.navigation.SwipeDismissableNavHost
import androidx.wear.compose.navigation.composable
import androidx.wear.compose.navigation.rememberSwipeDismissableNavController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.kako351.android.compode_for_wearos_sample.presentation.ui.components.button.*
import com.kako351.android.compode_for_wearos_sample.presentation.ui.components.dialog.AlertExample
import com.kako351.android.compode_for_wearos_sample.presentation.ui.components.dialog.ConfirmationExample
import com.kako351.android.compode_for_wearos_sample.presentation.ui.components.horologist.DatePickerExample
import com.kako351.android.compode_for_wearos_sample.presentation.ui.components.horologist.SegmentedProgressIndicatorExample
import com.kako351.android.compode_for_wearos_sample.presentation.ui.components.horologist.TimePickerExample
import com.kako351.android.compode_for_wearos_sample.presentation.ui.components.picker.StepperExample
import com.kako351.android.compode_for_wearos_sample.presentation.ui.components.scaffold.PageIndicatorExample

@OptIn(ExperimentalPagerApi::class)
@Composable
fun Root(
    navController: NavHostController = rememberSwipeDismissableNavController()
) {
    SwipeDismissableNavHost(
        navController = navController,
        startDestination = "root"
    ) {
        composable("root") {
            TopScreen(rootNavController = navController)
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
        composable("pager") {
            PageIndicatorExample()
        }
    }
}