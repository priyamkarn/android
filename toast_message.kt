package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonuploads=findViewById<Button>(R.id.btnupload)
        val buttondownload=findViewById<Button>(R.id.btndownload)
        buttonuploads.setOnClickListener{
            Toast.makeText(applicationContext,"uploading...",Toast.LENGTH_SHORT).show()
        }
        buttondownload.setOnClickListener{
            Toast.makeText(applicationContext,"downloading...",Toast.LENGTH_SHORT).show()
        }
    }
}
