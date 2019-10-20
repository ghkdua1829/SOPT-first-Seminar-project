package com.example.mysecondapp.feature.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mysecondapp.feature.login.LoginActivity
import com.example.mysecondapp.R
import kotlinx.android.synthetic.main.activity_signup.*

class SignupActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        tv_signup?.setOnClickListener {
            val Edt_name=EdtName?.text.toString()
            val EdtId=EdtId?.text.toString()
            val Edtpassword=Edtpassword?.text.toString()
            val Edtpassword2=Edtpassword2?.text.toString()
            if(Edt_name.isEmpty()||EdtId.isEmpty()||Edtpassword.isEmpty()||Edtpassword2.isEmpty()){
                Toast.makeText(this,"입력하세요!",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if(!Edtpassword.equals(Edtpassword2)){
                Toast.makeText(this,"비밀번호를 일치시키세요.",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            Toast.makeText(this,"회원가입에 성공하셨습니다.",Toast.LENGTH_SHORT).show()
            val intent= Intent(this, LoginActivity::class.java)
            intent.putExtra("Id",EdtId)
            intent.putExtra("Pw",Edtpassword)
            setResult(3000,intent)
            finish()
        }
    }
}
