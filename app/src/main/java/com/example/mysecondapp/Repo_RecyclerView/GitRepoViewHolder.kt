package com.example.second_seminar_recyclerview

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mysecondapp.R

class GitRepoViewHolder (view : View):RecyclerView.ViewHolder(view){

    val name:TextView=view.findViewById(R.id.name)
    val description:TextView=view.findViewById(R.id.description)
    val language:TextView=view.findViewById(R.id.language)
    val languageColor:ImageView=view.findViewById(R.id.languageColor)

    fun bind(data:GitRepoItem){
        name.text=data.name
        description.text=data.desc
        language.text=data.language
    }
}