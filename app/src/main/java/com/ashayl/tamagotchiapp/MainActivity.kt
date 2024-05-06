package com.ashayl.tamagotchiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var LetsGoButton:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        LetsGoButton=findViewById(R.id.LetsGoButton)

        LetsGoButton.setOnClickListener {
            var intent= Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
    }
}