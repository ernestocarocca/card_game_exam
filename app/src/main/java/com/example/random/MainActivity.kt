package com.example.random

import android.content.Intent
import android.os.Bundle
import android.service.carrier.CarrierService
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var points = 0
    lateinit var scoreView: TextView
    lateinit var resultView: TextView
    lateinit var newCard: Card

    var scoreResult = 0
    var clickcount = 0
    var deck = Deck() // Här skapas kortleken

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startIntent = Intent(this, MainActivityfirstside::class.java)
        startActivity(startIntent)

        scoreView = findViewById(R.id.scoreView)
        resultView = findViewById(R.id.resultView)
        val imageView = findViewById<ImageView>(R.id.imageView2)
        val button_higher = findViewById<Button>(R.id.buttonHigher)
        val button_lower = findViewById<Button>(R.id.buttonLower)




        // FIRST CARD
        var currentCard = deck.getRandomCard()
        imageView.setImageResource(currentCard.image)

        // GUESS HIGHER
        button_higher.setOnClickListener {
            newCard = deck.getRandomCard()  ///    deck[random()]
            clickcount++
            if (currentCard.value < newCard.value) {
                points++
                resultView.text = "YOU GUESSED RIGHT "

                if (points == 3){
                    onWin()
                }

            } else if (points > 0) {
                points -= 1
                resultView.text = "YOU GUESSED WRONG"
            } else {
                points = 0
                resultView.text = "YOU GUESSED WRONG"
            }
            scoreView.text = "SCORE : $points "
            currentCard = newCard
            imageView.setImageResource(newCard.image)
        }

        // GUESS LOWER
        button_lower.setOnClickListener {
            newCard = deck.getRandomCard()
            clickcount++

            if (currentCard.value > newCard.value) {
                points++
                resultView.text = "YOU GUESSED RIGHT "
                if (points == 3){
                onWin()
                }
            } else if (points > 0) {
                points -= 1

            } else {
                points = 0
                resultView.text = "YOU GUESSED WRONG"
            }
            scoreView.text = "SCORE : $points "
            currentCard = newCard
            imageView.setImageResource(newCard.image)
        }
        // OFF BUTTON

    }
    fun onWin() {

        val intent = Intent(this, Newactivity::class.java)
        startActivity(intent)
    }
}







