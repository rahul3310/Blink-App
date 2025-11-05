package com.blinkapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import java.net.URI

@Composable
fun LoadImage(
    uri : URI,
    modifier: Modifier
){
    Image(
        painter = rememberAsyncImagePainter(uri),
        contentDescription = null,
        modifier = modifier
            .size(200.dp)
            .clip(RoundedCornerShape(16.dp)),
        contentScale = ContentScale.Crop
    )
}