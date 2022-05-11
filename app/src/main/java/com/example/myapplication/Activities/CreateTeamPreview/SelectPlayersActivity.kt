package com.example.myapplication.Activities.CreateTeamPreview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.Adapters.MatchAdapter
import com.example.myapplication.Adapters.PlayerSelectionAdapter
import com.example.myapplication.Models.MatchModel
import com.example.myapplication.Models.PlayersModel
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivitySelectPlayersBinding

class SelectPlayersActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySelectPlayersBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectPlayersBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.rvPlayersList.layoutManager = LinearLayoutManager(this)
        // ArrayList of class ItemsViewModel
        val data = ArrayList<PlayersModel>()
        for (i in 1..10) {
            data.add(PlayersModel("","","",""))
        }
        // This will pass the ArrayList to our Adapter
        val adapter = PlayerSelectionAdapter(data)
        // Setting the Adapter with the recyclerview
        binding.rvPlayersList.adapter = adapter
    }
}