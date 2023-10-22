package com.crash2333.wanandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.crash2333.wanandroid.ui.theme.WanAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            //导航
            val navController = rememberNavController()

        }
    }
}

@Composable
fun MessageCard(number: String, modifier: Modifier = Modifier) {
    Text(text = number)
}

@Preview
@Composable
fun MessageCardPreview() {
    MessageCard(number = "10086"/*, modifier = Modifier.fillMaxSize()*/)
}
