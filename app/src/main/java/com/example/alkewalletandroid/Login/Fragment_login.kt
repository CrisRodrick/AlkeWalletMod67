package com.example.alkewalletandroid.Login

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



class Fragment_login : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    private val viewModel: LoginViewModel by viewModels<LoginViewModel> ()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.apply {
            button3.setOnClickListener {
                val email = txtEmail.text.toString()
                val contrasena = contra.text.toString()
                viewModel.validar(email, contrasena)
            }
        }

        viewModel.validarUsuario.observe(viewLifecycleOwner, Observer { valido ->
            if (valido){
                Toast.makeText(requireContext(), "Sesión iniciada", Toast.LENGTH_SHORT).show()
                findNavController().navigate(R.id.action_fragment_login_to_fragment_home_page)
            }else{
                Toast.makeText(requireContext(), "Usuario no válido", Toast.LENGTH_SHORT).show()
            }

        })

        binding.txt45.setOnClickListener{
          findNavController().navigate(R.id.action_fragment_login_to_singupFragment)
        }

    }
}