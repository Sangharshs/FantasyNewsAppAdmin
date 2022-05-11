package com.example.myapplication.Activities.ManageFantasyApps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityAddUpdateFantasyAppsBinding

class AddUpdateFantasyAppsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddUpdateFantasyAppsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddUpdateFantasyAppsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


    }
}