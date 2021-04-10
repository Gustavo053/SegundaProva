package com.example.segundaprova.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.room.Room
import com.example.segundaprova.database.AppDatabase
import com.example.segundaprova.database.Empresa

class HomeFragmentViewModel(application: Application) : AndroidViewModel(application) {
    var lista:LiveData<List<Empresa>> ?= null

    init {
        val db: AppDatabase by lazy {
            Room.databaseBuilder(application.applicationContext,
                AppDatabase::class.java, "Empresa.sqlite")
                .allowMainThreadQueries()
                .build()
        }
        lista = db.empresaDao().listAll()
    }
}