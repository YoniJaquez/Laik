package com.example.laik.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laik.R
import com.example.laik.widget.BottomBar
import com.example.laik.widget.GradientBackground
import com.example.laik.widget.PeinadoCard
import com.example.laik.widget.PeinadoDialog
import com.example.laik.widget.PeinadoListItem
import com.example.laik.widget.TopBar

@Composable
@Preview
fun PeinadoListScreenPreview(){
    PeinadoListScreen(modifier = Modifier.fillMaxSize())
}
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun PeinadoListScreen(modifier: Modifier = Modifier){
    Scaffold(
        topBar = { TopBar("Peinado") { } }
    ) { paddingValiues ->
        Box(modifier = modifier) {
            GradientBackground(true)
            LazyColumn(
                modifier = Modifier.padding(10.dp, 60.dp,  10.dp, 0.dp)
            ) {
                items(20){
                    PeinadoListItem()
                }
            }
        }
    }

//    Column(modifier = Modifier.fillMaxSize()) {
//         Box(
//                modifier= Modifier
//                    .fillMaxWidth()
//                    .background(Color(0x66D9D9D9))
//         ) {
//
//
//           Row(modifier = Modifier.fillMaxWidth()) {
//               Image(
//                   painter = painterResource(id = R.drawable.peinado1),
//                   contentDescription = "",
//                   contentScale = ContentScale.Crop,
//                   modifier = Modifier
//                       .padding(3.dp)
//                       .clip(RoundedCornerShape(100.dp))
//                       .size(90.dp)
//               )
//               Column(
//               ) {
//                   Text(
//                       text = "Messy Pomp",
//                       fontSize = 30.sp,
//                       color = Color(0xff00ffff),
//                       textAlign = TextAlign.Start
//                   )
//                   Row {
//                       for (index in 0..4){
//                           if(index == 4){
//                               Box(
//                                   modifier = Modifier
//                                       .offset((index * -20).dp)
//                                       .background(
//                                           shape = RoundedCornerShape(100.dp),
//                                           color = Color(0xffD9D9D9)
//                                       )
//                                       .size(50.dp),
//                                   contentAlignment = Alignment.Center
//                               ){
//                                   Icon(
//                                       painter = painterResource(id = R.drawable.group_5),
//                                       contentDescription = "",
//                                       modifier = Modifier
//                                           .padding(5.dp)
//                                           .size(30.dp),
//                                       tint = Color(0xff000009)
//                                   )
//                               }
//                           }
//                           else{
//                               Image(
//                                   painter = painterResource(id = R.drawable.peinado1),
//                                   contentDescription = "",
//                                   contentScale = ContentScale.Crop,
//                                   modifier = Modifier
//                                       .offset((index * -20).dp)
//                                       .clip(RoundedCornerShape(100.dp))
//                                       .size(50.dp)
//                               )
//                           }
//                       }
//                   }
//               }
//               Text(text = "$450",
//                   color = Color.Cyan,
//                   textAlign = TextAlign.End,
//                   modifier = Modifier
//                       .fillMaxHeight()
//                       .align(Alignment.Bottom),
//                   fontSize = 20.sp
//               )
//          }
//
//
//
//
//         }
//
//
//    }




}