package com.example.laik.widget

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laik.R

@Composable
fun TopBar(title: String, onBackPressed: (() -> Unit)? = null){
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(5.dp)) {
        Icon(
            painter = painterResource(id = R.drawable.ic_volver),
            contentDescription = "",
            modifier = Modifier
                .size(50.dp)
                .padding(5.dp)
                .clickable { onBackPressed?.invoke() },
            tint = Color.Cyan
        )
        Text(
            text = title,
            fontSize = 30.sp,
            color = Color.Cyan,
            textAlign = TextAlign.Center,
            modifier = Modifier.weight(1f)
        )

    }
}