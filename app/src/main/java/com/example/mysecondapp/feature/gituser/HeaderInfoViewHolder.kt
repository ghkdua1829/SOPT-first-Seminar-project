package com.example.mysecondapp.feature.gituser

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mysecondapp.R
import com.example.mysecondapp.data.GitUserInfoItem
import com.example.mysecondapp.data.HeaderInfoItem
import kotlinx.android.synthetic.main.activity_mypage.*
import kotlinx.android.synthetic.main.activity_mypage.view.*

class HeaderInfoViewHolder (private val view: View):RecyclerView.ViewHolder(view){
    val myImg:ImageView = view.findViewById(R.id.myImg)
    val myname:TextView = view.findViewById(R.id.myname)
    val myblogname:TextView = view.findViewById(R.id.myblogname)
    val myfollowers:TextView = view.findViewById(R.id.myfollowers)
    val myfollowings:TextView = view.findViewById(R.id.myfollowings)
    val nickname:TextView = view.findViewById(R.id.nickname)

    fun bind(data : GitUserInfoItem){
        Glide.with(view.context).load(data.myImg).into(myImg)
        myname.text = data.userId
        myblogname.text = data.blogName
        myfollowers.text = data.followers
        myfollowings.text = data.following
        nickname.text = data.nickname
    }
}