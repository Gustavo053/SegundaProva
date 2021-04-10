package com.example.segundaprova.adapters

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.segundaprova.R

class EmpresaHolder(v: View, idRecevied: Long) : RecyclerView.ViewHolder(v) {
    var id: Long
    var textNomeEmpresa: TextView

    init {
        textNomeEmpresa = v.findViewById(R.id.nomeEmpresa)
        id = idRecevied
    }
}