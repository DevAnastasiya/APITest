package com.example.apitest

interface GitHubService {

    @GET("/users/DevAnastasiya/repos")
    suspend fun getReposList(): List<RepoData>
}