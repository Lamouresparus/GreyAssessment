package com.example.greyassessment.domain.model


data class UserDetailDomain(
    val username: String,
    val avatarUrl: String,
    val githubUrl: String,
    val name: String,
    val location: String,
    val followers: Int,
    val following: Int,
    val repos: Int,
    val bio: String,
    val email: String,
    val blog: String
)