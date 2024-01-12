package com.example.bismillahppbmass1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Login : AppCompatActivity() {

    private lateinit var username: EditText
    private lateinit var password1: EditText
    private lateinit var buttonlogin: Button
    private lateinit var textViewError: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        username = findViewById(R.id.username)
        password1 = findViewById(R.id.password1)
        buttonlogin = findViewById(R.id.buttonlogin)
        textViewError = findViewById(R.id.textViewError)

        // Menambahkan TextWatcher untuk memeriksa perubahan pada kedua field
        username.addTextChangedListener(textWatcher)
        password1.addTextChangedListener(textWatcher)

        // Menambahkan onClickListener untuk tombol login
        buttonlogin.setOnClickListener {
            // Logika login dapat ditambahkan di sini
            val username = username.text.toString()
            val password = password1.text.toString()

            // Contoh: Validasi sederhana, username dan password tidak boleh kosong
            if (username.isNotEmpty() && password.isNotEmpty()) {
                // Logika login berhasil
                textViewError.text = ""

                // Pindah ke halaman Desk
                val intent = Intent(this, Desk::class.java)
                startActivity(intent)
            } else {
                textViewError.text = "Username and password required"
            }
        }
    }

    // TextWatcher untuk memeriksa perubahan pada kedua field
    private val textWatcher = object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

        override fun afterTextChanged(s: Editable?) {
            // Memeriksa apakah kedua field sudah terisi untuk mengaktifkan atau menonaktifkan tombol login
            val username = username.text.toString()
            val password = password1.text.toString()
            buttonlogin.isEnabled = username.isNotEmpty() && password.isNotEmpty()
        }
    }
}
