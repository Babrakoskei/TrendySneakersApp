package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SneakerTwo : AppCompatActivity() {
    lateinit var btn3:Button
    lateinit var btn2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sneaker_two)
        castView()
        onClick()



    }
    fun castView(){
        btn3= findViewById(R.id.btn3)
        btn2= findViewById(R.id.btn2)

    }
    fun onClick(){
        btn2.setOnClickListener {
            val intent= Intent(baseContext,MainActivity::class.java)
            startActivity(intent)
        }
        btn3.setOnClickListener {
            val intent= Intent(baseContext,SneakerThree::class.java)
            startActivity(intent)
        }

    }
    }
