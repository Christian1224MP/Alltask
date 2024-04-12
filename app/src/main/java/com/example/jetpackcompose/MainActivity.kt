package com.example.jetpackcompose

import androidx.compose.ui.Alignment
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.Top
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.ui.theme.JetPackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background)
                {
                    GreetingImage(
                        message = stringResource(R.string.happy_birthday_text),
                        text1 = stringResource(R.string.signature_text),
                        text2 = stringResource(R.string.text_2)
                        //modifier = Modifier.padding(8.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String,text1: String,text2: String,modifier: Modifier= Modifier) {
    Column(
        //verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(16.dp)

    ) {

        Text(
            text = message,
            fontSize = 24.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = text1,
            fontSize = 15.sp,
            //textAlign = TextAlign.Center,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(horizontal = 1.dp, vertical = 16.dp)
                //.align(alignment = Alignment.CenterHorizontally)

        )
        Text(
            text = text2,
            fontSize = 15.sp,
            //textAlign = TextAlign.Center,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(horizontal = 1.dp, vertical = 16.dp)
            //.align(alignment = Alignment.CenterHorizontally)

        )

    }
}
@Composable
fun GreetingImage(message: String, text1: String,text2: String, modifier : Modifier = Modifier,/*image: Painter*/) {
    val image = painterResource(R.drawable.bg_compose_background)
    Column(modifier = modifier
            .fillMaxWidth(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally

            //verticalAlignment =Alignment.Top
    ) {

        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            //modifier = Modifier.size(imageSize)
            modifier = Modifier.fillMaxWidth()
        )

        GreetingText(
            message = message,
            text1 = text1,
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),
            text2 = text2,

        )
    }
}
@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    JetPackComposeTheme {
        GreetingImage(
            message = stringResource(R.string.happy_birthday_text),
            text1 = stringResource(R.string.signature_text),
            text2 = stringResource (R.string.text_2)
        )
    }
}