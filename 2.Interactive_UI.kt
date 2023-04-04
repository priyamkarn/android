//entire screen color change on clicking btn
package com.example.interactiveui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttondark=findViewById<Button>(R.id.btndark)
        val buttonread=findViewById<Button>(R.id.btnlight)
        val layout=findViewById<LinearLayout>(R.id.LinearLayout)

        buttonread.setOnClickListener{
            //change to light mode
            layout.setBackgroundResource(R.color.yellow)
        }
        buttondark.setOnClickListener{
            //change to light mode
            layout.setBackgroundResource(R.color.black)
        }
    }
}
