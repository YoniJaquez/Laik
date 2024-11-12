package com.example.laik.widget

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BottomBar(){
    var isDropdowVisible by remember { mutableStateOf(false) }
    var selectedText by remember {  mutableStateOf("")  }
    var expanded by remember {  mutableStateOf(false)  }
    val acciones = listOf("nuevo", "editar", "eliminar")

    NavigationBar(modifier = Modifier.padding(0.dp), containerColor = Color.Black) {
        NavigationBarItem(selected = false, onClick = { expanded = !expanded   }, icon = {
            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = "menu",
                modifier = Modifier
                    .size(50.dp),
                tint = Color.Cyan
            )

            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false},
                modifier = Modifier.width(100.dp)

            ) {
                acciones.forEach{ accion ->
                    DropdownMenuItem(
                        text = { Text(text = accion) },
                        onClick = {
                            expanded = false
                            selectedText = accion
                        },
                    )
                }
            }
        })

        Spacer(modifier = Modifier.weight(1f))

        NavigationBarItem(
            selected = false,
            onClick = {  },
            icon = { Text(text = "Laik", fontSize = 30.sp, color = Color.Cyan) }
        )
    }
}

