package com.example.myapplication.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Models.MatchModel
import com.example.myapplication.R

class MatchAdapter(private val mList: List<MatchModel>) :
    RecyclerView.Adapter<MatchAdapter.vHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): vHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.match_item, parent, false)

        return vHolder(view)
    }

    override fun onBindViewHolder(holder: vHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return mList.size
    }


    class vHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
}