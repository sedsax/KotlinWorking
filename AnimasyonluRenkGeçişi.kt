@Composable
fun Animasyon() {
    var sizeState by remember { mutableStateOf(150.dp)}
    val size by animateDpAsState(
        targetValue = sizeState,
        spring(
            Spring.DampingRatioMediumBouncy
        )
    )
    val infiniteTransition = rememberInfiniteTransition()
    val color by infiniteTransition.animateColor(
        initialValue = Color.Blue,
        targetValue = Color.Magenta,
        animationSpec = infiniteRepeatable(
            tween(durationMillis = 2000),
            repeatMode = RepeatMode.Reverse
        )
    )
   Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
       Box(modifier = Modifier
           .size(size)
           .background(color),
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
