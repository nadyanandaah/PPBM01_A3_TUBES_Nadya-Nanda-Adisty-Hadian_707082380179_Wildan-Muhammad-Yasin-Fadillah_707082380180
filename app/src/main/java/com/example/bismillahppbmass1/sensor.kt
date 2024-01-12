package com.example.bismillahppbmass1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class sensor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sensor)

        // Ambil referensi ke ListView dari layout
        val listView: ListView = findViewById(R.id.listView12)

        // Data yang akan ditampilkan di ListView
        val data = arrayOf("LiDar", "Mq-2", "ESP32Cam", "Analog Sensor", "ADXL345", "MPU6050", "Loadcell")

        // Adapter untuk menghubungkan data dengan ListView
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, data)

        // Set adapter ke ListView
        listView.adapter = adapter

        // Menangani klik item pada ListView
        listView.setOnItemClickListener { _, _, position, _ ->
            val selectedItem = data[position]
            Toast.makeText(this, "Anda memilih: $selectedItem", Toast.LENGTH_SHORT).show()
        }
    }
}