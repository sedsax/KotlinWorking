@Composable
fun Animasyon() {
    var sizeState by remember { mutableStateOf(150.dp)}
    
   Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
       Box(modifier = Modifier
           .size(sizeState)
           .background(Color.Green),
           contentAlignment = Alignment.Center) {
           Button(onClick = {
               sizeState += 50.dp
           }) {
               Text(text = "Büyüt")
           }
       }

       Button(onClick = {
           sizeState -= 50.dp
       }) {
           Text(text = "Küçült")
       }
   }

}
