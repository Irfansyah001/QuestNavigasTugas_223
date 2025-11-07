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

            Text(
                text = stringResource(R.string.selamat_datang),
                fontSize = 32.sp,
                fontFamily = FontFamily.Monospace,
                fontWeight = FontWeight.SemiBold
            )

            Spacer(Modifier.height(100.dp))

            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = null,
                modifier = Modifier.size(250.dp)
            )

            Spacer(Modifier.height(140.dp))