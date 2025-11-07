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