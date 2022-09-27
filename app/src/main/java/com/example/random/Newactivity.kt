package com.example.random

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import kotlin.math.absoluteValue

lateinit var scoreView : TextView
lateinit var click :TextView
class Newactivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_newactivity)
        scoreView = findViewById(R.id.pointsView)
        click = findViewById(R.id.clickCountView)


        var score  = intent.getIntExtra("scoreResult", 0 )
       var guess=  intent.getIntExtra("clickcount", 0)
        scoreView.text= "Total Score ${score}"
        click.text = "Total quess ${guess}"

    }


    }
