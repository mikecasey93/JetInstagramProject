package com.vipulasri.jetinstagram.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun TopBar(){
    Row(
        Modifier
            .fillMaxWidth()
            .height(30.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Icon(
            Icons.Filled.Close,
            "",
            modifier = Modifier.size(40.dp)
        )
        Text(
            "Add Post",
            fontSize = 20.sp
        )
        Icon(
            Icons.Filled.Add,
            "",
            modifier = Modifier.size(40.dp)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun TopBarPreview(){
    TopBar()
}
