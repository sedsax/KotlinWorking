//Scroll un dikeyde ve yatayda nasıl çalıştığını anlamaya çalışırken kafa karışıklığı olmuş olabilir fakat en iyisi metodları deneyerek öğrenmek

package com.ankauniss.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.ankauniss.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Sayfa()
                }
            }
        }
    }
}

@Composable
fun Sayfa() {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .verticalScroll(state = ScrollState(1)),
           // .scrollable(state = scrollState, orientation = Orientation.Vertical),
       // verticalArrangement = Arrangement.SpaceEvenly ,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val name =  remember { mutableStateOf("")}
       // val nameTV = remember { mutableStateOf("---")}
        val viewModel: SayfaViewModel = viewModel()
        val nameTV = viewModel.sonuc.observeAsState("")

        Row(//horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()
                .padding(20.dp)
                .scrollable(state = scrollState, orientation = Orientation.Horizontal)
                .horizontalScroll(state = ScrollState(1))
            //   .horizontalScroll(state = scrollState)
        ) {
            for (i in 1..15) {
                Button(onClick = { /*TODO*/ }, modifier = Modifier.padding(3.dp)) {
                    Text(text = "kutu")
                }
            }
        }
       // Spacer(modifier = Modifier.padding(10.dp))
        Text(text = nameTV.value, fontSize = 20.sp)
        TextField(
            value = name.value,
            label = { Text(text = "İsim")},
            onValueChange = {name.value = it}
        )
        Button(onClick = {
            viewModel.metod(name.value)
          //  nameTV.value = viewModel.sonuc
        }
        ) {
            Text(text = "Text'te Göster")
        }
        Row(//horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()
                .padding(20.dp)
                .scrollable(state = scrollState, orientation = Orientation.Horizontal)
                .horizontalScroll(state = ScrollState(1))
            //   .horizontalScroll(state = scrollState)
        ) {
            for (i in 1..15) {
                Button(onClick = { /*TODO*/ }, modifier = Modifier.padding(3.dp)) {
                    Text(text = "kutu")
                }
            }
        }
        for (i in 1..15) {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "kutu")
            }
        }
    }

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        Sayfa()
    }
}
