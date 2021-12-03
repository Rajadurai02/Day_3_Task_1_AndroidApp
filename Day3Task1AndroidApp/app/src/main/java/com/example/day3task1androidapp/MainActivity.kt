package com.example.day3task1androidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    var num = (0..1000).random()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numberInputView = findViewById<TextInputLayout>(R.id.inputNumber)
        val checkButtonView = findViewById<TextView>(R.id.checkButton)
        val resultView = findViewById<TextView>(R.id.result)

        checkButtonView.setOnClickListener{
            val number = numberInputView.editText?.text?.toString()
            val guessedNumber =
                if (number.isNullOrEmpty()) "0"
                else number
            if (guessedNumber != "0") {
                if (guessedNumber.toInt() == num)
                    resultView.text = "You are right!"
                else if(guessedNumber.toInt() > num)
                    resultView.text = "No:) My number is smaller"
                else
                    resultView.text = "No:) My number is bigger"
            }
            else
                resultView.text = "please enter the number"
        }
    }
}