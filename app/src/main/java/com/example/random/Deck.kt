package com.example.random

class Deck() {
    var listOfCards = mutableListOf<Card>()
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


    init{
        listOfCards.add(Card(R.drawable.diamond2, 2, "Diamond"))
        listOfCards.add(daimond3)
        listOfCards.add(daimond4)
        listOfCards.add(daimond5)
        listOfCards.add(daimond6)
        listOfCards.add(daimond7)
        listOfCards.add(daimond8)
        listOfCards.add(daimond9)
        listOfCards.add(daimond10)
        listOfCards.add(daimondj)
        listOfCards.add(daimondq)
        listOfCards.add(daimondk)
        listOfCards.add(daimonda)
        listOfCards.add(club2)
        listOfCards.add(club3)
        listOfCards.add(club4)
        listOfCards.add(club5)
        listOfCards.add(club6)
        listOfCards.add(club7)
        listOfCards.add(club8)
        listOfCards.add(club9)
        listOfCards.add(club10)
        listOfCards.add(clubj)
        listOfCards.add(clubq)
        listOfCards.add(clubk)
        listOfCards.add(clubsa)
        listOfCards.add(heart2)
        listOfCards.add(heart3)
        listOfCards.add(heart4)
        listOfCards.add(heart5)
        listOfCards.add(heart6)
        listOfCards.add(heart7)
        listOfCards.add(heart8)
        listOfCards.add(heart9)
        listOfCards.add(heart10)
        listOfCards.add(heartj)
        listOfCards.add(heartq)
        listOfCards.add(heartk)
        listOfCards.add(hearta)
        listOfCards.add(spades_2)
        listOfCards.add(spades_3)
        listOfCards.add(spades_4)
        listOfCards.add(spades_5)
        listOfCards.add(spades_6)
        listOfCards.add(spades_7)
        listOfCards.add(spades_8)
        listOfCards.add(spades_9)
        listOfCards.add(spades_10)
        listOfCards.add(spades_j)
        listOfCards.add(spades_q)
        listOfCards.add(spades_k)
        listOfCards.add(spades_a)
    }

    fun getRandomCard() : Card{
        return listOfCards[randomNumber()]
    }

    fun randomNumber() : Int {
        return ( 0 until listOfCards.size - 1).random()
    }

    // kortlista = [kort1, kort2, kort3, kort4, kort5] kortlista.size = 5
    // 0,1,2,3,4
    // kortlista[5] =




}

