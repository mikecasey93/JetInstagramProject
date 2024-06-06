package com.vipulasri.jetinstagram.ui.add

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vipulasri.jetinstagram.R
import com.vipulasri.jetinstagram.ui.components.TopBar

@Composable
fun Add(){
    Column {
        TopBar()
        Row(
            Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(Color.Gray),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Column {
                Text(
                    "You've given Instagram access to a select",
                    color = Color.White
                )
                Text(
                    "number of photos and videos",
                    color = Color.White
                )
            }
            Text(
                "Manage",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                modifier = Modifier.padding(top = 10.dp)
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Icon(
            Icons.Filled.AccountCircle,
            "",
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .size(80.dp)
        )
        Text(
            "No media",
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            "Your photos and videos will appear here",
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)

        )
        Spacer(modifier = Modifier.height(80.dp))
        Row(
            Modifier
                .fillMaxWidth()
                .height(50.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                "Recents v",
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
            Image(
                painterResource(R.drawable.ic_outlined_camera),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(25.dp)
            )

        }
        Spacer(modifier = Modifier.height(300.dp))
        Row(
            Modifier
                .height(30.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
        ){
            Spacer(modifier = Modifier.weight(1f))
            Text("POST  ")
            Text("STORY  ")
            Text("REEL  ")
            Text("LIVE  ")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AddPreview(){
    Add()
}