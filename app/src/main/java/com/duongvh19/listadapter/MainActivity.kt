package com.duongvh19.listadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.duongvh19.listadapter.data.SportsData
import com.duongvh19.listadapter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sportsAdapter = SportsAdapter()
        sportsAdapter.submitList(SportsData.getSportsData())
        binding.sportsList.adapter = sportsAdapter
    }
}