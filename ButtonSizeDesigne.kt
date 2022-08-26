package com.ankauniss.calcufriday

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.textInputServiceFactory
import androidx.compose.ui.unit.dp

@Composable
fun Tasarim() {
    Surface {
        Column(modifier = Modifier.fillMaxSize(),
               horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row() {
                Button(onClick = {},
                    modifier = Modifier.size(width = 100.dp,height = 60.dp).padding(3.dp)
                ) {
                    Text(text = "1", color = Color.White)
                }
                Button(onClick = { },
                    modifier = Modifier.size(width = 100.dp,height = 60.dp).padding(3.dp)
                ) {
                    Text(text = "2", color = Color.White)
                }
                Button(onClick = { },
                    modifier = Modifier.size(width = 100.dp,height = 60.dp).padding(3.dp)
                ) {
                    Text(text = "3", color = Color.White)
                }
            }
            Row() {
                Button(onClick = { },
                    modifier = Modifier.size(width = 100.dp,height = 60.dp).padding(3.dp)
                ) {
                    Text(text = "4", color = Color.White)
                }
                Button(onClick = { },
                    modifier = Modifier.size(width = 200.dp,height = 60.dp).padding(3.dp)
                ) {
                    Text(text = "5", color = Color.White)
                }
            }

        }
    }

}

/*
--------  --------  --------
|      |  |      |  |      |
--------  --------  --------

--------  ------------------
|      |  |                |
--------  ------------------

*/
