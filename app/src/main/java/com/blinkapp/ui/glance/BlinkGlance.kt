package com.blinkapp.ui.glance


import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.provideContent
import androidx.glance.background
import androidx.glance.layout.Column
import androidx.glance.layout.Row
import androidx.glance.layout.fillMaxSize
import androidx.glance.text.Text

class BlinkGlance : GlanceAppWidget() {
    override suspend fun provideGlance(context: Context, id: GlanceId) = provideContent {
        BlinkGlanceView()
    }
}

@Composable
private fun BlinkGlanceView() {
    val currentPage =  0

    Column(
        modifier = GlanceModifier.fillMaxSize()
            .background(Color.White)
    ) {
        Text("Visit: $currentPage")
    }
}

