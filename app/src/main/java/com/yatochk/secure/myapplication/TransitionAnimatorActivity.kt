package com.yatochk.secure.myapplication

import android.os.Bundle
import android.transition.TransitionManager
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet
import kotlinx.android.synthetic.main.activity_animator.*
import kotlinx.android.synthetic.main.activity_main.button

class TransitionAnimatorActivity : AppCompatActivity() {

    private val startSet = ConstraintSet()
    private val endSet = ConstraintSet()
    private var reverse = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animator)

        startSet.clone(main_container)
        endSet.clone(this, R.layout.scene_a)

        button.setOnClickListener {
            startAnimation(reverse)
            reverse = !reverse
        }
    }

    private fun startAnimation(reverse: Boolean) {
        TransitionManager.beginDelayedTransition(main_container)
        (if (reverse) startSet else endSet).applyTo(main_container)
    }

}