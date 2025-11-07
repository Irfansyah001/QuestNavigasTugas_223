package com.example.questnavigastugas_223.view

@Composable
fun Beranda(
    onMulaiClick: () -> Unit = {},
    modifier: Modifier = Modifier,
    tombolTextRes: Int = R.string.mulai_button
) {
    Surface(modifier = modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(Modifier.height(100.dp))