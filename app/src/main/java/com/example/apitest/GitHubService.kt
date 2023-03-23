package com.example.apitest

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.*

interface GitHubService {

    @GET("/users/{username}/repos")
    suspend fun getReposList(
        @Path("username") username: String
    ): List<ReposData>

    @GET("repos/{username}/{repositoryname}")
    suspend fun getSingleRepo(
        @Path("username") username: String,
        @Path("repositoryname") repositoryName: String
    ): SingleRepoData

    @GET("search/repositories")
    fun searchReposByKeyword(
        @Query("q") keyword: String
    ): Call<GlobalSearchReposData>

    @PATCH("repos/{username}/{OldRepositoryName}")
    fun renameRepo(
        @Path("username") username: String,
        @Path("OldRepositoryName") oldRepoName: String,
        @Body newRepoName: HashMap<String, String>
    ): Call<ResponseBody>
}