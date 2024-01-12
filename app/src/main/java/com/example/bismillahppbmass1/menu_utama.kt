package com.example.bismillahppbmass1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel
import com.example.bismillahppbmass1.databinding.ActivityMainBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class menu_utama : AppCompatActivity(){
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_menu_utama)

        val imageList = ArrayList<SlideModel>() // Create image list

// imageList.add(SlideModel("String Url" or R.drawable)
// imageList.add(SlideModel("String Url" or R.drawable, "title") You can add title

        imageList.add(SlideModel(R.drawable.manekinanoa, "Pengujian Smart Mannequin"))
        imageList.add(SlideModel(R.drawable.anoaa, "Tank Anoa 6x6"))

        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        imageSlider.setImageList(imageList)


        val buttonmenu = findViewById<Button>(R.id.buttonmenu)
        val buttonmenu3 = findViewById<Button>(R.id.buttonmenu3)
        val buttonmenu4 = findViewById<Button>(R.id.buttonmenu4)
        val buttonmenu5 = findViewById<Button>(R.id.buttonmenu5)
        val buttonmenu6 = findViewById<Button>(R.id.buttonmenu6)

        buttonmenu.setOnClickListener {
            startActivity(Intent(this, mikrokontroler::class.java))
        }

        buttonmenu3.setOnClickListener {
            startActivity(Intent(this, halamanmonitoring::class.java))
        }

        buttonmenu4.setOnClickListener {
            startActivity(Intent(this, mikrokontroler::class.java))
        }

        buttonmenu5.setOnClickListener {
            startActivity(Intent(this, hasilpengujian::class.java))
        }

        buttonmenu6.setOnClickListener {
            startActivity(Intent(this, sensor::class.java))
        }
    }

    fun showBottomSheet(view: View){
        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottomsheet, null)
        val btnClose = view.findViewById<Button>(R.id.idBtnDismiss)
        btnClose.setOnClickListener {
            startActivity(Intent(this, mitra::class.java))
        }
        dialog.setCancelable(false)
        dialog.setContentView(view)
        dialog.show()

    }
}



