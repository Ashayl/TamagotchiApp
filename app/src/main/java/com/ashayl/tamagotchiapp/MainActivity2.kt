package com.ashayl.tamagotchiapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {
    //make sure that the number doesn't go low or to 0
    private var hungry=5
    private var cleanliness=5
    private var happiness=5
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val image= findViewById<ImageView>(R.id.imageView2)

        val HungryTextView=findViewById<EditText>(R.id.HungryEditText)
        val CleanlinessEditText=findViewById<EditText>(R.id.CleanlinessEditText)
        val HappinessEditText=findViewById<EditText>(R.id.HappinessEditText)

        val FeedButton=findViewById<Button>(R.id.FeedButton)
        val CleanButton=findViewById<Button>(R.id.CleanButton)
        val PlayButton=findViewById<Button>(R.id.PlayButton)

        //initially set text values
        HungryTextView.setText(hungry.toString())
        CleanlinessEditText.setText(cleanliness.toString())
        HappinessEditText.setText(happiness.toString())

        //eating button
        //handling so button clicks
        FeedButton.setOnClickListener {
            hungry -=0
            hungry +=10
            HungryTextView.setText(hungry.toString())
            image.setImageResource(R.drawable.puppyeating)

            //cleanliness
            CleanButton.setOnClickListener {
                cleanliness+=10
                CleanlinessEditText.setText(cleanliness.toString())
                image.setImageResource(R.drawable.puppyclean)

                //happiness
                PlayButton.setOnClickListener {
                    happiness+=10
                    HappinessEditText.setText(happiness.toString())
                    image.setImageResource(R.drawable.happypuppy)

                }
            }
        }

    }
}