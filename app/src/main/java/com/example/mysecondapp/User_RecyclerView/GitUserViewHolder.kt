package com.example.second_seminar_recyclerview

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mysecondapp.R

class GitUserViewHolder(view : View): RecyclerView.ViewHolder(view) {

    val userView:View=view.findViewById(R.id.userView)
    val userId: TextView =view.findViewById(R.id.userId)
    val userName: TextView =view.findViewById(R.id.userName)
    val userImage: ImageView =view.findViewById(R.id.userImage)
    val delete: ImageView =view.findViewById(R.id.delete)

    fun bind(data:GitUserItem){
        userId.setText(data.userId)
        userName.text=data.userName
    }




}