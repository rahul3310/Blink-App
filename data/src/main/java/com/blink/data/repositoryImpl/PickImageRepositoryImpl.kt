package com.blink.data.repositoryImpl

import android.content.Context
import android.net.Uri
import com.blink.domain.repository.PickImageRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import java.io.File
import java.io.FileOutputStream
import java.io.InputStream

class PickImageRepositoryImpl(private val context: Context) : PickImageRepository {

    private val _savedImages = MutableStateFlow<List<String>>(emptyList())

    override suspend fun saveImage(uri: Uri): String ?{
        return try {
            val inputStream: InputStream? = context.contentResolver.openInputStream(uri)
            val fileName = "img_${System.currentTimeMillis()}.jpg"
            val file = File(context.filesDir, fileName)

            inputStream.use { input ->
                FileOutputStream(file).use { output ->
                    input?.copyTo(output)
                }
            }

            val newPath = file.absolutePath
            _savedImages.value += newPath
            newPath
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    /** Call this once at app start to load existing images **/
    override fun loadSavedImages() : Flow<List<String?>> {
        val files = context.filesDir.listFiles()?.filter { it.name.startsWith("img_") } ?: emptyList()
        _savedImages.value = files.map { it.absolutePath }
        return _savedImages.asStateFlow()
    }}

