package com.happy.blocread.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.happy.blocread.R

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)

enum class FontType(val kind : Int, val font : Font){
    REGULAR(1,Font(R.font.helvatica_regular)),
    LIGHT(2,Font(R.font.helvatica_light)),
    BOLD(3,Font(R.font.helvatica_bold)),
    EXTRALIGHT(4,Font(R.font.helvatica_extralight)),
    ULTRALIGHT(5,Font(R.font.helvatica_ultralight)),
    ITALICLIGHT(6,Font(R.font.helvatica_italiclight)),
    EXTRABOLD(7,Font(R.font.helvatica_extrabold)),
}