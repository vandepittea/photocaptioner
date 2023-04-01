package com.example.photocaptioner.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.photocaptioner.data.Datasource
import com.example.photocaptioner.ui.theme.PhotoCaptionerTheme
import com.example.photocaptioner.R

@Composable
fun AlbumsScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = stringResource(id = R.string.my_albums),
                style = MaterialTheme.typography.subtitle1,
                modifier = Modifier
                        .padding(end = 8.dp)
            )

            ButtonIcon(
                onClick = {},
                icon = Icons.Default.Add,
                description = R.string.add_album
            )
        }

        LazyColumn(
            modifier = Modifier
                .fillMaxSize(),
            contentPadding = PaddingValues(start = 16.dp, end = 16.dp)
        ) {
            items(Datasource.albumList) { album ->
                ImageWithDescription(
                    image = album.imagePlaceholder,
                    description = album.name
                )
            }
        }
    }
}

@Preview
@Composable
fun AlbumsScreenPreview(){
    PhotoCaptionerTheme {
        AlbumsScreen()
    }
}