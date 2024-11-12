package com.example.laik.widget

import android.app.Activity
import android.text.Layout
import android.text.Layout.Alignment.ALIGN_CENTER
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.ArrowForwardIos
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.laik.R


@Composable
@Preview
fun PeinadoDialogPreview(){
    PeinadoDialog()
}

@Composable
fun PeinadoDialog(){
    Dialog(
        onDismissRequest = { /*TODO*/ },

        properties = DialogProperties(usePlatformDefaultWidth = false)

        ) {
        Box(
            modifier = Modifier.fillMaxSize()
        ){
            Column(
                modifier = Modifier.fillMaxSize().background(Color.White)
            ) {
                Row(
                    modifier = Modifier.weight(1f).background(Color.Cyan),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Icon(
                        imageVector = Icons.Default.ArrowBackIosNew,
                        contentDescription = "",
                        modifier = Modifier
                            .size(60.dp)
                            .padding(0.dp),
                        tint = Color.LightGray




                    )

                    Image(painter = painterResource(id = R.drawable.peinado1),
                        contentDescription = "",
                        contentScale = ContentScale.Fit,
                        modifier = Modifier.fillMaxSize().weight(1f),

                    )

                    Icon(
                        imageVector = Icons.Default.ArrowForwardIos,
                        contentDescription = "",
                        modifier = Modifier.size(60.dp).padding(0.dp),
                        tint = Color.LightGray

                    )

                }
                // Ajustamos el Spacer para que no ocupe todo el espacio restante
                //Spacer(modifier = Modifier.weight(1f))  // Define un tamaño más específico para el Spacer

                // Este Image se verá ahora ya que el Spacer no lo empuja fuera de vista
                val activity = LocalContext.current as Activity

                Icon(
                    imageVector = Icons.Default.Close,
                    contentDescription = "back",
                    modifier = Modifier.fillMaxWidth().size(50.dp).clickable {activity.finish()  },
                    tint = Color.Red
                )
            }

        }



    }
}