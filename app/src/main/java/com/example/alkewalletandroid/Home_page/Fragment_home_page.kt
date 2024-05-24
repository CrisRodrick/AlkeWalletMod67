package com.example.alkewalletandroid.Home_page

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.alkewalletandroid.R
import com.example.alkewalletandroid.databinding.FragmentHomePageBinding
import java.util.zip.Inflater


class Fragment_home_page : Fragment() {
    private var _binding: FragmentHomePageBinding? = null
    private val binding = _binding!!

    private val viewModel: HomePageViewModel by viewModels<HomePageViewModel> ()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding= FragmentHomePageBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button5.setOnClickListener{
            findNavController().navigate(R.id.action_fragment_home_page_to_fragment_send_money)
        }
        binding.button6.setOnClickListener{
            findNavController().navigate(R.id.action_fragment_home_page_to_fragment_request_money)
        }
        binding.cara3.setOnClickListener{
            findNavController().navigate(R.id.action_fragment_home_page_to_fragment_profile)
        }
    }


}