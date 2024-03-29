package com.example.mysecondapp.server

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object GithubServicelmpl {
    private const val BASE_URL = "https://api.github.com"
    private const val GIT_URL = "https://reqres.in/"


    private val retrofit:Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val service:GithubService = retrofit.create(GithubService::class.java)

    private val git_retrofit:Retrofit = Retrofit.Builder()
        .baseUrl(GIT_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val git_service:GithubService = git_retrofit.create(GithubService::class.java)

}