package com.example.a20012011119_pavanpatel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class Secondactivity : AppCompatActivity() {
    lateinit var tv1:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondactivity)
        tv1=findViewById(R.id.textview1)
        val intent1=intent
        val displayText=intent1.getStringExtra("MainActivity").toString()
        tv1.text=displayText

    }
}