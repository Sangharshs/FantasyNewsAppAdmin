package com.example.myapplication.Activities.ManagePromotinalBanners

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityManagePromotionalBannersBinding

class ManagePromotionalBannersActivity : AppCompatActivity() {
    lateinit var binding : ActivityManagePromotionalBannersBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityManagePromotionalBannersBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


    }
}