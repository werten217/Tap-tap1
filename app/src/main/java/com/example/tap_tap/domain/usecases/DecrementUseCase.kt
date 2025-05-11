package com.example.tap_tap.domain.usecases

import com.example.tap_tap.domain.repository.TapRepository

class DecrementUseCase(private val repository: TapRepository) {
    operator fun invoke() {
        repository.decrement()
    }
}