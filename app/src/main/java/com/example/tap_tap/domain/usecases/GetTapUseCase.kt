package com.example.tap_tap.domain.usecases

import com.example.tap_tap.domain.model.Tap
import com.example.tap_tap.domain.repository.TapRepository

class GetTapUseCase(private val repository: TapRepository) {
    operator fun invoke(): Tap {
        return repository.getTap()
    }
}