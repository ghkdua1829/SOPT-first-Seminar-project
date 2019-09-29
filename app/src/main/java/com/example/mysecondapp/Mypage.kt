package com.example.mysecondapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Mypage : AppCompatActivity() {
    var myId:TextView?=null
    var myPw:TextView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mypage)

        myId=findViewById(R.id.myId)
        myPw=findViewById(R.id.myPw)
        myId?.setText(intent.getStringExtra("Id"))
        myPw?.setText(intent.getStringExtra("Pw"))
    }
}
