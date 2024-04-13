package com.example.owocewarzywa.practice.unscramble

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.owocewarzywa.utils.DataApi
import kotlin.random.Random

class UnscrambleViewModel : ViewModel(){
    //JK
    private val _apiStatus = MutableLiveData<String>()
    val apiStatus: LiveData<String> = _apiStatus

    private val _apiResponse = MutableLiveData<List<UnscrambleData>>()

    private val _score = MutableLiveData(0)
    val score: LiveData<Int>
        get() = _score

    private val _currentWordCount = MutableLiveData(0)
    val currentWordCount: LiveData<Int>
        get() = _currentWordCount

    private val _currentScrambledWord = MutableLiveData<String>()
    val currentScrambledWord: LiveData<String>
        get() = _currentScrambledWord

    private lateinit var currentWord: String


    private fun getNextWord() {

        currentWord = _apiResponse.value!![_currentWordCount.value!!].name
        val tempWord = currentWord.toCharArray()
        tempWord.shuffle()

        while (String(tempWord).equals(currentWord, false)) {
            tempWord.shuffle()
        }
        _currentScrambledWord.value = String(tempWord)
        _currentWordCount.value = _currentWordCount.value?.inc()
    }

    private fun increaseScore() {
        _score.value = _score.value?.plus(20)
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

    suspend fun initUnscramble( level: String, category: String) {
        try {
            val listResult =
                DataApi.retrofitService.getUnscramble("unscramble", level, category)
            _apiResponse.value = listResult
            _apiStatus.value = "Success"
            getNextWord()
        } catch (e: Exception) {
            _apiStatus.value = "Error"
        }
    }
}