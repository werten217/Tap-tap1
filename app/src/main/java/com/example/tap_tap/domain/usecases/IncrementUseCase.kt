package com.example.tap_tap.domain.usecases

import com.example.tap_tap.domain.repository.TapRepository

class IncrementUseCase(private val repository: TapRepository) {
    operator fun invoke() {
        repository.increment()
    }
}