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
