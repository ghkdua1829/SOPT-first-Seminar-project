package com.example.mysecondapp.feature.TestUser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mysecondapp.R
import com.example.mysecondapp.server.GithubServicelmpl
import com.example.mysecondapp.server.TestItem
import com.example.mysecondapp.server.TestUser
import com.example.mysecondapp.server.TestUser22
import kotlinx.android.synthetic.main.item.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class TestActivity : AppCompatActivity() {

    lateinit var test_recyclerview : RecyclerView
    lateinit var TestAdaper:TestUserAdapter
    lateinit var TestViewHolder :TestUserViewHolder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        TestUserList()
        TestUser()
    }

    private fun TestUserList(){
        test_recyclerview = findViewById(R.id.test_recyclerview)
        TestAdaper = TestUserAdapter(this)
        test_recyclerview.adapter = TestAdaper
        test_recyclerview.layoutManager=LinearLayoutManager(this)

        val testList: Call<TestItem> = GithubServicelmpl.git_service.getTestUser()

        testList.enqueue(
            object:Callback<TestItem>{
                override fun onFailure(call: Call<TestItem>, t: Throwable) {
                    Log.e("error is ",t.toString())
                }

                override fun onResponse(call: Call<TestItem>, response: Response<TestItem>) {
                    if(response.isSuccessful){
                        val testlist = response.body()!!
                        TestAdaper.test_data=testlist.userlist
                        TestAdaper.notifyDataSetChanged()
                    }
                }
            }
        )
    }

    private fun TestUser(){
        val testuser :Call<TestUser22> = GithubServicelmpl.git_service.postTest(
            TestUser(
                name="kcy",
                job = "police"
            )
        )

        testuser.enqueue(
            object : Callback<TestUser22>{
                override fun onFailure(call: Call<TestUser22>, t: Throwable) {
                    Log.e("error is ",t.toString())
                }

                override fun onResponse(call: Call<TestUser22>, response: Response<TestUser22>) {
                    if(response.isSuccessful){
                        Log.e("data is ",response.body().toString())
                    }
                }
            }
        )
    }
}
