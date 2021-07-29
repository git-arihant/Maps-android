package com.example.maps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val decath: Button = findViewById(R.id.button)
        decath.setOnClickListener {
            val i = Intent(this, Decathlon::class.java)

            val lat : Double=30.619681088872856
            val lng : Double=76.82430238226392
            i.putExtra("latitude",lat)
            i.putExtra("longitude",lng)
            startActivity(i)
        }

        val dmart: Button = findViewById(R.id.button3)
        dmart.setOnClickListener {
            val i = Intent(this, Decathlon::class.java)

            val lat : Double=30.620428524720115
            val lng : Double=76.8219193822639
            i.putExtra("latitude",lat)
            i.putExtra("longitude",lng)
            startActivity(i)
        }
    }
}
