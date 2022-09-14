@OptIn(ExperimentalAnimationApi::class)
@Composable
fun Anime() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        var visible by remember { mutableStateOf(true) }
        val density = LocalDensity.current

        AnimatedVisibility(
            visible = visible,
            enter = slideInHorizontally() + fadeIn() + scaleIn(),
            exit = slideOutHorizontally() + fadeOut() + scaleOut()

        ) {
            Text(text = "A")
        }

        Button(
            onClick = { visible = !visible },
            modifier = Modifier
                .padding(8.dp)
        ) {
            Text(text = "Animate")
        }
    }


}
