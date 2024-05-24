package com.example.alkewalletandroid.Singup

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
import com.example.alkewalletandroid.databinding.FragmentLoginBinding
import com.example.alkewalletandroid.databinding.FragmentSingupBinding



class SingupFragment : Fragment() {
    private var _binding: FragmentSingupBinding? = null
    private val binding get() = _binding!!
    private val viewModel: SingupViewModel by viewModels<SingupViewModel> ()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentSingupBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            button3.setOnClickListener {
                val nombre = editTextText.text.toString()
                val apellido = editTextText2.text.toString()
                val email = txtEmail.text.toString()
                val contrasena = contra.text.toString()
                val recontrasena = recontra.text.toString()
                viewModel.validar(nombre, apellido, email, contrasena, recontrasena)
            }
        }


        viewModel.validarUsuario.observe(viewLifecycleOwner, Observer { valido ->
            if (valido){
                Toast.makeText(requireContext(), "Ingrese Login", Toast.LENGTH_SHORT).show()
                findNavController().navigate(R.id.action_singupFragment_to_fragment_login)
            }else{
                Toast.makeText(requireContext(), "Usuario no válido", Toast.LENGTH_SHORT).show()
            }

        })
        binding.txt45.setOnClickListener{
           findNavController().navigate(R.id.action_singupFragment_to_fragment_login)
        }
    }
}