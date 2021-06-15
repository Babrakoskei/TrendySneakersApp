package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SneakerFive : AppCompatActivity() {
    lateinit var btn8: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sneaker_five)
        castView()
        onClick()
    }
    fun castView() {
        btn8= findViewById(R.id.btn8)

    }

    fun onClick() {
        btn8.setOnClickListener {
            val intent = Intent(baseContext, MainActivity::class.java)
            startActivity(intent)
        }
    }

}
