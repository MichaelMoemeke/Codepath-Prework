package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))
        }

        findViewById<Button>(R.id.button2).setOnClickListener {
            findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.backgroundView).setBackgroundColor(getResources().getColor((R.color.purple_200)))
        }
    }
}