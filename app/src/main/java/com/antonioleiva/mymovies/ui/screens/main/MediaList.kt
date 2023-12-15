package com.antonioleiva.mymovies.ui.screens.main

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import com.antonioleiva.mymovies.R
import com.antonioleiva.mymovies.model.MediaItem
import com.antonioleiva.mymovies.model.getMedia
import com.antonioleiva.mymovies.ui.MyMoviesApp
import com.antonioleiva.mymovies.ui.screens.shared.Thumb

@Composable
fun MediaList(
    onClick: (MediaItem) -> Unit,
    modifier: Modifier = Modifier
) {
    val mediaList: List<MediaItem> = getMedia()

    LazyColumn(
        contentPadding = PaddingValues(dimensionResource(R.dimen.padding_xsmall)),
        modifier = modifier
    ) {
        items(mediaList) { mediaItem ->
            MediaListItem(
                mediaItem = mediaItem,
                onClick = { onClick(mediaItem) },
                modifier = Modifier.padding(dimensionResource(R.dimen.padding_xsmall))
            )
        }
    }
}

@Composable
fun MediaListItem(
    mediaItem: MediaItem,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.clickable { onClick() }
    ) {
        Column {
            Thumb(mediaItem)
            Title(mediaItem)
        }
    }
}

@Composable
private fun Title(mediaItem: MediaItem) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colors.secondary)
            .padding(dimensionResource(R.dimen.padding_medium))
    ) {
        Text(
            text = mediaItem.title,
            style = MaterialTheme.typography.h6
        )
    }
}

@Preview
@Composable
fun MediaListItemPreview() {
    MyMoviesApp {
        val mediaItem = MediaItem(1, "Item 1", "", MediaItem.Type.VIDEO)
        MediaListItem(mediaItem = mediaItem, onClick = {})
    }
}