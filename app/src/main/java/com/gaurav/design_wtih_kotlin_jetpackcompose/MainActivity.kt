package com.gaurav.design_wtih_kotlin_jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.gaurav.design_wtih_kotlin_jetpackcompose.ui.theme.DesignwtihkotlinJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            myFirstComposeView()
        }
    }
}

@Composable
fun myFirstComposeView(){
    DesignwtihkotlinJetpackComposeTheme {
        Column(
            modifier = Modifier
                .background(Color.Green)
                .fillMaxSize(0.5f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Text("Hello !! ")
            Text("World")
            Text("Testing")
            Text("SpaceAround")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun DefaultPreview() {
    myFirstComposeView()
}