package com.kako351.android.compode_for_wearos_sample.presentation.ui.components.navigation

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.wear.compose.material.Button
import androidx.wear.compose.material.ButtonDefaults
import androidx.wear.compose.material.Text
import androidx.wear.compose.navigation.SwipeDismissableNavHost
import androidx.wear.compose.navigation.composable
import androidx.wear.compose.navigation.rememberSwipeDismissableNavController

@Composable
fun NavigationExample(
    navController: NavHostController = rememberSwipeDismissableNavController()
) {
    SwipeDismissableNavHost(
        navController = navController,
        startDestination = "page1"
    ) {
        composable("page1") {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text("page1")
                Button(
                    modifier = Modifier
                        .padding(8.dp)
                        .size(ButtonDefaults.LargeButtonSize),
                    onClick = {
                        navController.navigate("page2")
                    }
                ) {
                    Text("page2")
                }
            }
        }
        composable("page2") {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text("page2")
                Button(
                    modifier = Modifier
                        .padding(8.dp)
                        .size(ButtonDefaults.LargeButtonSize),
                    onClick = {
                        navController.navigate("page1")
                    }
                ) {
                    Text("page1")
                }
            }
        }
    }
}
