package com.example.apitest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val service = Client().service

//        CoroutineScope(Dispatchers.IO).launch {
//            println(service.getReposList("DevAnastasiya"))
//        }
//
//        CoroutineScope(Dispatchers.IO).launch {
//            println(service.getSingleRepo("DevAnastasiya", "Testing"))
//        }

        // Показывает пустые данные
        val searchReposCall = service.searchReposByKeyword("notes")
        searchReposCall.enqueue(SearchReposCallBack())

        // Ниже - тоже пустые данные....
        val namesHashMap = HashMap<String, String>()
        namesHashMap["name"] = "NewName"

        service.renameRepo(
            "DevAnastasiya", "Testing", namesHashMap
        ).enqueue(RenameRepoCallBack())
    }
}