package com.apolofreitas.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        val diceImage1: ImageView = findViewById(R.id.dice_image_1)
        val diceImage2: ImageView = findViewById(R.id.dice_image_2)
        diceImage1.setImageResource(getRandomDiceResource())
        diceImage2.setImageResource(getRandomDiceResource())
    }

    private fun getRandomDiceResource() : Int {
        val randomInt = (1..6).random()
        val diceResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }
        return diceResource
    }

}