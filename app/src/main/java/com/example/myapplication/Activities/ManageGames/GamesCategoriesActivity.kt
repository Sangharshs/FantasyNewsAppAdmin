package com.example.myapplication.Activities.ManageGames

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityGamesCategoriesBinding
import com.example.myapplication.databinding.ActivityMatchesBinding

class GamesCategoriesActivity : AppCompatActivity() {

    private lateinit var binding : ActivityGamesCategoriesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGamesCategoriesBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnAddGames.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this@GamesCategoriesActivity,AddUpdateGamesCategoriesActivity::class.java))
        })




    }
}