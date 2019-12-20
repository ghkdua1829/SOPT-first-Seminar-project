package com.example.mysecondapp.server

import com.example.mysecondapp.data.GitUserInfoItem
import com.example.second_seminar_recyclerview.GitRepoItem
import com.google.gson.annotations.SerializedName
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

    @GET("/api/users?page=2")
    fun getTestUser(
    ):Call<TestItem>
}

data class TestItem(
    @SerializedName("page")
    val page:Int,
    @SerializedName("data")
    val userlist:List<TestListUser>
)
data class TestListUser(
    @SerializedName("id")
    val id:String,
    @SerializedName("email")
    val email:String,
    @SerializedName("first_name")
    val first_name:String,
    @SerializedName("last_name")
    val last_name:String
    )