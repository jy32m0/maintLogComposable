package com.ilko.calllog

sealed class Screen(val route: String) {
    object MainScreen: Screen("main_screen")
    object DBScreen: Screen("db_screen")
    object MiscScreen: Screen("misc_screen")
    object DetailScreen: Screen("detail_screen")

}
