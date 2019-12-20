package com.example.mysecondapp.feature.TestUser

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mysecondapp.R
import com.example.mysecondapp.server.TestListUser

class TestUserAdapter (val context:Context):RecyclerView.Adapter<TestUserViewHolder>(){
    var test_data = listOf<TestListUser>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestUserViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.test_item,parent,false)
        return TestUserViewHolder(view)
    }

    override fun getItemCount(): Int {
        return test_data.size
    }

    override fun onBindViewHolder(holder: TestUserViewHolder, position: Int) {
        holder.bind(test_data[position])
    }
}