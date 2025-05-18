package com.example.tap_tap.data.repository

import com.example.tap_tap.data.datasource.TapDataSource
import com.example.tap_tap.data.mapper.toTap
import com.example.tap_tap.data.mapper.toTypeOfTap
import com.example.tap_tap.domain.model.Tap

import com.example.tap_tap.domain.repository.TapRepository

class TapRepositoryImpl( private var api : TapDataSource ): TapRepository {



    override fun increment() {
api.increment()
    }

    override fun decrement() {
api.decrement()
    }

    override fun getTap(): Tap {
        val dto = api.getTap()
        return dto.toTap()
    }
}