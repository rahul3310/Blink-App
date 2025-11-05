package com.blinkapp.receiver

import androidx.glance.appwidget.GlanceAppWidgetReceiver
import com.blinkapp.ui.glance.BlinkGlance

class BlinkGlanceReceiver : GlanceAppWidgetReceiver() {

    override val glanceAppWidget = BlinkGlance()

}