package com.example.mysecondapp.feature.gituser

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mysecondapp.R
import com.example.mysecondapp.data.GitUserInfoItem
import com.example.mysecondapp.feature.Preferences.App
import com.example.mysecondapp.server.GithubServicelmpl
import com.example.second_seminar_recyclerview.GitRepoAdapter
import com.example.second_seminar_recyclerview.GitRepoItem
import com.example.second_seminar_recyclerview.GitUserAdapter
import com.example.second_seminar_recyclerview.GitUserItem
import kotlinx.android.synthetic.main.activity_mypage.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MypageActivity : AppCompatActivity() {

    private lateinit var SoptRecyclerView: RecyclerView
    private lateinit var GitRepoAdapter: GitRepoAdapter
    private lateinit var GitUserAdapter:GitUserAdapter

//    private  lateinit var Id:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mypage)


    val myUserInfo: Call<GitUserInfoItem> = GithubServicelmpl.service.getUserInfo(App.prefs.main_id)

    myUserInfo.enqueue(
        object : Callback<GitUserInfoItem>{
            override fun onFailure(call: Call<GitUserInfoItem>, t: Throwable) {
                Log.e("Error : ",t.toString())
            }

            override fun onResponse(
                call: Call<GitUserInfoItem>,
                response: Response<GitUserInfoItem>
            ) {
                val gitUserInfo = response.body()!!
                Glide.with(this@MypageActivity).load(gitUserInfo.myImg).into(myImg)
                myname.setText(gitUserInfo.userId)
                myblogname.setText(gitUserInfo.blogName)
                myfollowers.setText(gitUserInfo.followers)
                myfollowings.setText(gitUserInfo.following)
                nickname.setText(gitUserInfo.nickname)

            }
        }
    )

        if(intent?.getStringExtra("timeline").equals("yes")){
            initGitRepoList()
        }
        else
        initGitUserList()

    }
    

    private fun initGitRepoList(){
        SoptRecyclerView=findViewById(R.id.SoptRecyclerView)

        GitRepoAdapter= GitRepoAdapter(this)

        SoptRecyclerView.adapter=GitRepoAdapter

        SoptRecyclerView.layoutManager=LinearLayoutManager(this)

        val myRepo: Call<List<GitRepoItem>> = GithubServicelmpl.service.getRepos(App.prefs.main_id)

        myRepo.enqueue(
            object : Callback<List<GitRepoItem>>{
                override fun onFailure(call: Call<List<GitRepoItem>>, t: Throwable) {
                    Log.e("error : ",t.toString())
                }
                override fun onResponse(
                    call: Call<List<GitRepoItem>>,
                    response: Response<List<GitRepoItem>>
                ) {
                    if(response.isSuccessful){
                        val gitRepos = response.body()
                        GitRepoAdapter.data = gitRepos!!
                        GitRepoAdapter.notifyDataSetChanged()
                    }
                }
            }
        )

//        GitRepoAdapter.data= listOf(
//            GitRepoItem(
//                name = "SoptStagram",
//                desc = "IT 창업 동아리 SOPT 안드로이드 교육 프로젝트",
//                language = "Kotlin",
//                languageColor = 0
//            ),
//            GitRepoItem(
//                name = "artic_android",
//                desc = "Forked from artic_development/artic_android",
//                language = "Kotlin",
//                languageColor = 0
//            ),
//            GitRepoItem(
//                name = "CalculatorWithEspresso",
//                desc = "UI Test with Espresso + Unit Test Calculator",
//                language = "Kotlin",
//                languageColor = 0
//            ),
//            GitRepoItem(
//                name = "problemSovingGuZongMan",
//                desc = "프로그래밍 대회에서 배우는 알고리즘 문제해결전략 공부하자",
//                language = "Java",
//                languageColor = 1
//            )
//        )

        GitRepoAdapter.notifyDataSetChanged()
    }

    private fun initGitUserList(){
        SoptRecyclerView=findViewById(R.id.SoptRecyclerView)

        GitUserAdapter= GitUserAdapter(this)

        SoptRecyclerView.adapter=GitUserAdapter

        SoptRecyclerView.layoutManager= LinearLayoutManager(this)

        GitUserAdapter.data= mutableListOf(
            GitUserItem(
                userId = "Kim Chan Young",
                userName = "내 타임라인 보러가기",
                userImage = 0
            ),
            GitUserItem(
                userId = "webtoon",
                userName = "웹툰 보러 가기",
                userImage = 0
            ),
            GitUserItem(
                userId = "ghkdua1829",
                userName = "Kim Chan Young",
                userImage = 0
            ),
            GitUserItem(
                userId = "ghkdua1829",
                userName = "Kim Chan Young",
                userImage = 0
            ),
            GitUserItem(
                userId = "ghkdua1829",
                userName = "Kim Chan Young",
                userImage = 0
            ),
            GitUserItem(
                userId = "ghkdua1829",
                userName = "Kim Chan Young",
                userImage = 0
            )
        )

        GitUserAdapter.notifyDataSetChanged()
    }
}
