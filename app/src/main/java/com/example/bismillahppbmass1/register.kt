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

class register : AppCompatActivity() {
    private lateinit var username2: EditText
    private lateinit var nomor_tlp: EditText
    private lateinit var password2: EditText
    private lateinit var buttonregister: Button
    private lateinit var textViewError2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        username2 = findViewById(R.id.username2)
        nomor_tlp = findViewById(R.id.nomor_tlp)
        password2 = findViewById(R.id.password2)
        buttonregister = findViewById(R.id.buttonregister)
        textViewError2 = findViewById(R.id.textViewError2)

        // Menambahkan TextWatcher untuk memeriksa perubahan pada kedua field
        username2.addTextChangedListener(textWatcher)
        nomor_tlp.addTextChangedListener(textWatcher)
        password2.addTextChangedListener(textWatcher)

        // Menambahkan onClickListener untuk tombol login
        buttonregister.setOnClickListener {
            // Logika login dapat ditambahkan di sini
            val username2 = username2.text.toString()
            val nomor_tlp = nomor_tlp.text.toString()
            val password2 = password2.text.toString()

            // Contoh: Validasi sederhana, username dan password tidak boleh kosong
            if (username2.isNotEmpty() && nomor_tlp.isNotEmpty() && password2.isNotEmpty()) {
                // Logika login berhasil
                textViewError2.text = ""

                // Pindah ke halaman Desk
                val intent = Intent(this, Login::class.java)
                startActivity(intent)
            } else {
                textViewError2.text = "Data not yet filled"
            }
        }
    }

    // TextWatcher untuk memeriksa perubahan pada kedua field
    private val textWatcher = object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

        override fun afterTextChanged(s: Editable?) {
            // Memeriksa apakah kedua field sudah terisi untuk mengaktifkan atau menonaktifkan tombol login
            val username2 = username2.text.toString()
            val nomor_tlp = nomor_tlp.text.toString()
            val password2 = password2.text.toString()
            buttonregister.isEnabled = username2.isNotEmpty() && nomor_tlp.isNotEmpty() && password2.isNotEmpty()
        }
    }
}