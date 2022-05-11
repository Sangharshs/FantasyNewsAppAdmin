package com.example.myapplication.Activities.ManageSliders

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplication.databinding.ActivityManageSlidersBinding

class ManageSlidersActivity : AppCompatActivity() {
    lateinit var binding : ActivityManageSlidersBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityManageSlidersBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnAddSlider.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this@ManageSlidersActivity, AddUpdateSlidersActivity::class.java))
        })


    }
}