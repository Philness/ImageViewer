package com.example.imageviewer

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.imageviewer.ui.theme.ImageViewerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImageViewerTheme {
                    ImageViewerApp()
            }
        }
    }
}

@Composable
fun ImageViewerApp() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Surface(modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = painterResource(R.drawable.dorcelessness),
                contentScale = ContentScale.FillWidth,
                contentDescription = "test",
                modifier = Modifier.padding(24.dp)
            )
        }

        Text(stringResource(id = R.string.dorcelessness))
        Text(stringResource(id = R.string.dorcelessness_desc))


        Row() {
            Button(onClick = { /*TODO*/ }) {
            }
            Button(onClick = { /*TODO*/ }) {
            }
        }

    }
}

@Preview
@Composable
fun GreetingPreview() {
    ImageViewerTheme {
        ImageViewerApp()
    }
}