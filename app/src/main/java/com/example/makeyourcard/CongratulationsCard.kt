package com.example.makeyourcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class CongratulationsCard : AppCompatActivity() {
    companion object{
        val Name_Extra = "Name_Extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_congratulations_card)
        val Name = intent.getStringExtra(Name_Extra)

        val ConWish = findViewById<TextView>(R.id.CongratsWish)
        ConWish.text = "Congratulation \t\t\t\t$Name "

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
    }
}