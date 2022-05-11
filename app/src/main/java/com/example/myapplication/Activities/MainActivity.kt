package com.example.myapplication.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplication.Activities.CreateTeamPreview.SelectPlayersActivity
import com.example.myapplication.Activities.ManageFantasyApps.ManageFantasyAppsActivity
import com.example.myapplication.Activities.ManageGames.GamesCategoriesActivity
import com.example.myapplication.Activities.ManageMatches.MatchesActivity
import com.example.myapplication.Activities.ManageNews.NewsActivity
import com.example.myapplication.Activities.ManageNotification.ManageNotificationActivity
import com.example.myapplication.Activities.ManagePromotinalBanners.ManagePromotionalBannersActivity
import com.example.myapplication.Activities.ManageSliders.ManageSlidersActivity
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.cardMatch.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, MatchesActivity::class.java)
            startActivity(intent)
        })

        binding.cardViewGames.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, GamesCategoriesActivity::class.java)
            startActivity(intent)
        })

        binding.cardManageNews.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity,NewsActivity::class.java)
            startActivity(intent)
        })

        binding.cardPromobanner.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity,ManagePromotionalBannersActivity::class.java)
            startActivity(intent)
        })

        binding.cardManageSliders.setOnClickListener {
            val intent = Intent(this@MainActivity, ManageSlidersActivity::class.java)
            startActivity(intent)
        }

        binding.cardManageFantasyApp.setOnClickListener {
            val intent = Intent(this@MainActivity, ManageFantasyAppsActivity::class.java)
            startActivity(intent)
        }

        binding.cardManageNotification.setOnClickListener {
            val intent = Intent(this@MainActivity, ManageNotificationActivity::class.java)
            startActivity(intent)
        }

        binding.cardManageTeam.setOnClickListener {
            val intent = Intent(this@MainActivity, SelectPlayersActivity::class.java)
            startActivity(intent)
        }



    }
}