package com.yatochk.secure.myapplication

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_preview_cat.*

class PreviewCatActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview_cat)
        cat.setOnClickListener {
            openCatActivity(it)
        }
    }

    private fun openCatActivity(cat: View) {
        val bundle = ActivityOptions.makeSceneTransitionAnimation(
            this,
            cat,
            getString(R.string.cat_transition)
        ).toBundle()

        startActivity(
            Intent(this, CatInfoActivity::class.java),
            bundle
        )
    }

}