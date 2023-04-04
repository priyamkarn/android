package com.example.explicit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn=findViewById<Button>(R.id.button)
        btn.setOnClickListener{
            //open a new activity
            intent= Intent(applicationContext,second::class.java)
            startActivity(intent)
        }

    }
}
