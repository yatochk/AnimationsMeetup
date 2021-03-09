package com.yatochk.secure.myapplication

import android.animation.ValueAnimator
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_custon_view_anim.*

class CustomViewAnimationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custon_view_anim)
        buttonStart.setOnClickListener {
            viewCustom.startAnimation()
        }
    }

}

class CustomView @JvmOverloads constructor(
    context: Context,
    attrSet: AttributeSet? = null,
    defStyle: Int = 0
) : View(context, attrSet, defStyle) {

    init {
        setWillNotDraw(false)
    }

    private var rectSize = 0f

    private val paint by lazy {
        Paint().apply {
            color = Color.MAGENTA
        }
    }

    fun startAnimation() {
        ValueAnimator().apply {
            setIntValues(0, 400)
            duration = 1000
            addUpdateListener {
                rectSize = (it.animatedValue as Int).toFloat()
                postInvalidate()
            }
            start()
        }
    }

    override fun onDraw(canvas: Canvas?) {
        canvas ?: return
        canvas.drawRect(0f, 0f, rectSize, rectSize, paint)
    }

}