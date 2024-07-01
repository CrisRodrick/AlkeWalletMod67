package com.example.alkewalletandroid.Home_page

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.alkewalletandroid.MainViewModel
import com.example.alkewalletandroid.R
import com.example.alkewalletandroid.databinding.FragmentHomePageBinding
import com.example.alkewalletandroid.showToast
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class Fragment_home_page : Fragment() {
    private var _binding: FragmentHomePageBinding? = null
    private val binding get() =  _binding!!

    //private val viewModel: HomePageViewModel by viewModels<HomePageViewModel> ()
    private val viewModel: MainViewModel by viewModels<MainViewModel> ()

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
        val loadingProgressBar = binding.loading
        val balanceTextView = binding.dinero
        val hiTextView = binding.saludo
        val transactionsRecycler = binding.recyclerView
        val adapter = TraansaccionsAdapter()
        transactionsRecycler.adapter= adapter


        transactionsRecycler.addOnScrollListener(object : RecyclerView.OnScrollListener() {
        override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
            super.onScrolled(recyclerView, dx, dy)

            val layoutManager: LinearLayoutManager =
                (recyclerView.layoutManager as LinearLayoutManager?)!!
            val visibleItemCount: Int = layoutManager.childCount
            val totalItemCount: Int = layoutManager.itemCount
            val firstVisibleItemPosition: Int = layoutManager.findFirstVisibleItemPosition()

            if (!viewModel.isLastPage()) {
                if (visibleItemCount + firstVisibleItemPosition >= totalItemCount
                    && firstVisibleItemPosition >= 0
                ) {
                    viewModel.loadTransactions()
                }
            }
        }
        })

        viewModel.profileResult.observe(viewLifecycleOwner, Observer { profileResult ->
            profileResult ?: return@Observer
            loadingProgressBar.visibility = if (profileResult.loading) View.VISIBLE else View.GONE
            profileResult.error?.let {
                showToast(context, it)
            }
            profileResult.success?.let { user ->
                val text = user.name?.let {
                    getString(R.string.home_hi, it)
                } ?: getString(R.string.home_hi_default)
                hiTextView.text = text
            }
        })
        viewModel.transactionsResult.observe(viewLifecycleOwner, Observer { transactionsResult ->
            transactionsResult ?: return@Observer
            loadingProgressBar.visibility =
                if (transactionsResult.loading) View.VISIBLE else View.GONE
            transactionsResult.error?.let {
                showToast(context, it)
            }

        })

        viewModel.balance.observe(viewLifecycleOwner, Observer {
            balanceTextView.text = it.amount

        })


    }






}