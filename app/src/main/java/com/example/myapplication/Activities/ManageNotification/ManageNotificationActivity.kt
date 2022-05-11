package com.example.myapplication.Activities.ManageNotification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityManageNotificationBinding

class ManageNotificationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityManageNotificationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityManageNotificationBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



    }
}