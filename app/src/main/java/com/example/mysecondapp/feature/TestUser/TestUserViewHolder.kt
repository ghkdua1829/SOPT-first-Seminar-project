package com.example.mysecondapp.feature.TestUser

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mysecondapp.R
import com.example.mysecondapp.server.TestListUser
import kotlinx.android.synthetic.main.test_item.view.*

class TestUserViewHolder (view: View):RecyclerView.ViewHolder(view){
    val id :TextView= view.findViewById(R.id.test_id)
    val email :TextView= view.findViewById(R.id.test_email)
    val firstname :TextView= view.findViewById(R.id.test_first)
    val lastname :TextView= view.findViewById(R.id.test_last)

    fun bind(data:TestListUser){
        id.text = data.id
        email.text = data.email
        firstname.text = data.first_name
        lastname.text = data.last_name
    }
}