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

/*

LazyColumn {
                items(
                    count = list.count(), // burada bir listenin uzunluğunu yazacak olursak liste.count diyebiliriz
                    itemContent = {
                    Card(modifier = Modifier
                        .padding(all = 5.dp)
                        .fillMaxWidth()) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(all = 10.dp)
                        ) {
                            Text(text = list[it]) // veritabanındaki en son verinin bilgilerini veriyor
                        }
                    }
                })
        }

*/
