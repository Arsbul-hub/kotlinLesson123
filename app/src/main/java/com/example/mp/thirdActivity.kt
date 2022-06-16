package com.example.mp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class thirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third)
        val button: Button = findViewById(R.id.back)
        button.setOnClickListener {
            val intent = Intent(this@thirdActivity, secondActivity::class.java)
            startActivity(intent)
        }
    }
}