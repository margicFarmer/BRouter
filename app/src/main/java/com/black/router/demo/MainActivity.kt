package com.black.router.demo

import android.app.Activity
import android.os.Bundle
import android.view.View
import com.black.router.BlackRouter
import com.black.router.RouteCallback
import com.black.router.annotation.Route
import com.black.router.demo.R

@Route(value = ["mainActivity"])
class MainActivity() : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.next).setOnClickListener {
            BlackRouter.getInstance().build("secondActivity").go(
                this
            ) { routeResult, error -> error?.printStackTrace() }
        }
    }
}