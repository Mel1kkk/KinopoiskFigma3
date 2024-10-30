package com.example.testhw2.movieItems

data class Movie(
    val title: String,
    val genre: String,
    val rating: Double,
    val showGradient: Boolean = false,
    val imageUrl: String = "",
)

val premieres = listOf(
    Movie("Близкие", "драма", 7.8, imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig"),
    Movie("Близкие", "драма", 7.8, imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig"),
    Movie("Близкие", "драма", 7.8, imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig"),
    Movie("Близкие", "драма", 7.8, imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig"),
    Movie("Близкие", "драма", 7.8, imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig"),
    Movie("Близкие", "драма", 7.8, imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig"),
    Movie("Близкие", "драма", 7.8, imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig")
)

val popularity = listOf(
    Movie("Близкие", "драма", 7.8, true, imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig"),
    Movie("Близкие", "драма", 7.8, true, imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig"),
    Movie("Близкие", "драма", 7.8, imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig"),
    Movie("Близкие", "драма", 7.8, imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig"),
    Movie("Близкие", "драма", 7.8, imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig"),
    Movie("Близкие", "драма", 7.8, imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig"),
    Movie("Близкие", "драма", 7.8, imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig")
)

val usa = listOf(
    Movie("Близкие", "драма", 7.8, imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig"),
    Movie("Близкие", "драма", 7.8, imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig"),
    Movie("Близкие", "драма", 7.8, imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig"),
    Movie("Близкие", "драма", 7.8, imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig"),
    Movie("Близкие", "драма", 7.8, imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig"),
    Movie("Близкие", "драма", 7.8, imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig"),
    Movie("Близкие", "драма", 7.8, imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig")
)

val top250 = listOf(
    Movie("Близкие", "драма", 7.8, imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig"),
    Movie("Близкие", "драма", 7.8, true, imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig"),
    Movie("Близкие", "драма", 7.8, imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig"),
    Movie("Близкие", "драма", 7.8, imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig"),
    Movie("Близкие", "драма", 7.8, imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig"),
    Movie("Близкие", "драма", 7.8, imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig"),
    Movie("Близкие", "драма", 7.8, imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig")
)

val dramaFrance = listOf(
    Movie("Близкие", "драма", 7.8, imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig"),
    Movie("Близкие", "драма", 7.8, imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig"),
    Movie("Близкие", "драма", 7.8, imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig"),
    Movie("Близкие", "драма", 7.8, imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig"),
    Movie("Близкие", "драма", 7.8, imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig"),
    Movie("Близкие", "драма", 7.8, imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig"),
    Movie("Близкие", "драма", 7.8, imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig")
)

val serials = listOf(
    Movie("Близкие", "драма", 7.8, imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig"),
    Movie("Близкие", "драма", 7.8, imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig"),
    Movie("Близкие", "драма", 7.8, imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig"),
    Movie("Близкие", "драма", 7.8, imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig"),
    Movie("Близкие", "драма", 7.8, imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig"),
    Movie("Близкие", "драма", 7.8, imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig"),
    Movie("Близкие", "драма", 7.8, imageUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/2924f6c4-4ea0-4a1d-9a48-f29577172b27/orig")
)