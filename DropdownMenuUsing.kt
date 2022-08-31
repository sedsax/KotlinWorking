import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun DropdownMenu() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        var showMenu by remember { mutableStateOf(false) }
        Box{
            Button(onClick = { showMenu = true}) {
                Text(text = "Menu")
            }
            DropdownMenu(expanded =showMenu , onDismissRequest = { showMenu = false }) {
                DropdownMenuItem(onClick = {  }) {
                    Text(text = "Bilgisayar Müh. %100 İng.")
                }
                DropdownMenuItem(onClick = {  }) {
                    Text(text = "Bilgisayar Müh. Türkçe")
                }
                DropdownMenuItem(onClick = {  }) {
                    Text(text = "Biyomedikal")
                }
                DropdownMenuItem(onClick = {  }) {
                    Text(text = "Elektrik Elektronik")
                }

            }
        }
    }
}
