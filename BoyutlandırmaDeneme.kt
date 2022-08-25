
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Tasarim2() {
        Column(modifier = Modifier.fillMaxSize(1f)){
            Row() {
                Button(onClick = {},
                    modifier = Modifier.fillMaxWidth(0.3f)

                ) {
                    Text(text = "1")
                }
                Button(onClick = {},
                    modifier = Modifier.fillMaxWidth(0.6f)
                ) {
                    Text(text = "3")
                }
            }
            Row() {
                Button(onClick = {},modifier = Modifier.fillMaxWidth(0.3f)
                ) {
                    Text(text = "4")
                }
                Button(onClick = {},modifier = Modifier.fillMaxWidth(0.3f)
                ) {
                    Text(text = "5")
                }
                Button(onClick = {},modifier = Modifier.fillMaxWidth(0.4f)
                ) {
                    Text(text = "6")
                }
            }

        }
    }
