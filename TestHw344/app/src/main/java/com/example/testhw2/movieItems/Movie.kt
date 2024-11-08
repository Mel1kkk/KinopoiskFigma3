package com.example.testhw2.movieItems

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL

data class Movie(
    val title: String,
    val genre: String,
    val rating: Double = 7.8,
    val showGradient: Boolean = false,
    val imageUrl: String? = null
)

suspend fun fetchKino(): List<Movie>? {
    val year = 2018
    val month = "JANUARY"

    return withContext(Dispatchers.IO) {
        try {
            val url = URL("https://kinopoiskapiunofficial.tech/api/v2.2/films/premieres?year=$year&month=$month")
            val connection = url.openConnection() as HttpURLConnection
            connection.requestMethod = "GET"
            connection.setRequestProperty("X-API-KEY", "oz apilaryndy zhazyndar")
            connection.setRequestProperty("Content-Type", "application/json")

            if (connection.responseCode != 200) throw Exception("Ошибка загрузки данных")
            val serverResponse = connection.inputStream.bufferedReader().readText()
            val filmsArrayBack = JSONObject(serverResponse).getJSONArray("items")

            var kinoList: List<Movie> = listOf()
            var index = 0

            while (index < filmsArrayBack.length()) {
                val item = filmsArrayBack.getJSONObject(index)
                val name = item.getString("nameRu")
                val genre = item.getJSONArray("genres").getJSONObject(0).getString("genre")
                val imageUrl = item.optString("posterUrl")

                kinoList = kinoList + Movie(name, genre, imageUrl = imageUrl.takeIf { it.isNotEmpty() })
                index++
            }

            kinoList

        } catch (e: Exception) {
            println("Ошибка загрузки данных.")
            null
        }
    }
}