package com.example.itaweek7assessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    private lateinit var phoneNumber: EditText
    private lateinit var button:ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        phoneNumber= findViewById(R.id.phone)
        button = findViewById(R.id.button)
    }
}