package com.ezralee.githubtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn:Button = findViewById(R.id.btn)
        btn.setOnClickListener { Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show() }
        var a = 10
    }
}
