package com.example.mysecondapp.feature.gituser

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mysecondapp.R
import com.example.mysecondapp.data.GitUserInfoItem
import com.example.mysecondapp.data.HeaderInfoItem
import com.example.second_seminar_recyclerview.GitUserItem
import com.example.second_seminar_recyclerview.GitUserViewHolder

class Adapter(private val context:Context) :RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    var data = mutableListOf<GitUserItem>()
    var headerdata = GitUserInfoItem(blogName = "",myImg = "",userId="",followers="",following = "",nickname = "")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when (viewType){
            0 -> return HeaderInfoViewHolder(LayoutInflater.from(context).inflate(R.layout.item_header_myinfo,parent,false))
            else -> return GitUserViewHolder(LayoutInflater.from(context).inflate(R.layout.user_item,parent,false))
        }
    }

    override fun getItemCount(): Int {
        return data.size + 1
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is HeaderInfoViewHolder -> {holder.bind(headerdata)}
            is GitUserViewHolder -> holder.bind(data[position-1])
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when(position){
            0 -> 0
            else -> 1
        }
    }
}