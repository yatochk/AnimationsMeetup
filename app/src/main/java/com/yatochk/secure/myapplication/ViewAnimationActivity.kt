package com.yatochk.secure.myapplication

import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class ViewAnimationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            startAnimation(it)
        }
    }

    private fun startAnimation(view: View) {
        val animation = AnimationUtils.loadAnimation(this, R.anim.view_animation)
        view.startAnimation(animation)
    }

}
