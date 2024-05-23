package com.example.alkewalletandroid.Splash

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.alkewalletandroid.R
import com.example.alkewalletandroid.databinding.FragmentSplashBinding



class Fragment_splash : Fragment() {

    private var _binding: FragmentSplashBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding= FragmentSplashBinding.inflate(inflater, container, false)
        return  binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //val imageView = binding.imageView

        binding.imageView.setOnClickListener{
           // view.findNavController().navigate(R.id.action_fragment_splash_to_fragment_login_singup)
            view.findNavController().navigate(R.id.action_fragment_splash_to_fragment_login)
        }

        //imageView.setOnClickListener{
        //    findNavController().navigate(R.id.action_fragment_splash_to_fragment_login_singup)
       // }


    }
}