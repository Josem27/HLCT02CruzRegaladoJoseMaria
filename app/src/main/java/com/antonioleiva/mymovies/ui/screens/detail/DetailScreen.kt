package com.antonioleiva.mymovies.ui.screens.detail

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.antonioleiva.mymovies.model.getMedia
import com.antonioleiva.mymovies.ui.screens.shared.ArrowBackIcon
import com.antonioleiva.mymovies.ui.screens.shared.Thumb
import com.antonioleiva.mymovies.ui.theme.Typography


@Composable
fun DetailScreen(mediaId: Int, onUpClick: () -> Unit) {
    val mediaItem = remember { getMedia().first { it.id == mediaId } }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = mediaItem.title) },
                navigationIcon = { ArrowBackIcon(onUpClick) }
            )
        },
        content = {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                item {
                    // Título del video
                    Text(
                        text = mediaItem.title,
                        style = Typography.h6,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )
                }

                item {
                    // Autor más pequeño
                    Text(
                        text = "Autor: ${mediaItem.author}",
                        style = Typography.caption,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )
                }

                item {
                    // Espacio para la descripción del video
                    Text(
                        text = mediaItem.description ?: "",
                        style = Typography.body1,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )
                }

                item {
                    // Imagen del video
                    Thumb(mediaItem = mediaItem)
                }
            }
        }
    )
}
