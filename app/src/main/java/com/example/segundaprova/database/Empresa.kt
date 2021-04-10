package com.example.segundaprova.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Empresa(
    var nome: String,
    var cnpj: String,
    var endereco: String,
    var cep: String,
    var razaoSocial: String,
    var qtdFuncionario: Int
) {
    @PrimaryKey(autoGenerate = true)
    var id = 0
}
