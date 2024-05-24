package com.example.alkewalletandroid.Request_money

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.example.alkewalletandroid.R
import com.example.alkewalletandroid.databinding.FragmentRequestMoneyBinding



class Fragment_request_money : Fragment() {
    private var _binding: FragmentRequestMoneyBinding? = null
    private val binding get() = _binding!!

    private val viewModel: RequestViewModel by viewModels<RequestViewModel> ()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentRequestMoneyBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            button9.setOnClickListener {
                val cantidad = hint4.text.toString()
                val notas = hint5.text.toString()
                viewModel.validar(cantidad, notas)
            }
        }
        viewModel.validarIngresos.observe(viewLifecycleOwner, Observer { valido ->
            if (valido){
                Toast.makeText(requireContext(), "Ingreso Válido", Toast.LENGTH_SHORT).show()
                findNavController().navigate(R.id.action_fragment_request_money_to_fragment_home_page)
            }else{
                Toast.makeText(requireContext(), "Ingresar monto y nota", Toast.LENGTH_SHORT).show()
            }


        })
        binding.flecha.setOnClickListener{
            findNavController().navigate(R.id.action_fragment_request_money_to_fragment_home_page)
        }

    }

}