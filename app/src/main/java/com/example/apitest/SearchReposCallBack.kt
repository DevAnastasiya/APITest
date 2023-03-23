package com.example.apitest

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SearchReposCallBack : Callback<GlobalSearchReposData> {
    override fun onResponse(call: Call<GlobalSearchReposData>, response: Response<GlobalSearchReposData>) {
        println(response.body())
    }

    override fun onFailure(call: Call<GlobalSearchReposData>, t: Throwable) {
        println(t.message)
    }
}