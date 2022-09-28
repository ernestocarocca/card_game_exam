package com.example.random

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import kotlin.math.absoluteValue

lateinit var scoreView : TextView
lateinit var click1 :TextView
class Newactivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_newactivity)
        scoreView = findViewById(R.id.pointsView)
        click1 = findViewById(R.id.clickCountView)


        val score = intent.getIntExtra("scoreResult", 0 )
      var click  =  intent.getIntExtra("clickcount", 0)
        var score2 = intent.getDoubleExtra("score",0.0)

        scoreView.text= "SCORE $score "
        click1.text= "Success rate ${score2.toInt()} %"



    }


    }
