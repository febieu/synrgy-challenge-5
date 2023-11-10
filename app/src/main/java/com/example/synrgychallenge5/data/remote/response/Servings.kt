package com.example.synrgychallenge5.data.remote.response


import com.example.synrgychallenge5.domain.Movie
import com.google.gson.annotations.SerializedName

data class Servings(
    @SerializedName("number")
    val number: Double?,
    @SerializedName("size")
    val size: Double?,
    @SerializedName("unit")
    val unit: String?
)


