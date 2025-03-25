package com.example.mynavigationapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController

@Composable
fun ListScreen(navController: NavController) {
    // Danh sách chạy từ 1 đến 100.000
    val allItems = (1..100000).map { "$it | The only way to do great work is to love what you do." }

    // Lấy 5 mục đầu tiên + mục thứ 100.000
    val displayedItems = allItems.take(5) + allItems.last()

    Column(modifier = Modifier.fillMaxSize()) {
        // Nút quay về và tiêu đề
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { navController.popBackStack() }) {
                Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "Back")
            }
            Text(
                text = "LazyColumn",
                fontSize = 24.sp,
                color = Color.Blue,
                modifier = Modifier.padding(start = 8.dp)
            )
        }

        // Danh sách hiển thị
        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            items(displayedItems) { item ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 8.dp)
                        .background(Color(0xFFD0E8FF), shape = RectangleShape) // Màu nền xanh nhạt
                        .clickable { navController.navigate("detail") }
                        .padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = item,
                        modifier = Modifier.weight(1f),
                        fontSize = 16.sp,
                        textAlign = TextAlign.Start
                    )
                    IconButton(
                        onClick = { navController.navigate("detail") },
                        modifier = Modifier
                            .size(36.dp)
                            .background(Color.Black, shape = RectangleShape)
                    ) {
                        Icon(
                            imageVector = Icons.Filled.ArrowForward,
                            contentDescription = "Go",
                            tint = Color.White
                        )
                    }
                }
            }
        }
    }
}
