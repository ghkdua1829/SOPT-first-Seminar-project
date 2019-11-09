package com.example.mysecondapp.data

import com.google.gson.annotations.SerializedName

data class GitUserInfoItem(
    @SerializedName("avatar_url")
    val myImg:String,
    @SerializedName("login")
    val userId:String,
    @SerializedName("blog")
    val blogName:String,
    @SerializedName("followers")
    val followers:String,
    @SerializedName("following")
    val following:String,
    @SerializedName("bio")
    val nickname:String
)