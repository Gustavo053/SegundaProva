package com.example.segundaprova.database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface EmpresaDAO {
    @Insert
    fun inserir(empresa: Empresa): Long

    @Delete
    fun deletar(empresa: Empresa): Int

    @Update
    fun atualizar(empresa: Empresa)

    @Query("SELECT * FROM Empresa")
    fun listAll(): LiveData<List<Empresa>>

    @Query("SELECT * FROM Empresa WHERE id = :id")
    fun findById(id: Long): Empresa
}