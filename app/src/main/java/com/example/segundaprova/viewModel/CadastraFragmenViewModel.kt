package com.example.segundaprova.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.room.Room
import com.example.segundaprova.database.AppDatabase
import com.example.segundaprova.database.Empresa

class CadastraFragmenViewModel(application: Application) : AndroidViewModel(application) {

        val db: AppDatabase by lazy {
            Room.databaseBuilder(application.applicationContext,
                AppDatabase::class.java, "Empresa.sqlite")
                .allowMainThreadQueries()
                .build()
        }

    fun cadastra(empresa: Empresa) {
        db.empresaDao().inserir(empresa)
    }
}