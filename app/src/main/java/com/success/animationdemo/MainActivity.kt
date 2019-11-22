package com.success.animationdemo

import android.graphics.drawable.AnimatedVectorDrawable
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat
import com.success.animationdemo.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var isChecked = true
        avdImage.setOnClickListener{
            if (isChecked)
            checkToClose()
            else
                closeToCheck()

            isChecked = !isChecked
        }

    }

    private fun closeToCheck() {
        avdImage.setImageResource(R.drawable.avd_close_to_check)
        val avdCheckToClose: AnimatedVectorDrawableCompat = avdImage.drawable as AnimatedVectorDrawableCompat
        avdCheckToClose.start()}

    private fun checkToClose() {
       avdImage.setImageResource(R.drawable.avd_check_to_close)
        val avdCheckToClose: AnimatedVectorDrawableCompat = avdImage.drawable as AnimatedVectorDrawableCompat
        avdCheckToClose.start()
    }
}
