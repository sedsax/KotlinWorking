// Ben aşağıdaki sayfadan yararlandım fakat bire bir aynısını yazdığımda ekran kaydırma özelliği çalışmadı => Modifier.scrollable(state = scrollState)
// https://www.jetpackcompose.app/What-is-the-equivalent-of-ScrollView-in-Jetpack-Compose

/* Daha sonra kodda "rememberScrollState()" metodunun üstünde durdum ve aşağıdaki tanımı gördüm. Siz de dikkat etmişsinizdir: 
"Modifier.verticalScroll or Modifier.horizontalScroll"

Create and remember the ScrollState based on the currently appropriate scroll configuration to allow changing scroll position or observing scroll behavior.
Learn how to control the state of Modifier.verticalScroll or Modifier.horizontalScroll:

Bunu görünce bir de böyle deneyeyim dedim ve bu kez emülatörü çalıştırdığımda scroll özelliği aktifti. Birazdan;
"Modifier.scrollable(state = scrollState, orientation = Orientation.Vertical)" satırını araştıracağım. Artık kullanılmıyor mu, başka amaçla mı kullanılıyor yoksa ben mi 
yanlış kullandım onu öğreneceğim. Hatta elim değmişken bir de "Row" ekleyip "Modifier.horizontalScroll" u da deneyebilirim.

Evet, bu haliyle ekranda 25 tane alt alta buton göreceksiniz ve alttaki butonları görebilmek için ekranı kaydırabileceksiniz.
*/

@Composable
fun Sayfa() {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(state = scrollState),
           // .scrollable(state = scrollState, orientation = Orientation.Vertical),
       // verticalArrangement = Arrangement.SpaceEvenly ,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
      for (i in 1..25) {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "denemeeeeee")
            }
        }
    }
