package com.example.laik.widget

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

@Composable
fun GradientBackground(isDark: Boolean = false){
    val color = if (isDark) Color(0xCC323232) else Color.Transparent
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        Color.Black,
                        color,
                        color,
                        color,
                        color,
                        color,
                        color,
                        Color.Black,
                        Color.Black

                    )
                )
            )
    )
}