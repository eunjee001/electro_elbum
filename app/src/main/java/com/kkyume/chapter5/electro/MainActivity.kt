package com.kkyume.chapter5.electro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent


// 컴포즈에서는 웹뷰를 아직 지원하지 않는다.

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

