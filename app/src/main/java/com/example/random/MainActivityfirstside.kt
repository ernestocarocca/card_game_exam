package com.example.random

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivityfirstside : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activityfirstside)

         var strtButton = findViewById<Button>(R.id.buttonStart)
        strtButton.setOnClickListener{
          finish()
        }

    }
}