@OptIn(ExperimentalAnimationApi::class)
@Composable
fun Anime() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        var visible1 by remember { mutableStateOf(true) }
        var visible2 by remember { mutableStateOf(true) }
        var visible3 by remember { mutableStateOf(true) }
        var visible4 by remember { mutableStateOf(true) }
        var visible5 by remember { mutableStateOf(true) }

        Row() {
            AnimatedVisibility(
                visible = visible1,
                enter = scaleIn(),
                exit = scaleOut(),
                modifier = Modifier.padding(10.dp)

            ) {
                Text(text = "Anime1", Modifier.background(color = Color.Blue).size(50.dp), color = Color.White, textAlign = TextAlign.Center)
            }
            AnimatedVisibility(
                visible = visible2,
                enter = fadeIn(),
                exit = fadeOut(),
                modifier = Modifier.padding(10.dp)

            ) {
                Text(text = "Anime2", Modifier.background(color = Color.Red).size(50.dp), color = Color.White, textAlign = TextAlign.Center)
            }
            AnimatedVisibility(
                visible = visible3,
                enter = expandIn(),
                exit = shrinkOut(),
                modifier = Modifier.padding(10.dp)

            ) {
                Text(text = "Anime3", Modifier.background(color = Color.Green).size(50.dp), color = Color.White, textAlign = TextAlign.Center)
            }
            AnimatedVisibility(
                visible = visible4,
                enter = slideInVertically(),
                exit = slideOutVertically(),
                modifier = Modifier.padding(10.dp)

            ) {
                Text(text = "Anime4", Modifier.background(color = Color.Magenta).size(50.dp), color = Color.White, textAlign = TextAlign.Center)
            }
            AnimatedVisibility(
                visible = visible5,
                enter = slideInHorizontally(),
                exit = slideOutHorizontally(),
                modifier = Modifier.padding(10.dp)

            ) {
                Text(text = "Anime5", Modifier.background(color = Color.Cyan).size(50.dp), color = Color.White, textAlign = TextAlign.Center)
            }
        }

        Button(
            onClick = { visible1 = !visible1 },
            modifier = Modifier
                .padding(8.dp)
        ) {
            Text(text = "Anime1")
        }
        Button(
            onClick = { visible2 = !visible2 },
            modifier = Modifier
                .padding(8.dp)
        ) {
            Text(text = "Anime2")
        }
        Button(
            onClick = { visible3 = !visible3 },
            modifier = Modifier
                .padding(8.dp)
        ) {
            Text(text = "Anime3")
        }
        Button(
            onClick = { visible4 = !visible4 },
            modifier = Modifier
                .padding(8.dp)
        ) {
            Text(text = "Anime4")
        }
        Button(
            onClick = { visible5 = !visible5 },
            modifier = Modifier
                .padding(8.dp)
        ) {
            Text(text = "Anime5")
        }
    }
}
