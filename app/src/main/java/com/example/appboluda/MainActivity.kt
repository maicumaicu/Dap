 package com.example.appboluda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
     var q:Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txt = findViewById<TextView>(R.id.txt)
        val rl = findViewById<RelativeLayout>(R.id.rl)
        val b1 = findViewById<Button>(R.id.b1)
        val b2 = findViewById<Button>(R.id.b2)
        val b3 = findViewById<Button>(R.id.b3)
        val b4 = findViewById<Button>(R.id.b4)

        b1.setOnClickListener {

            txt.visibility = View.VISIBLE
        }
        b2.setOnClickListener {
            txt.visibility = View.INVISIBLE
        }
        b3.setOnClickListener {
            var color = txt.currentTextColor
            if (txt.currentTextColor == -1){
                txt.setTextColor(getColor(R.color.teal_700))
            }else{
                txt.setTextColor(getColor(R.color.white))
            }

        }
        b4.setOnClickListener {

            if (!q){
                rl.setBackgroundColor(getColor(R.color.purple_700))
                q = true
            }else{
                rl.setBackgroundColor(getColor(R.color.black))
                q = false
            }
        }
    }
}