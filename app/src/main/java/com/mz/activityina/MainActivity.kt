package com.mz.activityina

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var imageButton = findViewById<ImageButton>(R.id.imageView3)
       imageButton.setOnClickListener {
           val Intent = Intent ( this, MainActivity2::class.java)
           startActivity(Intent)
       }
    }
}