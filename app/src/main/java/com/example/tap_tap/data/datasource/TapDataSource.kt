package com.example.tap_tap.data.datasource

import com.example.tap_tap.data.model.TapDto

object TapDataSource {


    private var tap = 0
    private var typeOfTap = "none"
    fun increment() {
tap++
        typeOfTap = "increment"
    }
    fun decrement(){
        tap--
        typeOfTap = "decrement"
    }
    fun getTap() : TapDto {
        return TapDto(
            tap = tap,
            typeOfTap = typeOfTap
        )
    }


}