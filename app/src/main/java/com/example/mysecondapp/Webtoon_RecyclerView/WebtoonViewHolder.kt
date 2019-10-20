package com.example.mysecondapp.Webtoon_RecyclerView

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mysecondapp.R

class WebtoonViewHolder (view : View): RecyclerView.ViewHolder(view) {

    val webtoon_image:ImageView=view.findViewById(R.id.webtoon_image)
    val webtoon_desc:TextView=view.findViewById(R.id.webtoon_desc)

    fun bind(data:WebtoonItem){
        webtoon_image.setImageResource(data.src)
        webtoon_desc.text=data.desc
    }


}