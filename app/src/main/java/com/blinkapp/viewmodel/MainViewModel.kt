package com.blinkapp.viewmodel

import androidx.lifecycle.ViewModel
import com.blink.domain.useCase.GetSaveImagesUseCase

class MainViewModel(
    private val saveImagesUseCase: GetSaveImagesUseCase,
    private val getSaveImagesUseCase: GetSaveImagesUseCase
) : ViewModel() {



}