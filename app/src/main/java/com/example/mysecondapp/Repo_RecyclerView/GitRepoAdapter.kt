package com.example.second_seminar_recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mysecondapp.R

class GitRepoAdapter(private val context: Context):RecyclerView.Adapter<GitRepoViewHolder>(){

    var data= listOf<GitRepoItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GitRepoViewHolder {
        val view =LayoutInflater.from(context).inflate(R.layout.item,parent,false)

        return GitRepoViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: GitRepoViewHolder, position: Int) {
        holder.bind(data[position])
    }
}