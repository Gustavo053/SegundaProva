package com.example.segundaprova.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Empresa::class], version = 1)
abstract class AppDatabase() : RoomDatabase() {
    abstract fun empresaDao(): EmpresaDAO
}