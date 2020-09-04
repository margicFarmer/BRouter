package com.black.router.demo

import android.app.Activity
import android.os.Bundle
import com.black.router.demo.R
import com.black.router.annotation.Route

@Route(value = ["secondActivity"])
class SecondActivity() : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
}