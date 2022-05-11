package com.example.myapplication.Activities.ManageSliders

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityAddUpdateSlidersBinding

class AddUpdateSlidersActivity : AppCompatActivity() {
    lateinit var binding: ActivityAddUpdateSlidersBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddUpdateSlidersBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


    }
}