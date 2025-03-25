package com.example.mynavigationapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.mynavigationapp.R

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.image1),
            contentDescription = "Logo",
            modifier = Modifier.size(180.dp) // Tăng kích thước ảnh
        )

        Spacer(modifier = Modifier.height(24.dp)) // Khoảng cách giữa ảnh và tiêu đề

        Text(
            text = "Navigation",
            fontSize = 28.sp, // Tăng kích thước chữ
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(16.dp)) // Khoảng cách giữa tiêu đề và nội dung

        Text(
            text = "A framework that simplifies navigation between UI components (activities, fragments, or composables) in an app.",
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(40.dp)) // Khoảng cách giữa nội dung và nút PUSH

        Button(
            onClick = { navController.navigate("list") },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            shape = RoundedCornerShape(25.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF007BFF)) // Màu xanh iOS
        ) {
            Text(text = "PUSH", fontSize = 18.sp, color = Color.White, fontWeight = FontWeight.Bold)
        }
    }
}
