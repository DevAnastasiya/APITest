package com.example.apitest

data class ReposData(
    val id: Int,
    val name: String,
    val full_name: String,
    val private: Boolean
)
data class SingleRepoData(
    val id: Int,
    val name: String,
    val full_name: String,
    val private: Boolean
)
data class GlobalSearchReposData(
    val id: Int,
    val name: String,
    val full_name: String,
    val private: Boolean
)
