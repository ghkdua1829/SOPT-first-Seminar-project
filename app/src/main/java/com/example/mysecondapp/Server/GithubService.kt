package com.example.mysecondapp.Server

import com.example.second_seminar_recyclerview.GitRepoItem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubService {
    @GET("/users/{login}/repos")
    fun getRepos(
        @Path("login") login:String
    ): Call<List<GitRepoItem>>
}