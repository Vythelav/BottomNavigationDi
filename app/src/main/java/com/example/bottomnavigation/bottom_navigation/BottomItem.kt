package com.example.bottomnavigation.bottom_navigation

import com.example.bottomnavigation.R

sealed class BottomItem (val title:String, val iconId: Int, val route: String){
    object Screen1: BottomItem("Screen 1", R.drawable.baseline_favorite_24,"screen_1")
    object Screen2: BottomItem("Screen 2", R.drawable.baseline_favorite_24,"screen_2")
    object Screen3: BottomItem("Screen 3", R.drawable.baseline_favorite_24,"screen_3")
    object Screen4: BottomItem("Screen 4", R.drawable.baseline_favorite_24,"screen_3")
}