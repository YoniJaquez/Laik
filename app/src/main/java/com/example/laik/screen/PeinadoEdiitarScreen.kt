package com.example.laik.screen

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
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laik.R

@Composable
@Preview
fun PeinadoEditarScreenPreview(){
    PeinadoEditar( modifier = Modifier, onClickGuardar = {})
}
@Composable
fun  PeinadoEditar( modifier: Modifier = Modifier, onClickGuardar:() -> Unit){
    var textPeinad1 by remember {mutableStateOf("")}
    var textPeinad2 by remember {mutableStateOf("")}
    var enabled by rememberSaveable {mutableStateOf(true) }




    Box(modifier =  Modifier
    ){
//        Image(
//            painter = painterResource(id = R.drawable.peinado1),
//            contentDescription = "image",
//            contentScale = ContentScale.Crop,
//            modifier = Modifier.fillMaxSize()
//        )


        Box(
            modifier= Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color.Black,
                            Color(0xCC323232),
                            Color(0xCC323232),
                            Color(0xCC323232),
                            Color(0xCC323232),
                            Color(0xCC323232),
                            Color(0xCC323232),
                            Color.Black,
                            Color.Black

                        )
                    )
                )
        )
//        Box(
//            modifier= Modifier
//                .fillMaxSize()
//                .background(
//                    Brush.verticalGradient(
//                        colors = listOf(
//                            Color.Black,
////                            Color.Transparent,
//                            Color(0xCC000000),
//                            Color(0xCC000000),
//                            Color(0xCC000000),
////                            Color.Transparent,
//                            Color.Black
//
//                        )
//                    )
//                )
//        )
        Column(
           horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_volver),
                    contentDescription = "",
                    modifier = Modifier
                        .size(50.dp)
                        .padding(5.dp)
                        .clickable { },
                    tint = Color.Cyan
                )
                Text(
                    text = "Peinado",
                    fontSize = 30.sp,
                    color = Color.Cyan,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.weight(1f)
                )

            }
            Column(
                modifier = Modifier.padding(50.dp),

            ) {
                Text(
                    text = "Nombre",
                    fontSize = 18.sp,
                    color = Color(0xff00b9b9),
                    modifier = Modifier.padding(1.dp)
                )
                TextField(

                    value = textPeinad1, onValueChange = { textPeinad1 = it},
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color(0x66D9D9D9),
                        focusedContainerColor = Color(0x66D9D9D9),
                        unfocusedTextColor = Color.Cyan,
                        focusedTextColor = Color.Cyan

                    ),
                    label = {
                        Text(text = "Messy Pomp",
                            color = Color.Cyan,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.fillMaxWidth(),
                            fontSize = 30.sp
                        )
                    }
                )
                Text(
                    text = "Precio",
                    fontSize = 18.sp,
                    color = Color(0xff00b9b9),
                    modifier = Modifier.padding(1.dp)
                )

                TextField(

                    value = textPeinad2, onValueChange = { textPeinad2 = it},
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color(0x66D9D9D9),
                        unfocusedTextColor = Color.Cyan,
                        focusedTextColor = Color.Cyan
                    ),
                    label = {
                        Text(text = "450",
                            color = Color.Cyan,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.fillMaxWidth(),
                            fontSize = 30.sp
                        )
                    },

                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.resource__ ),
                            contentDescription = "",
                            tint = Color.Cyan
                        )
                    },
                )
                Spacer(modifier = Modifier.height(15.dp))

                Box(modifier = Modifier){
                    Column (
                        modifier = Modifier
                            .fillMaxWidth().fillMaxSize(.6f)
                            .background(Color(0x66D9D9D9))
                            ,

                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ){

                        Image(
                            modifier = Modifier.size(100.dp),
                            painter = painterResource(id =R.drawable.ic_archivo_imagen ),
                            contentDescription = ""
                        )
                        Spacer(modifier = Modifier.height(15.dp))
                        Text(
                            modifier = Modifier.padding(15.dp),
                            text = "Seleccionar Foto",
                            fontSize = 30.sp,
                            color = Color(0xff00B9B9)

                        )
                    }

                }


//                Image(
//                    painter = painterResource(id = R.drawable.peinado1),
//                    contentDescription = "",
//                    contentScale = ContentScale.Crop,
//                    modifier = Modifier.fillMaxWidth()
//                )
                Spacer(modifier = Modifier.weight(1f))
//
                Button(
                    onClick = {enabled = false},
                    enabled = enabled,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF153802)
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(70.dp)
                        .background(color = Color(0xFF153802), shape = RoundedCornerShape(5.dp))
                ){
                    Text(
                        text = "Guardar",
                        fontSize = 30.sp,
                        color = Color(0xff00ffff),
                        textAlign = TextAlign.Center

                    )

                }
            }
        }

    }


}
@Composable
fun TextPeinado(){
    Text(
        text = "",
        fontSize = 50.sp,
        color = Color.Cyan,
        textAlign = TextAlign.Center
    )

}



