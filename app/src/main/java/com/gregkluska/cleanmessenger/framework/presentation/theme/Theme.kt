package com.gregkluska.cleanmessenger.framework.presentation.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.gregkluska.cleanmessenger.framework.presentation.components.CircularIndeterminateProgressBar

private val LightThemeColors = lightColors(
        primary = PrimaryColor,
        primaryVariant = PrimaryLightColor,
        onPrimary = White,
        secondary = Color.White,
        secondaryVariant = Background,
        onSecondary = Color.Black,
        error = RedErrorDark,
        onError = RedErrorLight,
        background = Background,
        onBackground = Color.Black,
        surface = Color.White,
        onSurface = Black,
)

private val DarkThemeColors = darkColors(
        primary = PrimaryColor,
        primaryVariant = Color.White,
        onPrimary = Color.White,
        secondary = Color.White,
        onSecondary = Color.White,
        error = RedErrorLight,
        background = Color.Black,
        onBackground = Color.White,
        surface = Color.Black,
        onSurface = Color.White,
)

@Composable
val Colors.snackbarAction: Color
    get() = if (isLight) Color.White else Color.White

@Composable
fun AppTheme(
        darkTheme: Boolean = isSystemInDarkTheme(),
        progressBarIsDisplayed: Boolean = false,
        content: @Composable () -> Unit,
) {
    MaterialTheme(
            colors = if (darkTheme) DarkThemeColors else LightThemeColors,
            typography = Typography,
            shapes = AppShapes,
    ){

        Box(
                modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .background(color = if(!darkTheme) Background else PrimaryLightColor)
        ){
            content()
            CircularIndeterminateProgressBar(isDisplayed = progressBarIsDisplayed, 0.3f)
        }
    }
}
