package com.example.testhw2

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL

data class Kino(
    val name: String,
    val genre: String,
    val imageUrl: String?
)

suspend fun fetchKino(): List<Kino>? {
    val year = 2018
    val month = "JANUARY"

    return withContext(Dispatchers.IO) {
        try {
            val url = URL("https://kinopoiskapiunofficial.tech/api/v2.2/films/premieres?year=$year&month=$month")
            val connection = url.openConnection() as HttpURLConnection
            connection.requestMethod = "GET"
            connection.setRequestProperty("X-API-KEY", "7597db49-c9b6-4beb-8e96-8d59dd728e2e")
            connection.setRequestProperty("Content-Type", "application/json")

            if (connection.responseCode != 200) throw Exception("Ошибка загрузки данных")
            val serverResponse = connection.inputStream.bufferedReader().readText()
            val filmsArrayBack = JSONObject(serverResponse).getJSONArray("items")

            var kinoList: List<Kino> = listOf()
            var index = 0

            while (index < filmsArrayBack.length()) {
                val item = filmsArrayBack.getJSONObject(index)
                val name = item.getString("nameRu")
                val genre = item.getJSONArray("genres").getJSONObject(0).getString("genre")
                val imageUrl = item.optString("posterUrl")

                kinoList = kinoList + Kino(name, genre, imageUrl)
                index++
            }

            kinoList

        } catch (e: Exception) {
            println("Ошибка загрузки данных.")
            null
        }
    }
}