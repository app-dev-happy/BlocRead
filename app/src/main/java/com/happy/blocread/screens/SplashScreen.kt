package com.happy.blocread.screens

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat
import com.happy.blocread.R
import com.happy.blocread.ui.theme.FontType
import com.happy.blocread.utility.CommonUtility

class SplashScreen: ComponentActivity() {

    var mContext = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            mContext.window.statusBarColor = ContextCompat.getColor(mContext, CommonUtility.setStatusBarColor())
            MainSplashScreen()
        }
    }

    @Composable
    private fun MainSplashScreen(){
        Box(modifier = Modifier
            .fillMaxSize()
            .background(color = CommonUtility.getSplashBackgroundColor())){
            Image(
                painter = CommonUtility.getSplashLogoImage(),
                contentDescription = "",
                modifier = Modifier
                    .size(200.dp)
                    .align(Alignment.Center))
            Text(text = "Getting Started...",
                color = CommonUtility.getThemeInvertTextColor(),
                modifier = Modifier
                    .clickable(enabled = true, onClick = { OpenCoverScreen() })
                    .padding(bottom = 50.dp)
                    .align(Alignment.BottomCenter),
                fontFamily = FontFamily(CommonUtility.getFontStyle(font = FontType.LIGHT))
            )
        }
    }

    private fun OpenCoverScreen(){
        mContext.startActivity(Intent(mContext,CoverScreen::class.java))
    }


}

