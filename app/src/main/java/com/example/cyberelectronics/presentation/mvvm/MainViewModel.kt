package com.example.cyberelectronics.presentation.mvvm

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.cyberelectronics.R

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val _type = MutableLiveData<Int>()
    val type: LiveData<Int> = _type

    fun setType(type: Int) {
        _type.value = type
    }

    fun getTypeName(type: Int): Int = when (type) {
        1 -> R.string.sign_up
        2 -> R.string.Login
        else -> 0
    }
}
