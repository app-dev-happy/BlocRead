package com.happy.blocread.screens

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import com.happy.blocread.R

class CoverScreen : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            MainCoverScreen()
        }
    }

    @Composable
    fun MainCoverScreen() {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = colorResource(id = R.color.theme_green_neon))
        )
    }
}