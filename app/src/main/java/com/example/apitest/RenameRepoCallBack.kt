package com.example.apitest

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RenameRepoCallBack : Callback<ResponseBody> {
    override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
        println(t.message)
    }

    override fun onResponse(
        call: Call<ResponseBody>,
        response: Response<ResponseBody>
    ) {
        println(response.body())
    }
}