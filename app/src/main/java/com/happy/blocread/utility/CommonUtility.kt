package com.happy.blocread.utility

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import com.happy.blocread.R
import com.happy.blocread.ui.theme.FontType

object CommonUtility {

    @Composable
    fun setStatusBarColor() : Int {
        return if (isSystemInDarkTheme())  R.color.dark_splash_background_color
        else R.color.light_splash_background_color
    }

    @Composable
    fun getSplashBackgroundColor() : Color {
        return if (isSystemInDarkTheme())  colorResource(id = R.color.dark_splash_background_color)
        else colorResource(id = R.color.light_splash_background_color)
    }

    @Composable
    fun getThemeInvertTextColor() : Color {
        return if (isSystemInDarkTheme())  colorResource(id = R.color.white_text)
        else colorResource(id = R.color.black_text)
    }

    @Composable
    fun getSplashLogoImage() : Painter {
        return if (isSystemInDarkTheme())  painterResource(id = R.drawable.dark_br_logo)
        else painterResource(id = R.drawable.light_br_logo)
    }

    @Composable
    fun getFontStyle(font : FontType) : Font {
        return when(font){
            FontType.REGULAR -> { FontType.REGULAR.font }
            FontType.BOLD -> { FontType.BOLD.font }
            FontType.EXTRABOLD -> {FontType.EXTRABOLD.font}
            FontType.EXTRALIGHT -> {FontType.EXTRALIGHT.font}
            FontType.ITALICLIGHT -> {FontType.ITALICLIGHT.font}
            FontType.LIGHT -> {FontType.LIGHT.font}
            FontType.ULTRALIGHT -> {FontType.ULTRALIGHT.font}
            else -> { FontType.REGULAR.font }
        }
    }
}

