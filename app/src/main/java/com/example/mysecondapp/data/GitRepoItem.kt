package com.example.second_seminar_recyclerview

import com.google.gson.annotations.SerializedName

data class GitRepoItem(
    @SerializedName("name")
    val name:String,
    @SerializedName("decription")
    val desc:String,
    @SerializedName("language")
    val language:String?,
    val languageColor: Int?
)