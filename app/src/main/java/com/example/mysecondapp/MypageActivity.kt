package com.example.mysecondapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.second_seminar_recyclerview.GitRepoAdapter
import com.example.second_seminar_recyclerview.GitRepoItem
import com.example.second_seminar_recyclerview.GitUserAdapter
import com.example.second_seminar_recyclerview.GitUserItem
import kotlinx.android.synthetic.main.activity_mypage.*

class MypageActivity : AppCompatActivity() {

    private lateinit var SoptRecyclerView: RecyclerView
    private lateinit var GitRepoAdapter: GitRepoAdapter
    private lateinit var GitUserAdapter:GitUserAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mypage)

        myId?.setText(intent.getStringExtra("Id"))

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

        GitRepoAdapter.data= listOf(
            GitRepoItem(
                name = "SoptStagram",
                desc = "IT 창업 동아리 SOPT 안드로이드 교육 프로젝트",
                language = "Kotlin",
                languageColor = 0
            ),
            GitRepoItem(
                name = "artic_android",
                desc = "Forked from artic_development/artic_android",
                language = "Kotlin",
                languageColor = 0
            ),
            GitRepoItem(
                name = "CalculatorWithEspresso",
                desc = "UI Test with Espresso + Unit Test Calculator",
                language = "Kotlin",
                languageColor = 0
            ),
            GitRepoItem(
                name = "problemSovingGuZongMan",
                desc = "프로그래밍 대회에서 배우는 알고리즘 문제해결전략 공부하자",
                language = "Java",
                languageColor = 1
            )
        )

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
