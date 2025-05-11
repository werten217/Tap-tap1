package com.example.tap_tap.data.mapper



import com.example.tap_tap.data.model.TapDto
import com.example.tap_tap.domain.model.Tap
import com.example.tap_tap.domain.model.TypeOfTap

fun toTypeOfTap(type: String): TypeOfTap {
    return when (type) {
        "increment" ->  TypeOfTap.INCREMENT
        "decrement" ->  TypeOfTap.DECREMENT
        else ->  TypeOfTap.NONE

    }
}
fun TapDto.toTap(): Tap {
    return Tap(
        tap = this.tap,
        typeOfTap = when (this.typeOfTap) {
            "increment" -> TypeOfTap.INCREMENT
            "decrement" -> TypeOfTap.DECREMENT
            else -> TypeOfTap.NONE
        }
    )
}