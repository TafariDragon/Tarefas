package com.example.tarefas

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        Handler(Looper.getMainLooper()).postDelayed({
           startActivity(Intent(this,ListActivity::class.java))
        },3000)


    }

}