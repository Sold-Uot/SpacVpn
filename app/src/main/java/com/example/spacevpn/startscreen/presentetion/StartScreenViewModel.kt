package com.example.spacevpn.startscreen.presentetion

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StartScreenViewModel : ViewModel() {
    private val _mutableLiveData = MutableLiveData<String>()
    val liveData :LiveData<String> = _mutableLiveData

    fun startCreatNewAccount(){

    }


    fun test () {}

}