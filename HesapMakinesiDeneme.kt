package com.ankauniss.calcufriday
/*
Burda deneme amaçlı + butonunu kullanıyorum. Fakat = butonuna tıkladığımda uygulama kapanıyor. Sebebi sanırım aldığım 2. değerde. ilk sayıyı yaıyorum,
+ ya basıyorum, daha sonra 2. sayıyı yazıyorum. sonra = e basıyorum ve uygulama kapanıyor. 2. sayıyı almadan birkaç işlem denedim 0 butonu içerisinde ve çalıştı.
Anladığım kadarıyla 2. sayıyı alamıyorum ya da kullanamıyorum. 
*/
import android.app.AppComponentFactory
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.AppOpsManagerCompat
import com.ankauniss.calcufriday.ui.theme.CalcuFridayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //AppOpsManagerCompat.MODE_ALLOWED
            CalcuFridayTheme {
                // A surface container using the 'background' color from the theme
                // requestedOrientation=ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.onSecondary,
                ) {
                    Sayfa()
                }
            }
        }
    }
}

@Composable
fun Sayfa() {
    /*
    Column(verticalArrangement = Arrangement.Top, modifier = Modifier.padding(60.dp)) {
        val configuration = LocalConfiguration.current
        Icon(painter = painterResource(id = R.drawable.icon),
            contentDescription = "ekranı döndür",
            Modifier.background(Color.White).size(65.dp).clickable(){
                configuration.orientation
                Configuration.ORIENTATION_LANDSCAPE
            })// decorative element)
    }*/
    Column(modifier = Modifier
        .width(IntrinsicSize.Max)
        .padding(10.dp), verticalArrangement = Arrangement.Bottom, horizontalAlignment = Alignment.CenterHorizontally) {
        var txt by remember { mutableStateOf("0")}
        var sonuc by remember { mutableStateOf("")}
        var temp by remember { mutableStateOf("")}
        var operator by remember { mutableStateOf("")}

       // var operator=true
        var lastChar = txt.last().toString()


        OutlinedTextField(
            value = txt,
            onValueChange = {txt=it},
            colors = TextFieldDefaults.textFieldColors(Color.White),
            //textStyle = TextStyle(fontSize = 30.sp),
            textStyle = LocalTextStyle.current.copy(textAlign = TextAlign.End, fontSize = 30.sp)
            // txt = txt.last().toString() // string in son karakterini döndürür
        )
        Row() {

            TextButton(onClick = { txt = "0" },
                modifier = Modifier.border(width = 1.dp, color = Color.White))
            { Text(text = "AC", color = Color.Red, fontWeight = FontWeight.ExtraBold)}

            TextButton(onClick = {
                if (txt.length ==1 ){
                    txt = "0"
                }
                else if(txt.length > 1){
                        txt = (txt.subSequence(0, txt.length-1)).toString()
                }
            }, modifier = Modifier.border(width = 1.dp, color = Color.White))
            { Text(text = "DEL", color = Color.Red, fontWeight = FontWeight.ExtraBold)}

            TextButton(onClick = {
                txt = (Math.sqrt(txt.toDouble())).toString()
            }, modifier = Modifier.border(width = 1.dp, color = Color.White))
            { Text(text = "√¯", color = Color.Red, fontWeight = FontWeight.ExtraBold)}

            TextButton(onClick = {
                    sonuc = (txt.toDouble() / 100).toString()
                    txt = sonuc
            }, modifier = Modifier.border(width = 1.dp, color = Color.White))
            { Text(text = "%", color = Color.Red, fontWeight = FontWeight.ExtraBold)}
        }

        Row() {
            TextButton(onClick = {
                    if(txt == "0" || txt == "") {
                        txt = "7"
                    }else{
                        txt = txt + "7"
                    }
            }, modifier = Modifier.border(width = 1.dp, color = Color.White))
            { Text(text = "7", color = Color.White, fontWeight = FontWeight.ExtraBold)}

            TextButton(onClick = {
                if(txt == "0" || txt == "") {
                    txt = "8"
                }else{
                    txt = txt + "8"
                }
            }, modifier = Modifier.border(width = 1.dp, color = Color.White))
            { Text(text = "8", color = Color.White, fontWeight = FontWeight.ExtraBold)}

            TextButton(onClick = {
                if(txt == "0" || txt == "") {
                    txt = "9"
                }else{
                    txt = txt + "9"
                }
            }, modifier = Modifier.border(width = 1.dp, color = Color.White))
            { Text(text = "9", color = Color.White, fontWeight = FontWeight.ExtraBold)}

            TextButton(onClick = {
                temp = txt
                txt = " "
                operator = "*"
            }, modifier = Modifier.border(width = 1.dp, color = Color.White))
            { Text(text = "*", color = Color.Red, fontWeight = FontWeight.ExtraBold)}
        }

        Row() {
            TextButton(onClick = {
                if(txt == "0" || txt == "") {
                    txt = "4"
                }else{
                    txt = txt + "4"
                }
            }, modifier = Modifier.border(width = 1.dp, color = Color.White))
            { Text(text = "4", color = Color.White, fontWeight = FontWeight.ExtraBold)}

            TextButton(onClick = {
                if(txt == "0" || txt == "") {
                    txt = "5"
                }else{
                    txt = txt + "5"
                }
            }, modifier = Modifier.border(width = 1.dp, color = Color.White))
            { Text(text = "5", color = Color.White, fontWeight = FontWeight.ExtraBold)}

            TextButton(onClick = {
                if(txt == "0" || txt == "") {
                    txt = "6"
                }else{
                    txt = txt + "6"
                }

            }, modifier = Modifier.border(width = 1.dp, color = Color.White))
            { Text(text = "6", color = Color.White, fontWeight = FontWeight.ExtraBold)}

            TextButton(onClick = {
                temp = txt
                txt = " "
                operator = "/"
            }, modifier = Modifier.border(width = 1.dp, color = Color.White))
            { Text(text = "/", color = Color.Red, fontWeight = FontWeight.ExtraBold)}
        }

        Row() {
            TextButton(onClick = {
                if(txt == "0" || txt == "") {
                    txt = "1"
                }else{
                    txt = txt + "1"
                }

            }, modifier = Modifier.border(width = 1.dp, color = Color.White))
            { Text(text = "1", color = Color.White, fontWeight = FontWeight.ExtraBold)}

            TextButton(onClick = {
                if(txt == "0" || txt == "") {
                    txt = "2"
                }else{
                    txt = txt + "2"
                }

            }, modifier = Modifier.border(width = 1.dp, color = Color.White))
            { Text(text = "2", color = Color.White, fontWeight = FontWeight.ExtraBold)}

            TextButton(onClick = {
                if(txt == "0" || txt == "") {
                    txt = "3"
                }else{
                    txt = txt + "3"
                }

            }, modifier = Modifier.border(width = 1.dp, color = Color.White))
            { Text(text = "3", color = Color.White, fontWeight = FontWeight.ExtraBold)}

            TextButton(onClick = {
                temp = txt
                txt = " "
                operator = "-"
            }, modifier = Modifier.border(width = 1.dp, color = Color.White))
            { Text(text = "-", color = Color.Red, fontWeight = FontWeight.ExtraBold)}
        }

        Row() {
            TextButton(onClick = {

            }, modifier = Modifier.border(width = 1.dp, color = Color.White))
            { Text(text = ".", color = Color.Red, fontWeight = FontWeight.ExtraBold)}

            TextButton(onClick = {
                if(txt == "0" || txt == "") {
                    txt = "0"
                }else{
                    txt = txt + "0"
                }

            }, modifier = Modifier.border(width = 1.dp, color = Color.White))
            { Text(text = "0", color = Color.White, fontWeight = FontWeight.ExtraBold)}

            TextButton(onClick = {
                var temp2 = txt.toInt()
                var temp3 = temp.toInt()
                when(operator) {
                    "+" -> {txt = (temp2 + temp3).toString() }
                    "-" -> {txt = "---"}
                    "*" -> {txt = "***"}
                    else -> {txt = "///"}
                    // "+" -> txt = (temp.toInt() + txt.toInt()).toString()
                }
                /*
                    when(operator) {
                        "+" -> {txt = (temp.toInt() + txt.toInt()).toString()}
                        "-" -> {txt = (temp.toInt() - txt.toInt()).toString()}
                        "*" -> {txt = (temp.toInt() * txt.toInt()).toString()}
                        else -> {txt = (temp.toInt() / txt.toInt()).toString()}
                       // "+" -> txt = (temp.toInt() + txt.toInt()).toString()
                    }
                 */

            }, modifier = Modifier.border(width = 1.dp, color = Color.White))
            { Text(text = "=", color = Color.Red, fontWeight = FontWeight.ExtraBold)}

            TextButton(onClick = {
                temp = txt
                txt = " "
                operator = "+"
            }, modifier = Modifier.border(width = 1.dp, color = Color.White))
            { Text(text = "+", color = Color.Red, fontWeight = FontWeight.ExtraBold)}
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.onSecondary
    ) {
        Sayfa()
    }
}
