package com.example.testhw2.movieItems

data class Gallery(
    val total: Int,
    val totalPages: Int,
    val items: List<Image>
)

data class Image(
    val imageUrl: String,
    val previewUrl: String
)