package com.example.mynavigationapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.mynavigationapp.R

@Composable
fun DetailScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Nút quay lại ở góc trên cùng bên trái
        IconButton(
            onClick = { navController.navigateUp() },
            modifier = Modifier.align(Alignment.TopStart)
        ) {
            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Back", tint = Color.Blue)
        }

        // Nội dung căn giữa màn hình
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            // Tiêu đề
            Text(
                text = "Detail",
                fontSize = 24.sp,
                color = Color.Blue,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            // Câu quote
            Text(
                text = "“The only way to do great work\nis to love what you do”",
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(bottom = 12.dp)
            )

            // Hình ảnh
            Image(
                painter = painterResource(id = R.drawable.image2),
                contentDescription = "Quote Image",
                modifier = Modifier
                    .fillMaxWidth(0.9f)  // 90% màn hình
                    .aspectRatio(3f / 4f) // Tỷ lệ ảnh
                    .clip(RoundedCornerShape(12.dp)) // Bo góc nhẹ
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Nút BACK TO ROOT
            Button(
                onClick = { navController.popBackStack("home", inclusive = false) },
                modifier = Modifier
                    .fillMaxWidth(0.85f)
                    .height(50.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(Color.Blue)
            ) {
                Text(text = "BACK TO ROOT", fontSize = 16.sp, color = Color.White)
            }
        }
    }
}
