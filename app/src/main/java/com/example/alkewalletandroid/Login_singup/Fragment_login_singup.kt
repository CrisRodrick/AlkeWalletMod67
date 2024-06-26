package com.example.alkewalletandroid.Login_singup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.example.alkewalletandroid.R
import com.example.alkewalletandroid.databinding.FragmentLoginSingupBinding


class Fragment_login_singup : Fragment() {
    private var _binding: FragmentLoginSingupBinding? = null
    private val binding get() = _binding!!
    private val viewModel: ViewModel_login_singup by viewModels<ViewModel_login_singup> ()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        _binding= FragmentLoginSingupBinding.inflate(inflater, container, false)
        return  binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button1.setOnClickListener{
            findNavController().navigate(R.id.action_fragment_login_singup_to_singupFragment)

        }
        binding.txt2.setOnClickListener{
            findNavController().navigate(R.id.action_fragment_login_singup_to_fragment_login)
        }


    }


}