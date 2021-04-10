package com.example.segundaprova.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.segundaprova.R
import com.example.segundaprova.database.Empresa

class EmpresaAdapter() : RecyclerView.Adapter<EmpresaHolder>() {
    var empresas: List<Empresa> = ArrayList();

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmpresaHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.empresa_item, parent, false)

        return EmpresaHolder(view, 1)
    }

    override fun onBindViewHolder(holder: EmpresaHolder, position: Int) {
        val empresa = empresas[position]
        holder.textNomeEmpresa.text = empresa.nome
        holder.id = empresa.id.toLong()
    }

    override fun getItemCount(): Int {
        return empresas.size
    }
}