package com.example.camgps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cameraBtn: Button = findViewById(R.id.cameraBtn)
        cameraBtn.setOnClickListener {
            val intent = Intent(this, CamActivity::class.java)
            startActivity(intent)
        }
        val gpsBtn: Button = findViewById(R.id.gpsBtn)
        gpsBtn.setOnClickListener {
            val intent = Intent(this, GPS::class.java)
            startActivity(intent)
        }

    }
}