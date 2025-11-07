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
            composable(route = Navigasi.Beranda.name) {
                Beranda(
                    onMulaiClick = {
                        navController.navigate(Navigasi.Tampil.name)
                    }
                )
            }

            composable(route = Navigasi.Tampil.name) {
                TampilData(
                    onKeBeranda = { backToBeranda(navController) },
                    onKeFormulir = { navController.navigate(Navigasi.Formulir.name) }
                )
            }

            composable(route = Navigasi.Formulir.name) {
                FormulirPendaftaran(
                    onSubmitNav = {
                        navController.navigate(Navigasi.Tampil.name)
                    }
                )
            }
        }
    }
}