package com.example.apitest

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Client {

    private val baseUrl = "https://api.github.com/"

    private val retrofit = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val service = retrofit.create(GitHubService::class.java)
}