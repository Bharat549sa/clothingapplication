package com.example.clothes_shoppingkotlin.Ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.clothes_shoppingkotlin.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed(
                {
                    startActivity(Intent(this@MainActivity, HomeActivity::class.java))
                    finish()
                }, 3000L)
    }
    }
