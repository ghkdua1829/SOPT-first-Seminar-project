package com.example.mysecondapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    var edit_id:EditText?=null
    var edit_password:EditText?=null
    var login:TextView?=null
    var signup:TextView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edit_id=findViewById(R.id.edit_id)
        edit_password=findViewById(R.id.edit_password)
        login=findViewById(R.id.login)
        signup=findViewById(R.id.signup)

        login?.setOnClickListener{
            val id=edit_id?.text.toString()
            val password=edit_password?.text.toString()

            if(id.isEmpty()||password.isEmpty()){
                Toast.makeText(this,"입력하세요!",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val mypage=Intent(this,Mypage::class.java)
            mypage.putExtra("Id",id)
            mypage.putExtra("Pw",password)
            startActivity(mypage)

        }
        signup?.setOnClickListener{
            val intent=Intent(this,SignupActivity::class.java)
            startActivityForResult(intent,3000)
        }

    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        edit_id?.setText(data?.getStringExtra("Id"))
        edit_password?.setText(data?.getStringExtra("Pw"))
    }
}


