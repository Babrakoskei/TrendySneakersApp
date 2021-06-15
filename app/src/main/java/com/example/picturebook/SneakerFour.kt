package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SneakerFour : AppCompatActivity() {
    lateinit var btn6: Button
    lateinit var btn7: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sneaker_four)
        castView()
        onClick()
    }

    fun castView() {
        btn6 = findViewById(R.id.btn6)
        btn7 = findViewById(R.id.btn7)

    }

    fun onClick() {
        btn7.setOnClickListener {
            val intent = Intent(baseContext, SneakerFive::class.java)
            startActivity(intent)
        }
        btn6.setOnClickListener {
            val intent= Intent(baseContext,SneakerThree::class.java)
            startActivity(intent)
        }
    }

}