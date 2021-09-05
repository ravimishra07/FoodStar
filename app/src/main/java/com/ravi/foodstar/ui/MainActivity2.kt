package com.ravi.foodstar.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ravi.foodstar.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity2 : AppCompatActivity() {
    //var bind
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
}