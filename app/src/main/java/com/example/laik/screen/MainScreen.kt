package com.example.laik.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import com.example.laik.widget.BottomBar
import com.example.laik.widget.PeinadoCard
import com.example.laik.widget.PeinadoDialog

@Preview
@Composable
fun MainScreenPreview(){
    MainScreen()
}


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen(){
   Scaffold(
       bottomBar = { BottomBar() }
   ) { paddingValiues ->
       PeinadoCard(modifier = Modifier.fillMaxSize())
       PeinadoDialog()
   }
}