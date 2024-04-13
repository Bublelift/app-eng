package com.example.owocewarzywa.practice.flashcards

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.owocewarzywa.utils.DataApi

class FlashcardViewModel: ViewModel() {
    //RW
    private val _apiStatus = MutableLiveData<String>()
    private val _apiResponse = MutableLiveData<List<FlashcardData>>()

    private val _score = MutableLiveData(0)
    val score: LiveData<Int>
        get() = _score

    val hints = MutableLiveData(2)
    val currentHint = MutableLiveData<String>()
    val currentImage = MutableLiveData<String>()

    private val _currentWordCount = MutableLiveData(0)
    val currentWordCount: LiveData<Int>
        get() = _currentWordCount

    private val _currentFlashWord = MutableLiveData<String>()
    val currentFlashWord: LiveData<String>
        get() = _currentFlashWord

    private lateinit var currentWord: String

    private fun getNextWord() {
        _currentFlashWord.value = _apiResponse.value!![_currentWordCount.value!!].quest
        currentWord = _apiResponse.value!![_currentWordCount.value!!].answer
        currentHint.value = _apiResponse.value!![_currentWordCount.value!!].hint
        currentImage.value = _apiResponse.value!![_currentWordCount.value!!].image
        _currentWordCount.value = _currentWordCount.value?.inc()
    }

    private fun increaseScore() {
        when (hints.value) {
            2 -> _score.value = _score.value?.plus(25)
            1 -> _score.value = _score.value?.plus(15)
            else -> _score.value = _score.value?.plus(5)
        }
    }

    fun isUserWordCorrect(playerWord: String): Boolean {
        if (playerWord.equals(currentWord, true)) {
            increaseScore()
            return true
        }
        return false
    }

    fun nextWord(): Boolean {
        return if (_currentWordCount.value!! < 10) {
            getNextWord()
            true
        } else false
    }

    suspend fun getFlashcardsData(level: String, category: String) {
        try {
            val listResult = DataApi.retrofitService.getFlashcards("flashcards", level, category)
//            Log.e("Result:", listResult.toString())
            _apiResponse.value = listResult
            _apiStatus.value = "Success"
            getNextWord()
        } catch (e: Exception) {
            _apiStatus.value = "Error"
        }
    }
}