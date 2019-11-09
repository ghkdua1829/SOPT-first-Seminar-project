package com.example.mysecondapp.Server

import com.example.mysecondapp.Data.GitUserInfoItem
import com.example.second_seminar_recyclerview.GitRepoItem
import com.example.second_seminar_recyclerview.GitUserItem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubService {
    @GET("/users/{login}/repos")
    fun getRepos(
        @Path("login") login:String
    ): Call<List<GitRepoItem>>

    @GET("/users/{login}")
    fun getUserInfo(
        @Path("login") login:String
    ):Call<GitUserInfoItem>
}