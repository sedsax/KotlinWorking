@Composable
fun Animasyon() {
    var sizeState by remember { mutableStateOf(150.dp)}
    val size by animateDpAsState(
        targetValue = sizeState,
   /*     spring(
            Spring.DampingRatioMediumBouncy
        )*/
        tween(
            durationMillis = 3000,
            delayMillis = 300,
            easing = LinearOutSlowInEasing
        )
    )
   Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
       Box(modifier = Modifier
           .size(size)
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
