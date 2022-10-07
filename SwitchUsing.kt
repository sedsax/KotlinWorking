package com.ankauniss.workingdesign

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SwitchUsing() {
    val switchDurum = remember { mutableStateOf(false)}
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.padding(15.dp))
        Text(text = "Jetpack Compose ile Switch\nözelliği nasıl kullanılır bunu gördük.\nVe Aynı zamanda butonlarla\nda kontrolü sağladık.\n",
            textAlign = TextAlign.Center,
            color = Color.Blue,
            fontWeight = FontWeight.ExtraBold,
            fontSize = 20.sp
        )
     //   val image: Painter = painterResource(id = R.drawable.sss)
        Image(
            painter = painterResource(id = R.drawable.sss),
            contentDescription = "Switch Kullanımı",
            modifier = Modifier.size(380.dp)
        )
        Switch(checked = switchDurum.value,
            onCheckedChange = {
                switchDurum.value = it
            },
            colors = SwitchDefaults.colors(
               // checkedTrackAlpha = Color.Red, // hata veriyor sebebini anlamadım: Track ile Thumb ın burdaki farkı ne renk tanımlaması olarak
                checkedThumbColor = Color.Green,
              //  uncheckedTrackAlpha = Color.Gray,
                uncheckedThumbColor = Color.Red
            )
        )
        Row (
            horizontalArrangement = Arrangement.SpaceEvenly,
            //verticalAlignment = Alignment.Top // Colum içinde olunca Row un kendi içinde düzenleme yapamıyor muyum anlamadım etki etmiyor yazdıklarım 
                ){
            Button(onClick = {
                switchDurum.value = true
            },
                Modifier.size(150.dp, 50.dp),
                colors = ButtonDefaults.buttonColors(Color.Green)
            ) {
                Text(text = "Aç")
            }
            Spacer(modifier = Modifier.padding(15.dp))
            Button(onClick = {
                switchDurum.value = false
            },
                Modifier.size(150.dp, 50.dp),
                colors = ButtonDefaults.buttonColors(Color.Red)
            ) {
                Text(text = "Kapat")
            }
        }
    }
}
