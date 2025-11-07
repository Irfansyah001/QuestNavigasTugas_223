package com.example.questnavigastugas_223

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.questnavigastugas_223.view.Beranda
import com.example.questnavigastugas_223.view.FormulirPendaftaran
import com.example.questnavigastugas_223.view.TampilData

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

private fun backToBeranda(navController: NavHostController) {
    navController.popBackStack(Navigasi.Beranda.name, inclusive = false)
}