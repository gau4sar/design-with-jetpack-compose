package com.gaurav.design_wtih_kotlin_jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gaurav.design_wtih_kotlin_jetpackcompose.ui.theme.DesignwtihkotlinJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            myFirstComposeView()
        }
    }
}

/**
 * - width/height  (if the set width exceeds the parent_content area then it resets it to the max_parent)
 * - requiredWidth / requiredHeight (This is always equal to the defined DP value)
 * - padding
 * - offset
 * - Spacer
 */

@Composable
fun myFirstComposeView() {
    DesignwtihkotlinJetpackComposeTheme {
        Column(
            modifier = Modifier
                .background(Color.Green)
                //.fillMaxSize(0.5f)
                .width(320.dp)
                .requiredHeight(150.dp)
                .padding(10.dp)
                .offset(15.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Text("Hello !! ", modifier = Modifier.clickable {
                // New onClickListener implementation
            })
            Spacer(Modifier
                .offset(20.dp, 25.dp)
            )
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