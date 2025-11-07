package com.example.questnavigastugas_223.view

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilData(
    onKeBeranda: () -> Unit = {},
    onKeFormulir: () -> Unit = {},
    modifier: Modifier = Modifier
) {

    val items = listOf(
        Pair(stringResource(id = R.string.nama_lengkap), "Irfansyah Ridho Aninda"),
        Pair(stringResource(id = R.string.jenis_kelamin), "Laki-laki"),
        Pair(stringResource(id = R.string.status_perkawinan), "Belum Menikah"),
        Pair(stringResource(id = R.string.alamat), "Yogyakarta")
    )

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = stringResource(id = R.string.list_daftar_peserta), color = MaterialTheme.colorScheme.onPrimary) },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary
                )
            )
        }
