@Composable
fun LazyColumnSample() {
    LazyColumn {
        item {
            Card(modifier = Modifier
                .padding(all = 5.dp)
                .fillMaxWidth()) {
                Row(
                    verticalAlignment = Alignment.Top,
                    modifier = Modifier.padding(all = 10.dp)
                ) {
                    Text(text = "Örnek LazyColumn satırı") // veritabanındaki en son verinin bilgilerini veriyor
                }
            }
        }
    }
}
