package com.example.auth

import android.provider.CalendarContract.Colors
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen() {
    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = painterResource(id = R.drawable.download),
            contentDescription = "Login Image",
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
                .background(Color.Black)
        )
        
        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Welcome Back",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = "Login to your account"
        )

        Spacer(modifier = Modifier.height(4.dp))

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text(text = "Email or Username")}
        )

        Spacer(modifier = Modifier.height(4.dp))

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text(text = "Password")},
            visualTransformation = PasswordVisualTransformation()
        )
        
        Spacer(modifier = Modifier.height(10.dp))
        
        ElevatedButton(
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.Black
            ),
            onClick = {  }
        ) {
            Text(
                text = "LogIn",
                color = Color.White
            )
        }

        Spacer(modifier = Modifier.height(32.dp))

        Text(
            text = "Forgot password?",
            modifier = Modifier.clickable {  }
        )

        Spacer(modifier = Modifier.height(32.dp))

        Text(text = "Or sign in with")

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(40.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Image(
                painter = painterResource(id = R.drawable.facebook),
                contentDescription = "facebook icon",
                modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape)
                    .background(Color.Black)
                    .clickable { }
            )

            Image(
                painter = painterResource(id = R.drawable.instagram),
                contentDescription = "instagram icon",
                modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape)
                    .background(Color.Black)
                    .clickable { }
            )

            Image(
                painter = painterResource(id = R.drawable.x),
                contentDescription = "x icon",
                modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape)
                    .background(Color.Black)
                    .clickable { }
            )
        }
    }
}