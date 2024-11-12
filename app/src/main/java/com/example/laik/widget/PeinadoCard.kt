package com.example.laik.widget

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laik.R
@Composable
@Preview
fun PeinadoCardPreview(){
    PeinadoCard(modifier = Modifier)
}





@Composable
fun PeinadoCard(modifier: Modifier){
    Box(modifier = modifier) {
        Image(
            painter = painterResource(id = R.drawable.peinado1),
            contentDescription = "image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        GradientBackground()
        Column {
            Text(
                text = "Messy Pomp",
                fontSize = 30.sp,
                color = Color.Cyan,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.weight(1f))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()

            ) {
                Text(
                    text = "$450",
                    fontSize = 30.sp,
                    color = Color.Cyan,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.weight(1f)
                )

                Icon(
                    painter = painterResource(id = R.drawable.ic_editar),
                    contentDescription = "",
                    modifier = Modifier
                        .size(50.dp)
                        .padding(5.dp)
                        .clickable { },
                    tint = Color.Cyan

                )
            }

            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(alignment = Alignment.End),
                horizontalArrangement = Arrangement.spacedBy(3.dp)
            ) {
                item {
                    Image(
                        modifier = Modifier
                            .size(100.dp)
                            .clip(RoundedCornerShape(5.dp)),
                        painter = painterResource(id = R.drawable.peinado1),
                        contentDescription = "",
                        contentScale = ContentScale.Crop

                    )
                }
                item {
                    Image(
                        modifier = Modifier
                            .size(100.dp)
                            .clip(RoundedCornerShape(5.dp)),
                        painter = painterResource(id = R.drawable.peinado2),
                        contentDescription = "",
                        contentScale = ContentScale.Crop

                    )
                }
                item {
                    Image(
                        modifier = Modifier
                            .size(100.dp)
                            .clip(RoundedCornerShape(5.dp)),
                        painter = painterResource(id = R.drawable.peinado3),
                        contentDescription = "",
                        contentScale = ContentScale.Crop

                    )
                }
                item {
                    Image(
                        modifier = Modifier
                            .size(100.dp)
                            .clip(RoundedCornerShape(5.dp)),
                        painter = painterResource(id = R.drawable.peinado1),
                        contentDescription = "",
                        contentScale = ContentScale.Crop

                    )
                }
                item {
                    Image(
                        modifier = Modifier
                            .size(100.dp)
                            .clip(RoundedCornerShape(5.dp)),
                        painter = painterResource(id = R.drawable.peinado2),
                        contentDescription = "",
                        contentScale = ContentScale.Crop

                    )
                }
                item {
                    Image(
                        modifier = Modifier
                            .size(100.dp)
                            .clip(RoundedCornerShape(5.dp)),
                        painter = painterResource(id = R.drawable.peinado3),
                        contentDescription = "",
                        contentScale = ContentScale.Crop

                    )
                }
                item {
                    Image(
                        modifier = Modifier
                            .size(100.dp)
                            .clip(RoundedCornerShape(5.dp)),
                        painter = painterResource(id = R.drawable.peinado1),
                        contentDescription = "",
                        contentScale = ContentScale.Crop

                    )
                }
                item {
                    Image(
                        modifier = Modifier
                            .size(100.dp)
                            .clip(RoundedCornerShape(5.dp)),
                        painter = painterResource(id = R.drawable.peinado2),
                        contentDescription = "",
                        contentScale = ContentScale.Crop

                    )
                }
                item {
                    Image(
                        modifier = Modifier
                            .size(100.dp)
                            .clip(RoundedCornerShape(5.dp)),
                        painter = painterResource(id = R.drawable.peinado3),
                        contentDescription = "",
                        contentScale = ContentScale.Crop

                    )
                }

            }

        }
    }
}