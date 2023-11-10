package com.example.synrgychallenge5.data.remote.response


import com.example.synrgychallenge5.domain.Movie
import com.google.gson.annotations.SerializedName

data class ResultX(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("image")
    val image: String?,
    @SerializedName("imageType")
    val imageType: String?,
    @SerializedName("title")
    val title: String?
)

fun ResultX.toMovie(): Movie{
    return Movie(
        title = title.orEmpty(),
        image = image.orEmpty(),
        id = id ?: -1,
    )
}