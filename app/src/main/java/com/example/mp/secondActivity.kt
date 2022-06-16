package com.example.mp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class secondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second)
        val next: Button = findViewById(R.id.next)
        next.setOnClickListener {
            val intent = Intent(this@secondActivity, thirdActivity::class.java)
            startActivity(intent)
        }
        val back: Button = findViewById(R.id.back)
        back.setOnClickListener {
            val intent = Intent(this@secondActivity, FirstActivity::class.java)
            startActivity(intent)
        }
    }
}