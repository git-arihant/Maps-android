package com.example.maps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val mon: Button = findViewById(R.id.button)
        mon.setOnClickListener {
            runhere1()
        }
    }

    private fun runhere1() {
        val intent = Intent(this, Decathlon::class.java)
        startActivity(intent)
    }
}