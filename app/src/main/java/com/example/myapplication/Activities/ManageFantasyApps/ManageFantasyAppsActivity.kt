package com.example.myapplication.Activities.ManageFantasyApps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.Activities.ManageSliders.AddUpdateSlidersActivity
import com.example.myapplication.databinding.ActivityManageFantasyAppsBinding

class ManageFantasyAppsActivity : AppCompatActivity() {
    lateinit var binding: ActivityManageFantasyAppsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityManageFantasyAppsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnAddFantasyApp.setOnClickListener {
            startActivity(
                Intent(
                    this@ManageFantasyAppsActivity,
                    AddUpdateFantasyAppsActivity::class.java
                )
            )
        }


    }
}