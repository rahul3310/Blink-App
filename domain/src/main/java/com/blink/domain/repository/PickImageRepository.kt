package com.blink.domain.repository

import android.net.Uri
import kotlinx.coroutines.flow.Flow

interface PickImageRepository {
    suspend fun saveImage(uri: Uri): String?
    fun loadSavedImages(): Flow<List<String?>>
}