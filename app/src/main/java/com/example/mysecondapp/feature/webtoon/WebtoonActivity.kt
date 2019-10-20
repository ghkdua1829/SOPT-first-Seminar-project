package com.example.mysecondapp.feature.webtoon

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mysecondapp.Data.WebtoonItem
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.SnapHelper
import com.example.mysecondapp.R


class WebtoonActivity:AppCompatActivity(){
    var snapHelper: SnapHelper? = null
    private lateinit var SoptRecyclerView: RecyclerView
    private lateinit var WebtoonAdapter: WebtoonAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid)
        initGitRepoList()
        SnapinitGitRepoList()
    }

    private fun SnapinitGitRepoList(){
        SoptRecyclerView=findViewById(R.id.Snapwebtoon)


        WebtoonAdapter= WebtoonAdapter(this)

        SoptRecyclerView.adapter=WebtoonAdapter

        SoptRecyclerView.layoutManager= LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        snapHelper = LinearSnapHelper()
        snapHelper?.attachToRecyclerView(SoptRecyclerView)
        WebtoonAdapter.data= mutableListOf(
            WebtoonItem(
                src = R.drawable.yumi,
                desc = "유미의 세포"
            ),
            WebtoonItem(
                src = R.drawable.dog,
                desc = "개장수"
            ),
            WebtoonItem(
                src = R.drawable.girl,
                desc = "여신강림"
            ),
            WebtoonItem(
                src = R.drawable.hell,
                desc = "타인은 지옥이다"
            ),
            WebtoonItem(
                src = R.drawable.year,
                desc = "연놈"
            ),
            WebtoonItem(
                src = R.drawable.reno,
                desc = "연애혁명"
            ),
            WebtoonItem(
                src = R.drawable.god,
                desc = "신의탑"
            ),
            WebtoonItem(
                src = R.drawable.sol,
                desc = "뷰티풀군바리"
            ),
            WebtoonItem(
                src = R.drawable.ma,
                desc = "마음의 소리"
            )
        )

        WebtoonAdapter.notifyDataSetChanged()
    }

    private fun initGitRepoList(){
        SoptRecyclerView=findViewById(R.id.webtoon)


        WebtoonAdapter= WebtoonAdapter(this)

        SoptRecyclerView.adapter=WebtoonAdapter

        SoptRecyclerView.layoutManager= GridLayoutManager(this,3)
        WebtoonAdapter.data= mutableListOf(
            WebtoonItem(
                src = R.drawable.yumi,
                desc = "유미의 세포"
            ),
            WebtoonItem(
                src = R.drawable.dog,
                desc = "개장수"
            ),
            WebtoonItem(
                src = R.drawable.girl,
                desc = "여신강림"
            ),
            WebtoonItem(
                src = R.drawable.hell,
                desc = "타인은 지옥이다"
            ),
            WebtoonItem(
                src = R.drawable.year,
                desc = "연놈"
            ),
            WebtoonItem(
                src = R.drawable.reno,
                desc = "연애혁명"
            ),
            WebtoonItem(
                src = R.drawable.god,
                desc = "신의탑"
            ),
            WebtoonItem(
                src = R.drawable.sol,
                desc = "뷰티풀군바리"
            ),
            WebtoonItem(
                src = R.drawable.ma,
                desc = "마음의 소리"
            )
        )

        WebtoonAdapter.notifyDataSetChanged()
    }
}