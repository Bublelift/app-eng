package com.example.owocewarzywa.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class LoginViewModel : ViewModel() {

    private val _logged_in = MutableLiveData("")
    val logged_in: LiveData<String> = _logged_in

    fun log_in(uid: String){
        _logged_in.value = uid
    }
}