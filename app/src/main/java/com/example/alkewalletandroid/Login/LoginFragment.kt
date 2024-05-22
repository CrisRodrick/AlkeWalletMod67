package com.example.alkewalletandroid.Login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.alkewalletandroid.R
import com.example.alkewalletandroid.databinding.FragmentLoginBinding



class LoginFragment : Fragment() {

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

        val emailEditText = binding.txtEmail.editableText!!
        val passwordEditText = binding.contra.editableText!!
        val loginButton = binding.button3
        val splashText = binding.txt81.text!!
        val singupText = binding.txt45.text!!


        viewModel.loginModel.observe(viewLifecycleOwner,
            Observer { loginModel ->
                loginModel?: return@Observer
                loginModel.success

        })

        binding.button3.setOnClickListener{
            findNavController().navigate(R.id.action_fragment_login_to_fragment_home_page)
        }
        binding.txt81.setOnClickListener{
            findNavController().navigate(R.id.action_fragment_login_to_fragment_login_singup)
        }
        binding.txt45.setOnClickListener{
            findNavController().navigate(R.id.action_fragment_login_to_fragment_singup)
        }

    }
}