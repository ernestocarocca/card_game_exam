package com.example.random

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var points = 0
    lateinit var scoreView: TextView
    lateinit var resultView: TextView
    var scoreResult = 0
    var clickcount = 0
    var minus = 1
    lateinit var deck: MutableList<Card>


    //hej
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        deck = mutableListOf()
        var daimond2 = Card(R.drawable.diamond2, 2, "Diamond")
        var daimond3 = Card(R.drawable.diamond3, 3, "Diamond")
        var daimond4 = Card(R.drawable.diamond4, 4, "Diamond")
        var daimond5 = Card(R.drawable.diamond5, 5, "Diamond")
        var daimond6 = Card(R.drawable.diamond6, 6, "Diamond")
        var daimond7 = Card(R.drawable.diamond7, 7, "Diamond")
        var daimond8 = Card(R.drawable.diamond8, 8, "Diamond")
        var daimond9 = Card(R.drawable.diamond9, 9, "Diamond")
        var daimond10 = Card(R.drawable.diamond10, 10, "Diamond")
        var daimondj = Card(R.drawable.daimondj, 11, "Diamond")
        var daimondq = Card(R.drawable.daimondq, 12, "Diamond")
        var daimonda = Card(R.drawable.daimondk, 13, "Diamond")
        var daimondk = Card(R.drawable.daimond_a, 14, "Diamond")

        var club2 = Card(R.drawable.clubs2, 2, "clubs")
        var club3 = Card(R.drawable.clubs3, 3, "clubs")
        var club4 = Card(R.drawable.clubs4, 4, "clubs")
        var club5 = Card(R.drawable.clubs5, 5, "clubs")
        var club6 = Card(R.drawable.clubs6, 6, "clubs")
        var club7 = Card(R.drawable.clubs7, 7, "clubs")
        var club8 = Card(R.drawable.clubs8, 8, "clubs")
        var club9 = Card(R.drawable.clubs9, 9, "clubs")
        var club10 = Card(R.drawable.clubs10, 10, "clubs")
        var clubj = Card(R.drawable.clubsj, 11, "clubs")
        var clubq = Card(R.drawable.clubsq, 12, "clubs")
        var clubk = Card(R.drawable.clubsk, 13, "clubs")
        var clubsa = Card(R.drawable.clubsa, 14, "clubs")

        var heart2 = Card(R.drawable.heart2, 2, "heart")
        var heart3 = Card(R.drawable.heart3, 3, "heart")
        var heart4 = Card(R.drawable.heart4, 4, "heart")
        var heart5 = Card(R.drawable.heart5, 5, "heart")
        var heart6 = Card(R.drawable.heart6, 6, "heart")
        var heart7 = Card(R.drawable.heart7, 7, "heart")
        var heart8 = Card(R.drawable.heart8, 8, "heart")
        var heart9 = Card(R.drawable.heart9, 9, "heart")
        var heart10 = Card(R.drawable.heart_a10, 10, "heart")
        var heartj = Card(R.drawable.heartj, 11, "heart")
        var heartq = Card(R.drawable.heartq, 12, "heart")
        var heartk = Card(R.drawable.heartk, 13, "heart")
        var hearta = Card(R.drawable.hearta, 14, "heart")


        var spades_2 = Card(R.drawable.spades2, 2, "spades")
        var spades_3 = Card(R.drawable.spades3, 3, "spades")
        var spades_4 = Card(R.drawable.spades4, 4, "spades")
        var spades_5 = Card(R.drawable.spades5, 5, "spades")
        var spades_6 = Card(R.drawable.spades6, 6, "spades")
        var spades_7 = Card(R.drawable.spades7, 7, "spades")
        var spades_8 = Card(R.drawable.spades8, 8, "spades")
        var spades_9 = Card(R.drawable.spades9, 9, "spades")
        var spades_10 = Card(R.drawable.spades10, 10, "spades")
        var spades_j = Card(R.drawable.spadesj, 11, "spades")
        var spades_q = Card(R.drawable.spadesq, 12, "spades")
        var spades_k = Card(R.drawable.spadesk, 13, "spades")
        var spades_a = Card(R.drawable.spadesa, 14, "spades")


//      lista med korten
        deck.add(daimond2)
        deck.add(daimond3)
        deck.add(daimond4)
        deck.add(daimond5)
        deck.add(daimond6)
        deck.add(daimond7)
        deck.add(daimond8)
        deck.add(daimond9)
        deck.add(daimond10)
        deck.add(daimondj)
        deck.add(daimondq)
        deck.add(daimondk)
        deck.add(daimonda)


        deck.add(club2)
        deck.add(club3)
        deck.add(club4)
        deck.add(club5)
        deck.add(club6)
        deck.add(club7)
        deck.add(club8)
        deck.add(club9)
        deck.add(club10)
        deck.add(clubj)
        deck.add(clubq)
        deck.add(clubk)
        deck.add(clubsa)


        deck.add(heart2)
        deck.add(heart3)
        deck.add(heart4)
        deck.add(heart5)
        deck.add(heart6)
        deck.add(heart7)
        deck.add(heart8)
        deck.add(heart9)
        deck.add(heart10)
        deck.add(heartj)
        deck.add(heartq)
        deck.add(heartk)
        deck.add(hearta)




        deck.add(spades_2)
        deck.add(spades_3)
        deck.add(spades_4)
        deck.add(spades_5)
        deck.add(spades_6)
        deck.add(spades_7)
        deck.add(spades_8)
        deck.add(spades_9)
        deck.add(spades_10)
        deck.add(spades_j)
        deck.add(spades_q)
        deck.add(spades_k)
        deck.add(spades_a)


        val startIntent = Intent(this, MainActivityfirstside::class.java)
        startActivity(startIntent)

        val imageView = findViewById<ImageView>(R.id.imageView2)
        scoreView = findViewById(R.id.scoreView)
        resultView = findViewById(R.id.resultView)
        var offButton = findViewById<ImageButton>(R.id.offButtonView)
        var clickcount = 1
        var newCard: Card
        var currentCard = deck[random()]

        imageView.setImageResource(currentCard.image)


        val button_higher = findViewById<Button>(R.id.buttonHigher)
        button_higher.setOnClickListener {
            newCard = deck[random()]
            clickcount++

            if (currentCard.value < newCard.value) {
                points++
                scoreView.text = "SCORE : $points"
                resultView.text = "YOU GUESSED RIGHT "


            }
            else {
                if (points >= 1) {


                    points = points - minus
                    if (points >= 0) {
                        scoreView.text = "SCORE: $points"
                        resultView.text = "YOU GUESSED WRONG"
                    }

                }
            }

            currentCard = newCard
            imageView.setImageResource(newCard.image)
        }


        var button_lower = findViewById<Button>(R.id.buttonLower)
        button_lower.setOnClickListener {
            newCard = deck[random()]
            clickcount++

            if (currentCard.value > newCard.value) {
                points++
                scoreView.text = "SCORE :$points "
                resultView.text = "YOU GUESSED RIGHT "
            } else {
                if (points >= 1) {

                    points = points - minus
                    if (points >= 0) {
                        scoreView.text = "SCORE: $points"
                        resultView.text = "YOU GUESSED WRONG"
                    }

                }
            }

            currentCard = newCard
            imageView.setImageResource(newCard.image)
        }


        offButton.setOnClickListener {

            scoreResult = points


            val intent = Intent(this, Newactivity::class.java)



            intent.putExtra("scoreResult", scoreResult)
            intent.putExtra("clickcount", clickcount)
            var score = scoreResult.toDouble() / clickcount.toDouble() * 100

            intent.putExtra("score", score)

            startActivity(intent)
        }
//

    }

    fun random(): Int {
        var RandomCard = (0 until deck.size).random()
        return RandomCard


    }

}


class Card(var image: Int, var value: Int, suite: String) {

}


