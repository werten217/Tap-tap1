package com.example.tap_tap.domain.repository

import com.example.tap_tap.domain.model.Tap

interface TapRepository {
    fun increment()
    fun decrement()
    fun getTap() : Tap
}