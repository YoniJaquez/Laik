package com.example.laik.widget

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laik.R
import com.example.laik.screen.PeinadoListScreen

@Composable
@Preview
fun PeinadoListItemPreview(){
    PeinadoListItem(modifier = Modifier.fillMaxWidth())
}

@Composable
fun PeinadoListItem(modifier: Modifier = Modifier){
    Box(
        modifier= modifier
            .padding(0.dp, 5.dp)
            .background(Color(0x66D9D9D9), shape = RoundedCornerShape(10.dp))
    ) {
        Row(modifier = Modifier.fillMaxWidth()
            .padding(10.dp)) {
            Image(
                painter = painterResource(id = R.drawable.peinado1),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(3.dp)
                    .clip(RoundedCornerShape(100.dp))
                    .size(90.dp)
            )
            Column(modifier = Modifier.fillMaxWidth().weight(1f)) {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "Messy Pomp",
                    fontSize = 30.sp,
                    color = Color(0xff00ffff),
                    textAlign = TextAlign.Start
                )
                Row(modifier = Modifier.fillMaxWidth()) {
                    for (index in 0..4){
                        if(index == 4){
                            Box(
                                modifier = Modifier
                                    .offset((index * -20).dp)
                                    .size(50.dp)
                                    .clip(RoundedCornerShape(100.dp))
                                    .background(
                                        color = Color(0xffD9D9D9)
                                    ),
                                contentAlignment = Alignment.Center
                            ){
                                Icon(
                                    painter = painterResource(id = R.drawable.group_5),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .padding(5.dp)
                                        .size(30.dp),
                                    tint = Color(0xff000009)
                                )
                            }
                        }
                        else{
                            Image(
                                painter = painterResource(id = R.drawable.peinado1),
                                contentDescription = "",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .offset((index * -20).dp)
                                    .clip(RoundedCornerShape(100.dp))
                                    .size(50.dp)
                            )
                        }
                    }
                }
            }
            Text(text = "$450",
                color = Color.Cyan,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .align(Alignment.Bottom),
                fontSize = 20.sp
            )
        }
    }
}