package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SneakerThree : AppCompatActivity() {
    lateinit var btn4: Button
    lateinit var btn5: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sneaker_three)
        castView()
        onClick()

    }

    fun castView() {
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)

    }

    fun onClick() {
        btn5.setOnClickListener {
            val intent = Intent(baseContext, SneakerFour::class.java)
            startActivity(intent)
        }
        btn4.setOnClickListener {
            val intent= Intent(baseContext,SneakerTwo::class.java)
            startActivity(intent)
        }
    }
}