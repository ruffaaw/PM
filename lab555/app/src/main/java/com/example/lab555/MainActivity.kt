package com.example.lab555

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myTextView = findViewById<TextView>(R.id.myTextView)
        val myImageView = findViewById<ImageView>(R.id.myImageView)
        val startNewActivityButton = findViewById<Button>(R.id.startNewActivityButton)

        myTextView.text = "Hello, World!"
        myImageView.setImageResource(R.drawable.ic_launcher_foreground)

        startNewActivityButton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}