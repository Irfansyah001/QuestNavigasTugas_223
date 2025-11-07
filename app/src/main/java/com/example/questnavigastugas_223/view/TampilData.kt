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
    )}
