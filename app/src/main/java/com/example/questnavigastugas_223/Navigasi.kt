package com.example.questnavigastugas_223

enum class Navigasi {
    Beranda,
    Formulir,
    Tampil
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
) {
    Scaffold { isiRuang ->
        NavHost(
            navController = navController,
            startDestination = Navigasi.Beranda.name,
            modifier = Modifier.padding(isiRuang)
        ) {