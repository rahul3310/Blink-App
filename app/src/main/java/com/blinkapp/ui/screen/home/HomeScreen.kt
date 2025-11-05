package com.blinkapp.ui.screen.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.ArrowBack
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.blinkapp.R
import com.blinkapp.ui.components.ToggleButtonWithText


@OptIn(ExperimentalMaterial3Api::class)
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun HomeScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {},
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Outlined.ArrowBack,
                            contentDescription = "back arrow"
                        )
                    }
                }
            )
        }
    ) { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {
            HomeScreenContent()
        }
    }
}


@Composable
private fun HomeScreenContent() {
    Column(
        modifier = Modifier
    ) {
        Text(
            text = "Photos",
            fontSize = 28.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(start = 16.dp)
        )

        Text(
            text = "Photos selection",
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(start = 16.dp, top = 16.dp)
        )
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            items(5) {
                Image(
                    painter = painterResource(R.drawable.ic_launcher_background),
                    contentDescription = "imag",
                    modifier = Modifier
                        .padding(start = 16.dp)
                        .size(100.dp)
                        .clip(RoundedCornerShape(16.dp))
                )
            }
        }

        Row(
            modifier = Modifier
                .wrapContentWidth()
                .padding(start = 16.dp, top = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            Icon(
                imageVector = Icons.Outlined.Add, contentDescription = "add",
                modifier = Modifier.size(32.dp)
            )
            Text(
                text = "Add Photo",
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(start = 16.dp)
            )
        }

        ToggleButtonWithText(
            modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 16.dp),
            text = "Greyscale preview",
            onCheckedChange = {}
        )

        ToggleButtonWithText(
            modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 12.dp),
            text = "Frame",
            onCheckedChange = {}
        )

    }
}
