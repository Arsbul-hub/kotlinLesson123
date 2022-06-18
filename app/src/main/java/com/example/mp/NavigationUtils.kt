package com.example.mp

import android.content.Intent
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class NavigationUtils {
    fun j(this_screen: AppCompatActivity, next_screen: AppCompatActivity){
        print(123)
        val intent = Intent(this_screen, next_screen::class.java)
        this_screen.startActivity(intent)
    }
}