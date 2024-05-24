package com.example.alkewalletandroid.Profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.alkewalletandroid.Login.LoginViewModel
import com.example.alkewalletandroid.R
import com.example.alkewalletandroid.databinding.FragmentLoginBinding
import com.example.alkewalletandroid.databinding.FragmentProfileBinding


class Fragment_profile : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.cerrar.setOnClickListener {
            findNavController().navigate(R.id.action_fragment_profile_to_fragment_login)

        }
    }


}