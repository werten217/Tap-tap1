package com.example.tap_tap.presentation.activity

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.tap_tap.domain.model.Tap
import com.example.tap_tap.domain.usecases.DecrementUseCase
import com.example.tap_tap.domain.usecases.GetTapUseCase
import com.example.tap_tap.domain.usecases.IncrementUseCase

class TapViewModel(
    private val incrementUseCase: IncrementUseCase,
    private val decrementUseCase: DecrementUseCase,
    private val getTapUseCase: GetTapUseCase
): ViewModel() {

    private val _tapData : MutableLiveData<Tap> = MutableLiveData()
    val tapData : LiveData<Tap> = _tapData


    fun increment() {
        incrementUseCase()
        _tapData.value=getTapUseCase()
    }
    fun decrement() {
        decrementUseCase()
        _tapData.value = getTapUseCase()
    }

}