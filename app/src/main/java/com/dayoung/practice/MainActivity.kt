package com.dayoung.practice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image1 = findViewById<ImageView>(R.id.parcImage1)
        image1.setOnClickListener {
            var intent = Intent(this, ParcActivity::class.java)
            startActivity(intent)
        }

        val image2 = findViewById<ImageView>(R.id.parcImage2)
        image2.setOnClickListener {
            var intent = Intent(this, ParcActivity2::class.java)
            startActivity(intent)
        }

        val image3 = findViewById<ImageView>(R.id.parcImage3)
        image3.setOnClickListener {
            var intent = Intent(this, ParcActivity3::class.java)
            startActivity(intent)
        }

        val image4 = findViewById<ImageView>(R.id.parcImage4)
        image4.setOnClickListener {
            var intent = Intent(this, ParcActivity4::class.java)
            startActivity(intent)
        }

        val image5 = findViewById<ImageView>(R.id.parcImage5)
        image5.setOnClickListener {
            var intent = Intent(this, ParcActivity5::class.java)
            startActivity(intent)
        }

        val image6 = findViewById<ImageView>(R.id.parcImage6)
        image6.setOnClickListener {
            var intent = Intent(this, ParcActivity6::class.java)
            startActivity(intent)
        }
    }
}