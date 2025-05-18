package com.example.tap_tap.di
import com.example.tap_tap.data.datasource.TapDataSource
import com.example.tap_tap.data.repository.TapRepositoryImpl
import com.example.tap_tap.domain.repository.TapRepository
import com.example.tap_tap.domain.usecases.DecrementUseCase
import com.example.tap_tap.domain.usecases.GetTapUseCase
import com.example.tap_tap.domain.usecases.IncrementUseCase
import com.example.tap_tap.presentation.activity.TapViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
val appModule = module {
    factory { TapDataSource() }
    single<TapRepository> { TapRepositoryImpl(get()) }
    factory { IncrementUseCase(get()) }
    factory { DecrementUseCase(get()) }
    factory { GetTapUseCase(get()) }
    viewModel {
        TapViewModel(
            incrementUseCase = get(),
            decrementUseCase = get(),
            getTapUseCase = get()
        )
    }
}