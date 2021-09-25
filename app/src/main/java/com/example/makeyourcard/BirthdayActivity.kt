package com.example.makeyourcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class BirthdayActivity : AppCompatActivity() {
    companion object{

        const val NameExtra = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday)
        val name = intent.getStringExtra(NameExtra)

        val Bwish = findViewById<TextView>(R.id.BirthdayWish)
        Bwish.text = "Happy Birthday $name"

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
    }
}