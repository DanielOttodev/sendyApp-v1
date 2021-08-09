package com.example.my_testapp

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val constraintLayout = findViewById<ConstraintLayout>(R.id.layout)
        val animationDrawable: AnimationDrawable = constraintLayout.background as AnimationDrawable
        animationDrawable.setEnterFadeDuration(2000)
        animationDrawable.setExitFadeDuration(4000)
        animationDrawable.start()
    }

    fun newPost(view: View){
        // Do something in response to button
        val intent = Intent(this, CreatePostActivity::class.java).apply {
        }
        startActivity(intent)
    }
    fun exploreBtn(view: View){
        // Do something in response to button
        val intent = Intent(this, ExploreActivity::class.java).apply {
        }
        startActivity(intent)
    }
}