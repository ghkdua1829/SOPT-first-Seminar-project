package com.example.mysecondapp.feature.webtoon

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mysecondapp.data.WebtoonItem
import com.example.mysecondapp.R

class WebtoonAdapter (private val context: Context): RecyclerView.Adapter<WebtoonViewHolder>(){

    var data= mutableListOf<WebtoonItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WebtoonViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_webtoon,parent,false)

        return WebtoonViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: WebtoonViewHolder, position: Int) {
        holder.bind(data[position])

    }

}