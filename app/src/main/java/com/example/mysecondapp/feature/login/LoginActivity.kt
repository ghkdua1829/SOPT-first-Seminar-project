package com.example.mysecondapp.feature.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.mysecondapp.feature.gituser.MypageActivity
import com.example.mysecondapp.R
import com.example.mysecondapp.feature.signup.SignupActivity
import kotlinx.android.synthetic.main.activity_main.*

class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        login?.setOnClickListener{
            val id=edit_id?.text.toString()
            val password=edit_password?.text.toString()

            if(id.isEmpty()||password.isEmpty()){
                Toast.makeText(this,"입력하세요!",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val mypage=Intent(this, MypageActivity::class.java)
            mypage.putExtra("Id",id)
            mypage.putExtra("Pw",password)
            startActivity(mypage)

        }
        signup?.setOnClickListener{
            val intent=Intent(this, SignupActivity::class.java)
            startActivityForResult(intent,3000)
        }

    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        edit_id?.setText(data?.getStringExtra("Id"))
        edit_password?.setText(data?.getStringExtra("Pw"))
    }
}


