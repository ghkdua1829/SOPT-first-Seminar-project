package com.example.second_seminar_recyclerview

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.mysecondapp.MypageActivity
import com.example.mysecondapp.R
import com.example.mysecondapp.WebtoonActivity

class GitUserAdapter(private val context: Context):RecyclerView.Adapter<GitUserViewHolder>(){

    var data= mutableListOf<GitUserItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GitUserViewHolder {
        val view =LayoutInflater.from(context).inflate(R.layout.user_item,parent,false)

        return GitUserViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: GitUserViewHolder, position: Int) {
        holder.bind(data[position])
        holder.delete.setOnClickListener {
            Toast.makeText(context,"삭제",Toast.LENGTH_SHORT).show()
            data.removeAt(position)
            notifyItemRemoved(position)
            notifyItemRangeChanged(position,data.size)
        }
        holder.userView.setOnClickListener {
            if(holder.userId.text.equals("Kim Chan Young")){
                Toast.makeText(context,"타임라인으로 가자",Toast.LENGTH_SHORT).show()
                val timeline= Intent(context, MypageActivity::class.java)
                timeline.putExtra("timeline","yes")
                context.startActivity(timeline)
            }
            else if(holder.userId.text.equals("webtoon")) {
                Toast.makeText(context, "웹툰 보러 가자", Toast.LENGTH_SHORT).show()
                val webtoon = Intent(context, WebtoonActivity::class.java)
                context.startActivity(webtoon)
            }
            else
                Toast.makeText(context,"그냥 클릭",Toast.LENGTH_SHORT).show()
        }

    }

}