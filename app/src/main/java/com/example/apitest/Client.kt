package com.example.apitest

class Client {

    val BASE_URL = "https://api.github.com/"

    val service = Retrofit.Builer()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(GitHibService::class.java)
}