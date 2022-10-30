package com.ilko.calllog.ui.main

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ilko.calllog.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MiscScreen() {
    Scaffold {
        val modifier = Modifier.padding(it)
        LazyColumn {
            items(3) {
                Modifier.clickable {  }
                    .padding(2.dp)
                Text(text = "test")
            }
            item {
                Button(onClick = { /*TODO*/ }) {

                }
            }
        }
    }

}