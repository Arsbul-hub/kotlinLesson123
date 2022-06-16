package com.example.mp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first)
        val button: Button = findViewById(R.id.next)
        button.setOnClickListener {
            val intent = Intent(this@FirstActivity, secondActivity::class.java)
            startActivity(intent)
        }
    }
//    fun k(ggg: View){
//        print(123)
//        val intent = Intent(this@First1Activity, second::class.java)
//        startActivity(intent)
//    }
}