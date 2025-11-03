package dev.pace.circleapp.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color


private val LightColorScheme = lightColorScheme(
    primary = Terracotta,
    secondary = SageGreen,
    tertiary = BlushBeige,
    background = CreamBackground,
    onPrimary = Color.White,
    onBackground = OliveText
)

private val DarkColorScheme = darkColorScheme(
    primary = LightTerracotta,
    secondary = SageGreen,
    tertiary = BlushBeige,
    background = Color(0xFF2E2A25),
    onPrimary = Color.White,
    onBackground = Color(0xFFEDE7D9)
)