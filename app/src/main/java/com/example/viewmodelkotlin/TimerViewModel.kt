package com.example.viewmodelkotlin

import androidx.lifecycle.ViewModel

class TimerViewModel: ViewModel() {
    private var counter = 0

    fun getInitialCounter(): Int{
        return counter
    }

    fun getUpdatedCounter(): Int{
        return ++counter
    }

}