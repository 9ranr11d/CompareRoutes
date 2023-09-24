package com.example.compareroutes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.compareroutes.databinding.ActivityMainBinding
import net.daum.mf.map.api.MapView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Kakao Map
        val mapView = MapView(this)
        binding.mapView.addView(mapView)
    }
}