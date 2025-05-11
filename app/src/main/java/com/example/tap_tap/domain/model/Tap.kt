package com.example.tap_tap.domain.model

data class Tap (
    val tap: Int,
    val typeOfTap: TypeOfTap= TypeOfTap.NONE

    )
enum class TypeOfTap{
    NONE,
    INCREMENT,
    DECREMENT
}