package com.example.owocewarzywa.model

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PracticeViewModel: ViewModel(){
    private val _type = MutableLiveData<String>()
    val type: LiveData<String> = _type

    private val _topic = MutableLiveData<String>()
    val topic: LiveData<String> = _topic

    private val _difficulty = MutableLiveData<String>()
    val difficulty: LiveData<String> = _difficulty

    init {
        resetAll()
    }

    fun resetAll() {
        _topic.value = ""
        _difficulty.value = ""
        _type.value = ""
    }

    fun setPracticeType(type: String) {
        _type.value = type
    }

    fun setPracticeSettings(topic: String, difficulty: String) {
        _topic.value = when (topic) {
            in listOf("Natura", "Nature")-> "nature"
            in listOf("Transport", "Transport") -> "transport"
            in listOf("Zwierzęta", "Animals") -> "animals"
            in listOf("Inne", "Other") -> "other"
            else -> "technology"
        }
        _difficulty.value = when (difficulty) {
            in listOf("Łatwy", "Easy") -> "easy"
            in listOf("Trudny", "Hard") -> "hard"
            else -> "hard"
        }
    }
}