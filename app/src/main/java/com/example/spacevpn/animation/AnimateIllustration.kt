package com.example.spacevpn.animation

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue


@Composable
fun AnimateIllustration(durationMillis: Int): Float {

    val rotationAngle by rememberInfiniteTransition().animateFloat(
        initialValue = 0f,
        targetValue = 360F,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = durationMillis, easing = LinearEasing)
        )
    )

    return rotationAngle
}