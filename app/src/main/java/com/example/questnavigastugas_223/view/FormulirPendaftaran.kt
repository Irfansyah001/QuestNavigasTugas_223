package com.example.questnavigastugas_223.view

@Composable
fun FormulirPendaftaran(
    onSubmitNav: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    var textNama by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf("") }
    var textJK by remember { mutableStateOf("") }
    var textSP by remember { mutableStateOf("") }

    val gender: List<String> = listOf("Laki-laki", "Perempuan")
    val status: List<String> = listOf("Menikah", "Belum Menikah", "Janda", "Lajang", "Duda")

    Column(
        modifier = modifier.padding(top = 40.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Card(
            modifier = Modifier
                .width(400.dp)
                .height(100.dp),
            colors = CardDefaults.cardColors(containerColor = Color.Black)
        ) {
            Text(
                modifier = Modifier.padding(top = 35.dp, start = 20.dp),
                fontSize = 26.sp,
                color = Color.White,
                text = stringResource(id = R.string.formulir_pendaftaran)
            )
        }

        Card(
            modifier = Modifier
                .padding(10.dp)
                .width(400.dp)
                .height(600.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            border = BorderStroke(5.dp, Color.Black)
        ) {

            Text(
                modifier = Modifier.padding(top = 15.dp, start = 20.dp),
                fontSize = 18.sp,
                color = Color.Black,
                text = stringResource(id = R.string.nama_lengkap)
            )
            OutlinedTextField(
                value = textNama,
                singleLine = true,
                shape = MaterialTheme.shapes.medium,
                modifier = Modifier
                    .padding(horizontal = 20.dp)
                    .width(350.dp),
                label = { Text(text = "Isi Nama Lengkap") },
                onValueChange = { textNama = it }
            )

            Text(
                modifier = Modifier.padding(top = 15.dp, start = 20.dp),
                fontSize = 18.sp,
                color = Color.Black,
                text = stringResource(id = R.string.jenis_kelamin)
            )
            Column {
                gender.forEach { item ->
                    Row(
                        modifier = Modifier
                            .selectable(
                                selected = textJK == item,
                                onClick = { textJK = item }
                            )
                            .height(30.dp)
                            .padding(horizontal = 20.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        RadioButton(
                            selected = textJK == item,
                            onClick = { textJK = item }
                        )
                        Text(item)
                    }
                }
            }

            Text(
                modifier = Modifier.padding(top = 15.dp, start = 20.dp),
                fontSize = 18.sp,
                color = Color.Black,
                text = stringResource(id = R.string.status_perkawinan)
            )
            Column {
                status.forEach { item ->
                    Row(
                        modifier = Modifier
                            .selectable(
                                selected = textSP == item,
                                onClick = { textSP = item }
                            )
                            .height(30.dp)
                            .padding(horizontal = 20.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        RadioButton(
                            selected = textSP == item,
                            onClick = { textSP = item }
                        )
                        Text(item)
                    }
                }
            }
