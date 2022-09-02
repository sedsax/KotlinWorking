import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun DinamikDropdownMenu() {

    val bolumListe = listOf("               ","Bilgisayar Müh", "Biyomedikal Müh","Kimya Müh","Fizik Müh",
        "Elektrik-Elektronik Müh","Yapay Zeka ve Veri Müh","Yazılım Müh","Gıda Müh",
        "Jeoloji Müh","Jeofizik Müh","İnşaat Müh","Enerji Sistemleri Müh")

    var acilisKontrol by remember { mutableStateOf(false)}
    var secilenIndeks by remember { mutableStateOf(0)}

    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Box{
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .size(250.dp, 50.dp)
                    .clickable(onClick = {
                        acilisKontrol = true // satıra tıklanınca dropdown menu açılması tetikleriz
                    })
            ) {

                Text(text = bolumListe[secilenIndeks]) //seçilen indeks text içinde görme
                Image(painter = painterResource(id = R.drawable.dropdown), contentDescription = "Dropdown Menu Icon" )
            }
            
            DropdownMenu(expanded = acilisKontrol, //Dropdown açılışını tetikleme
                onDismissRequest = { acilisKontrol = false}, //Dropdown Menu kapatılır
            ) {
                bolumListe.forEachIndexed {index, bolum ->
                    //Liste içeriğini döngü ile alıyoruz ve liste içeriği kadar DropdownMenuItem oluşturuyoruz
                    DropdownMenuItem(onClick = { //Her bir item a tıklanma
                        secilenIndeks = index
                        acilisKontrol = false
                    }) {
                        Text(text = bolum)
                    }
                }

            }
        }

    }
}
