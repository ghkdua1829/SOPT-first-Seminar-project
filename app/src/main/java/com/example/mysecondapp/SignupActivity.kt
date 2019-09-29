package com.example.mysecondapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SignupActivity : AppCompatActivity() {
    var EdtName:EditText?=null
    var EdtId:EditText?=null
    var Edtpassword:EditText?=null
    var Edtpassword2:EditText?=null
    var tv_signup:TextView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        tv_signup=findViewById(R.id.tv_signup)
        EdtName=findViewById(R.id.EdtName)
        EdtId=findViewById(R.id.EdtId)
        Edtpassword=findViewById(R.id.Edtpassword)
        Edtpassword2=findViewById(R.id.Edtpassword2)
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
            val intent= Intent(this,MainActivity::class.java)
            intent.putExtra("Id",EdtId)
            intent.putExtra("Pw",Edtpassword)
            setResult(3000,intent)
            finish()
        }
    }
}
