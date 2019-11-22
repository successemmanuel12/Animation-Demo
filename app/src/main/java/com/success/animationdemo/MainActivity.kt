package com.success.animationdemo

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.view.ActionMode
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    lateinit var batteryAnimation: AnimationDrawable
    lateinit var wifiAnimation: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onStart() {
        super.onStart()

        targetImage.setBackgroundResource(R.drawable.battery_animation_list)
        wifiImage.setBackgroundResource(R.drawable.wifi_animation_list)

        batteryAnimation = targetImage.background as AnimationDrawable
        batteryAnimation.start()

        wifiAnimation = wifiImage.background as AnimationDrawable
        wifiAnimation.start()
    }

    // Button click event handler
    fun startStopAnimation(view: View) {
        if (batteryAnimation.isRunning)
            batteryAnimation.stop()
        else
            batteryAnimation.start()
    }
}
