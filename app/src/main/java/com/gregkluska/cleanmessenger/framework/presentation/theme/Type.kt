package com.gregkluska.cleanmessenger.framework.presentation.theme

import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.font
import androidx.compose.ui.text.font.fontFamily
import androidx.compose.ui.unit.sp
import com.gregkluska.cleanmessenger.R

private val Roboto = fontFamily(
        font(R.font.roboto_regular, FontWeight.Normal),
        font(R.font.roboto_medium, FontWeight.Medium)
)

private val Gilroy = fontFamily(
        font(R.font.gilroy_light, FontWeight.Light)
)

val Typography = Typography(
        h1 = TextStyle(
                fontFamily = Gilroy,
                fontWeight = FontWeight.Light,
                fontSize = 30.sp,
        ),
        h2 = TextStyle(
                fontFamily = Roboto,
                fontWeight = FontWeight.Medium,
                fontSize = 24.sp,
        ),
        h3 = TextStyle(
                fontFamily = Roboto,
                fontWeight = FontWeight.Medium,
                fontSize = 20.sp,
        ),
        h4 = TextStyle(
                fontFamily = Roboto,
                fontWeight = FontWeight.Medium,
                fontSize = 18.sp,
        ),
        h5 = TextStyle(
                fontFamily = Roboto,
                fontWeight = FontWeight.Medium,
                fontSize = 16.sp,
        ),
        h6 = TextStyle(
                fontFamily = Roboto,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
        ),
        subtitle1 = TextStyle(
                fontFamily = Roboto,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp,
        ),
        subtitle2 = TextStyle(
                fontFamily = Roboto,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp,
        ),
        body1 = TextStyle(
                fontFamily = Roboto,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp
        ),
        body2 = TextStyle(
                fontFamily = Roboto,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp
        ),
        button = TextStyle(
                fontFamily = Roboto,
                fontWeight = FontWeight.Normal,
                fontSize = 15.sp,
                color = Color.White
        ),
        caption = TextStyle(
                fontFamily = Roboto,
                fontWeight = FontWeight.Normal,
                fontSize = 12.sp
        ),
        overline = TextStyle(
                fontFamily = Roboto,
                fontWeight = FontWeight.Normal,
                fontSize = 11.sp
        )
)