package com.example.bismillahppbmass1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class hasilpengujian : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasilpengujian)

        // Ambil referensi ke ListView dari layout
        val listView: ListView = findViewById(R.id.listView23)

        // Data yang akan ditampilkan di ListView
        val data = arrayOf("Pengujian 1", "Pengujian 2", "Pengujian 3")

        // Adapter untuk menghubungkan data dengan ListView
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, data)

        // Set adapter ke ListView
        listView.adapter = adapter

        // Menangani klik item pada ListView
        listView.setOnItemClickListener { _, _, position, _ ->
            val selectedItem = data[position]

            // Cek apakah yang dipilih adalah "Pengujian 1"
            if (selectedItem == "Pengujian 1") {
                // Jika ya, arahkan ke activity_detail_pengujian1
                val intent = Intent(this, DetailActivityPengujian1::class.java)
                startActivity(intent)
            } else {
                // Jika bukan, tampilkan pesan Toast
                Toast.makeText(this, "Anda memilih: $selectedItem", Toast.LENGTH_SHORT).show()
            }
        }
    }
}