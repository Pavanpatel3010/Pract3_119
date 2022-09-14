package com.example.a20012011119_pavanpatel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.EditTextPreference
import android.util.Log
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var mMessage_edittext: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mMessage_edittext = findViewById(R.id.edittext_main)
    }
    fun GoToNext(view: View) {
        Log.d("Mainactivity","Clicked.")
        val message=mMessage_edittext.text.toString()
        intent=Intent(this,Secondactivity::class.java)
        intent.putExtra("MainActivity",message)
        startActivity(intent)
    }
}