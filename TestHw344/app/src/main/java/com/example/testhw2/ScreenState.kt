package com.example.testhw2

import com.example.testhw2.movieItems.Movie
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import com.example.testhw2.movieItems.fetchKino

sealed interface ScreenState {
    data object Initial : ScreenState
    data object Loading : ScreenState
    data class Success(val data: List<Movie>) : ScreenState
    data class Error(val message: String) : ScreenState
}

class MovieViewModel : ViewModel() {
    var screenState = mutableStateOf<ScreenState>(ScreenState.Initial)
        private set

    fun fetchData() {
        screenState.value = ScreenState.Loading

        viewModelScope.launch {
            val movies = fetchKino()

            if (movies.isNullOrEmpty()) {
                screenState.value = ScreenState.Error("Не удалось загрузить данные")
            } else {
                screenState.value = ScreenState.Success(movies)
            }
        }
    }
}
