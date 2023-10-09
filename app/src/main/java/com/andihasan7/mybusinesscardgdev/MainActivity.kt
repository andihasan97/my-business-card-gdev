package com.andihasan7.mybusinesscardgdev

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*

import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.andihasan7.mybusinesscardgdev.ui.theme.MyBusinessCardGDevTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyBusinessCardGDevTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    InfoMainCard()
                }
            }
        }
    }
}

@Composable
fun InfoMainCard() {
    Column(
        modifier = Modifier
        .background(Color(0xFFD2E7D4))
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        InfoLogoCard()
        InfoKontakCard()
    }
}

@Composable
fun InfoLogoCard() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.8F),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val image = painterResource(R.drawable.android_logo)
        Image(
            painter = image,
            contentDescription = stringResource(R.string.logo_android),
            modifier = Modifier
                .width(109.dp)
                .height(109.dp)
                .background(Color(0xFF073042))
        )
        Text(
            text = stringResource(R.string.andi_hasan_a),
            color = Color.Black,
            fontSize = 31.sp,
            modifier = Modifier.padding(top = 8.dp, bottom = 8.dp)

        )
        Text(
            text = stringResource(R.string.android_developer),
            color = Color(0xFF026836),
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun InfoKontakCard() {
    Column(modifier = Modifier
        .padding(bottom = 24.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.Start
    ) {
        Row(
            modifier = Modifier
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_phone_24),
                contentDescription = stringResource(R.string.ikon_telepon),
                modifier = Modifier.padding(end = 8.dp),
                tint = Color(0xFF026836)
            )
            Text(text = stringResource(R.string.my_number_phone),
                color = Color.Black
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier,
            horizontalArrangement = Arrangement.Start
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_share_24),
                contentDescription = stringResource(R.string.ikon_share),
                modifier = Modifier.padding(end = 8.dp),
                tint = Color(0xFF026836)
            )
            Text(text = stringResource(R.string.androiddev),
                color = Color.Black)
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(modifier = Modifier
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_email_24),
                contentDescription = stringResource(R.string.ikon_email),
                modifier = Modifier.padding(end = 8.dp),
                tint = Color(0xFF026836)
            )
            Text(text = stringResource(R.string.my_email),
                color = Color.Black)
        }
    }

}

@Preview(
    showBackground = true,
    showSystemUi = true)
@Composable
fun GreetingPreview() {
    MyBusinessCardGDevTheme {
        InfoMainCard()
    }
}