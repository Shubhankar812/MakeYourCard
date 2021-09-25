package com.example.makeyourcard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val btn = findViewById<Button>(R.id.birthday_card)

        btn.setOnClickListener {

             val nameInput = findViewById<TextView>(R.id.user_input)
           val name = nameInput.editableText.toString()

            val intent = Intent(this, BirthdayActivity::class.java)
           intent.putExtra(BirthdayActivity.NameExtra,name)
            startActivity(intent)
        }

        val btn1 = findViewById<Button>(R.id.congrats_card)
        btn1.setOnClickListener {
            val nameinput = findViewById<TextView>(R.id.user_input)
            val name = nameinput.editableText.toString()

            val intent = Intent(this, CongratulationsCard::class.java)
            intent.putExtra(CongratulationsCard.Name_Extra,name)
            startActivity(intent)
        }
    }
}


