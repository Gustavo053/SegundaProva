package com.example.segundaprova.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import com.example.segundaprova.R
import com.example.segundaprova.databinding.FragmentDetalhesBinding
import com.example.segundaprova.viewModel.CadastraFragmenViewModel
import com.example.segundaprova.viewModel.DetalhesFragmentViewModel

class DetalhesFragment : Fragment() {
    lateinit var binding: FragmentDetalhesBinding
    lateinit var viewModel: DetalhesFragmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_detalhes, container, false)
        viewModel = ViewModelProvider(this).get(DetalhesFragmentViewModel::class.java)

        val args: DetalhesFragmentArgs by navArgs()

        var empresa = viewModel.findById(args.id)

        binding.nomeInfo.setText(empresa.nome)
        binding.cnpjInfo.setText(empresa.nome)
        binding.enderecoInfo.setText(empresa.endereco)
        binding.cepInfo.setText((empresa.cep))
        binding.razaoSocialInfo.setText(empresa.razaoSocial)
        binding.qtdFuncionariosInfo.setText(empresa.qtdFuncionario.toString())

        // Inflate the layout for this fragment
        return binding.root
    }
}