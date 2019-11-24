package com.yatochk.secure.myapplication

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class PropertyAnimatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            startAnimation(it)
        }
    }

    private fun startAnimation(view: View) {
        view.animate()
            .translationY(200f)
            .setDuration(250)
            .start()
    }

}