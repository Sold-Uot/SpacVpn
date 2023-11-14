package com.example.spacevpn.startscreen.presentetion

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StartScreenViewModel : ViewModel() {
    private val _mutableLiveData = MutableLiveData<String>()
    val liveData :LiveData<String> = _mutableLiveData

    fun result(){
        _mutableLiveData.value = "hello"
    }

}