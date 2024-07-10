package com.satverse.bookbox.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun BookboxTheme(
    content: @Composable () -> Unit
) {

    MaterialTheme(
        typography = Typography,
        content = content
    )
}