Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        val context = LocalContext.current
        Toast.makeText(context, "Bölüm ya da numara bilginiz hatalı!", Toast.LENGTH_LONG).show()
}
