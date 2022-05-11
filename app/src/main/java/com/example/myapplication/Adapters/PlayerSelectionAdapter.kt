package com.example.myapplication.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Adapters.PlayerSelectionAdapter.viewHolder
import com.example.myapplication.Models.MatchModel
import com.example.myapplication.Models.PlayersModel
import com.example.myapplication.R

class PlayerSelectionAdapter (private val mList: List<PlayersModel>): RecyclerView.Adapter<viewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.match_item, parent, false)
        return viewHolder(view)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
       return mList.size
    }

    class viewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}