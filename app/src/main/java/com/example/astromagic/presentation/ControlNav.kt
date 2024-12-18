package com.example.astromagic.presentation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import kotlinx.coroutines.launch
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.astromagic.Utils.NavigationRoutes
import com.example.astromagic.presentation.ui.screen.Setting.SettingScreen
import com.example.astromagic.presentation.ui.screen.discover.DiscoverScreen
import com.example.astromagic.presentation.ui.screen.home.HomeScreen
import com.example.astromagic.presentation.ui.screen.profile1.ProfileScreen1
import com.example.astromagic.presentation.ui.screen.profiledate.ProfileDate
import com.example.astromagic.presentation.ui.screen.profilegender.ProfileGender
import com.example.astromagic.presentation.ui.screen.profileplace.ProfilePlace
import com.example.astromagic.presentation.ui.screen.profiletime.ProfileTime
import com.example.astromagic.presentation.ui.screen.splaceScreen.SplaceScreen
import com.example.astromagic.presentation.ui.screen.startup1.startupScreen1
import com.example.astromagic.presentation.ui.screen.startup2.startupScreen2
import com.example.astromagic.presentation.ui.screen.startup3.startupScreen3


@Composable
fun ControlNav() {
    val navController = rememberNavController() // Create NavController

    LaunchedEffect(Unit) {
        launch {
//            homeViewModel.categories.collect { categories ->
//                generateImageViewModel.setCategories(categories)
//
        }
        launch {
//            homeViewModel.selectedCategory.collect { category ->
//                generateImageViewModel.setSelectedCategory(category)
//            }


        }
        launch {
//            homeViewModel.items.collect { items ->
//                generateImageViewModel.setItems(items)
//            }

        }
        launch {

        }

        launch {
//            homeViewModel.categoryData.collect { categoryData ->
//                generateImageViewModel.setCategoryData(categoryData)
//            }


        }
    }


    // Scaffold with NavHost
    NavHost(
        navController = navController,
        startDestination = NavigationRoutes.SPLASH
    ) {
        // Splash Screen
        composable(route = NavigationRoutes.SPLASH) {
            SplaceScreen(navController = navController)
        }
        composable(route = NavigationRoutes.STARTUP1) {
            startupScreen1(navController = navController)
        }
        composable(route = NavigationRoutes.STARTUP2) {
            startupScreen2(navController = navController)
        }
        composable(route = NavigationRoutes.STARTUP3) {
            startupScreen3(navController = navController)
        }
        composable(route = NavigationRoutes.PROFILEsCREEN1) {
            ProfileScreen1(navController = navController)
        }
        composable(route = NavigationRoutes.PROFILEGENDER) {
            ProfileGender(navController = navController)
        }
        composable(route = NavigationRoutes.PROFILEDATE) {
            ProfileDate(navController = navController)
        }
        composable(route=NavigationRoutes.PROFILETIME){
            ProfileTime(navController=navController)
        }
        composable(route=NavigationRoutes.PROFILEPLACE){
            ProfilePlace(navController= navController)
        }
        composable(route=NavigationRoutes.DISCOVERSCREEN){
            DiscoverScreen(navController=navController)
        }
        composable(route=NavigationRoutes.HOMESCREEN){
            HomeScreen(navController=navController)
        }
        composable(route=NavigationRoutes.SETTINGsCREEN){
            SettingScreen(navController=navController)
        }
    }
}