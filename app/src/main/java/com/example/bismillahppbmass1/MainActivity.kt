package com.example.bismillahppbmass1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import com.example.bismillahppbmass1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)

        button1.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
        }

        button2.setOnClickListener {
            startActivity(Intent(this, register::class.java))
        }

        button3.setOnClickListener {
            startActivity(Intent(this, Halaman_Dev::class.java))
        }

        button4.setOnClickListener {
            startActivity(Intent(this, Review::class.java))
        }

    }
}
