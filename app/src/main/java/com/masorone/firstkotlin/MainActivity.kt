package com.masorone.firstkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var editTextName: EditText
    private lateinit var textViewHello: TextView
    private lateinit var buttonHello: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        init()
    }

    private fun initViews() {
        editTextName = findViewById(R.id.edit_text_name)
        textViewHello = findViewById(R.id.text_view_hello)
        buttonHello = findViewById(R.id.button_hello)
    }

    private fun init() = buttonHello.setOnClickListener {
        greetUser()
    }

    private fun greetUser() {
        val userName = editTextName.text.toString().trim()
        textViewHello.text = resources.getString(R.string.hello_user, userName)
    }
}