package com.example.nothing

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener{
    private lateinit var FirstsSocre: TextView
    private lateinit var SecondsScore: TextView
    private lateinit var Button1: Button
    private lateinit var Button2: Button
    private lateinit var Button3: Button
    private lateinit var Button4: Button
    private lateinit var Button5: Button
    private lateinit var Button6: Button
    private lateinit var Button7: Button
    private lateinit var Button8: Button
    private lateinit var Button9: Button
    private lateinit var Reset: Button

    var winnerPlayer = 0
    var length1 = 0
    var length2 = 0


    var activePlayer = 1

    private var firstPlayersScore = 0
    private var secondPlayersScore = 0


    private var firstPlayer = ArrayList<Int>()
    private var secondPlayer = ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }
    private fun init(){
        Button1 = findViewById(R.id.Button1)
        Button2 = findViewById(R.id.Button2)
        Button3 = findViewById(R.id.Button3)
        Button4 = findViewById(R.id.Button4)
        Button5 = findViewById(R.id.Button5)
        Button6 = findViewById(R.id.Button6)
        Button7 = findViewById(R.id.Button7)
        Button8 = findViewById(R.id.Button8)
        Button9 = findViewById(R.id.Button9)
        Reset = findViewById((R.id.Reset))
        FirstsSocre = findViewById(R.id.FirstsScore)
        SecondsScore = findViewById(R.id.SecondsScore)


        Button1.setOnClickListener(this)
        Button2.setOnClickListener(this)
        Button3.setOnClickListener(this)
        Button4.setOnClickListener(this)
        Button5.setOnClickListener(this)
        Button6.setOnClickListener(this)
        Button7.setOnClickListener(this)
        Button8.setOnClickListener(this)
        Button9.setOnClickListener(this)
        Reset.setOnClickListener{
            reset()
        }
    }
    private fun disableButtons() {
        Button1.isEnabled = false
        Button2.isEnabled = false
        Button3.isEnabled = false
        Button4.isEnabled = false
        Button5.isEnabled = false
        Button6.isEnabled = false
        Button7.isEnabled = false
        Button8.isEnabled = false
        Button9.isEnabled = false
    }
    override fun onClick(clickedView: View?) {

        var buttonNumber = 0

        if (clickedView is Button) {

            when (clickedView.id) {
                R.id.Button1 -> buttonNumber = 1
                R.id.Button2 -> buttonNumber = 2
                R.id.Button3 -> buttonNumber = 3
                R.id.Button4 -> buttonNumber = 4
                R.id.Button5 -> buttonNumber = 5
                R.id.Button6 -> buttonNumber = 6
                R.id.Button7 -> buttonNumber = 7
                R.id.Button8 -> buttonNumber = 8
                R.id.Button9 -> buttonNumber = 9
            }
        }

        if (buttonNumber != 0) {
            playGame(buttonNumber, clickedView as Button)
        }

    }
    private fun playGame(buttonNumber: Int, clickedView: Button) {

        if (activePlayer == 1){
            clickedView.text = "X"
            activePlayer = 2
            firstPlayer.add(buttonNumber)
        }else if (activePlayer == 2){
            clickedView.text = "0"
            activePlayer = 1
            secondPlayer.add(buttonNumber)
        }
        clickedView.isEnabled = false
        check()
    }

    private fun check() {
        var firsPlayer = 0
        var secondplayer = 0
        var winnerPlayer = 0
        var length1 = firstPlayer.size
        var length2 = secondPlayer.size

        if (firstPlayer.contains(1) && firstPlayer.contains(2) && firstPlayer.contains(3)) {
            winnerPlayer = 1
            firstPlayersScore += 1
            FirstsSocre.text = firstPlayersScore.toString()
            Button4.isEnabled = false
            Button5.isEnabled = false
            Button6.isEnabled = false
            Button7.isEnabled = false
            Button8.isEnabled = false
            Button9.isEnabled = false
        }
        if (secondPlayer.contains(1) && secondPlayer.contains(2) && secondPlayer.contains(3)) {
            winnerPlayer = 2
            secondPlayersScore += 1
            SecondsScore.text = secondPlayersScore.toString()
            Button4.isEnabled = false
            Button5.isEnabled = false
            Button6.isEnabled = false
            Button7.isEnabled = false
            Button8.isEnabled = false
            Button9.isEnabled = false
        }
        if (firstPlayer.contains(4) && firstPlayer.contains(5) && firstPlayer.contains(6)) {
            winnerPlayer = 1
            firstPlayersScore += 1
            FirstsSocre.text = firstPlayersScore.toString()
            Button1.isEnabled = false
            Button2.isEnabled = false
            Button3.isEnabled = false
            Button7.isEnabled = false
            Button8.isEnabled = false
            Button9.isEnabled = false
        }
        if (secondPlayer.contains(4) && secondPlayer.contains(5) && secondPlayer.contains(6)) {
            winnerPlayer = 2
            secondPlayersScore += 1
            SecondsScore.text = secondPlayersScore.toString()
            Button1.isEnabled = false
            Button2.isEnabled = false
            Button3.isEnabled = false
            Button7.isEnabled = false
            Button8.isEnabled = false
            Button9.isEnabled = false
        }
        if (firstPlayer.contains(7) && firstPlayer.contains(8) && firstPlayer.contains(9)) {
            winnerPlayer = 1
            firstPlayersScore += 1
            FirstsSocre.text = firstPlayersScore.toString()
            Button1.isEnabled = false
            Button2.isEnabled = false
            Button3.isEnabled = false
            Button4.isEnabled = false
            Button5.isEnabled = false
            Button6.isEnabled = false
        }
        if (secondPlayer.contains(7) && secondPlayer.contains(8) && secondPlayer.contains(9)) {
            winnerPlayer = 2
            secondPlayersScore += 1
            SecondsScore.text = secondPlayersScore.toString()
            Button1.isEnabled = false
            Button2.isEnabled = false
            Button3.isEnabled = false
            Button4.isEnabled = false
            Button5.isEnabled = false
            Button6.isEnabled = false
        }
        if (firstPlayer.contains(1) && firstPlayer.contains(4) && firstPlayer.contains(7)) {
            winnerPlayer = 1
            firstPlayersScore += 1
            FirstsSocre.text = firstPlayersScore.toString()
            Button2.isEnabled = false
            Button3.isEnabled = false
            Button5.isEnabled = false
            Button6.isEnabled = false
            Button8.isEnabled = false
            Button9.isEnabled = false
        }
        if (secondPlayer.contains(1) && secondPlayer.contains(4) && secondPlayer.contains(7)) {
            winnerPlayer = 2
            secondPlayersScore += 1
            SecondsScore.text = secondPlayersScore.toString()
            Button2.isEnabled = false
            Button3.isEnabled = false
            Button5.isEnabled = false
            Button6.isEnabled = false
            Button8.isEnabled = false
            Button9.isEnabled = false
        }
        if (firstPlayer.contains(2) && firstPlayer.contains(5) && firstPlayer.contains(8)) {
            winnerPlayer = 1
            firstPlayersScore += 1
            FirstsSocre.text = firstPlayersScore.toString()
            Button1.isEnabled = false
            Button3.isEnabled = false
            Button4.isEnabled = false
            Button6.isEnabled = false
            Button7.isEnabled = false
            Button8.isEnabled = false
        }
        if (secondPlayer.contains(2) && secondPlayer.contains(5) && secondPlayer.contains(8)) {
            winnerPlayer = 2
            secondPlayersScore += 1
            SecondsScore.text = secondPlayersScore.toString()
            Button1.isEnabled = false
            Button3.isEnabled = false
            Button4.isEnabled = false
            Button6.isEnabled = false
            Button7.isEnabled = false
            Button8.isEnabled = false
        }
        if (firstPlayer.contains(3) && firstPlayer.contains(6) && firstPlayer.contains(9)) {
            winnerPlayer = 1
            firstPlayersScore += 1
            FirstsSocre.text = firstPlayersScore.toString()
            Button1.isEnabled = false
            Button2.isEnabled = false
            Button4.isEnabled = false
            Button5.isEnabled = false
            Button7.isEnabled = false
            Button8.isEnabled = false
        }
        if (secondPlayer.contains(3) && secondPlayer.contains(6) && secondPlayer.contains(9)) {
            winnerPlayer = 2
            secondPlayersScore += 1
            SecondsScore.text = secondPlayersScore.toString()
            Button1.isEnabled = false
            Button2.isEnabled = false
            Button4.isEnabled = false
            Button5.isEnabled = false
            Button7.isEnabled = false
            Button8.isEnabled = false
        }
        if (firstPlayer.contains(1) && firstPlayer.contains(5) && firstPlayer.contains(9)) {
            winnerPlayer = 1
            firstPlayersScore += 1
            FirstsSocre.text = firstPlayersScore.toString()
            Button2.isEnabled = false
            Button3.isEnabled = false
            Button4.isEnabled = false
            Button6.isEnabled = false
            Button7.isEnabled = false
            Button8.isEnabled = false
        }
        if (secondPlayer.contains(1) && secondPlayer.contains(5) && secondPlayer.contains(9)) {
            winnerPlayer = 2
            secondPlayersScore += 1
            SecondsScore.text = secondPlayersScore.toString()
            Button2.isEnabled = false
            Button3.isEnabled = false
            Button4.isEnabled = false
            Button6.isEnabled = false
            Button7.isEnabled = false
            Button8.isEnabled = false
        }
        if (firstPlayer.contains(3) && firstPlayer.contains(5) && firstPlayer.contains(7)) {
            winnerPlayer = 1
            firstPlayersScore += 1
            FirstsSocre.text = firstPlayersScore.toString()
            Button1.isEnabled = false
            Button2.isEnabled = false
            Button4.isEnabled = false
            Button6.isEnabled = false
            Button8.isEnabled = false
            Button9.isEnabled = false
        }
        if (secondPlayer.contains(3) && secondPlayer.contains(5) && secondPlayer.contains(7)) {
            winnerPlayer = 2
            secondPlayersScore += 1
            SecondsScore.text = secondPlayersScore.toString()
            Button1.isEnabled = false
            Button2.isEnabled = false
            Button4.isEnabled = false
            Button6.isEnabled = false
            Button8.isEnabled = false
            Button9.isEnabled = false
        }
        if (winnerPlayer == 1){
            Toast.makeText(applicationContext, "X won", Toast.LENGTH_SHORT).show()
            disableButtons()
        }else if (winnerPlayer == 2){
            Toast.makeText(applicationContext, "0 won", Toast.LENGTH_SHORT).show()
            disableButtons()
        }
        else if(length1 + length2 == 9 && winnerPlayer != 1 && winnerPlayer != 2){
            Toast.makeText(applicationContext,"Draw", Toast.LENGTH_SHORT).show()
        }
    }
    fun reset() {

        Button1.isEnabled = true
        Button1.text = ""
        Button2.isEnabled = true
        Button2.text = ""
        Button3.isEnabled = true
        Button3.text = ""
        Button4.isEnabled = true
        Button4.text = ""
        Button5.isEnabled = true
        Button5.text = ""
        Button6.isEnabled = true
        Button6.text = ""
        Button7.isEnabled = true
        Button7.text = ""
        Button8.isEnabled = true
        Button8.text = ""
        Button9.isEnabled = true
        Button9.text = ""

        firstPlayer.clear()
        secondPlayer.clear()
        activePlayer = 1
    }
}

