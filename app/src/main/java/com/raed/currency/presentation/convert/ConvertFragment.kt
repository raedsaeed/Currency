package com.raed.currency.presentation.convert

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.google.android.material.snackbar.Snackbar
import com.raed.currency.data.ViewState
import com.raed.currency.databinding.FragmentConvertBinding
import dagger.hilt.android.AndroidEntryPoint


/**
 * Created By Raed Saeed on 22/04/2022
 */
@AndroidEntryPoint
class ConvertFragment : Fragment() {
    private lateinit var binding: FragmentConvertBinding
    private val currencyViewModel: CurrencyViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentConvertBinding.inflate(inflater, container, false)

        binding.btnFragmentConvertSwap.setOnClickListener {

        }

        currencyViewModel.currenciesValue.observe(viewLifecycleOwner) {
            populateUI(viewState = it)
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fetchData()
    }

    private fun fetchData() {
        currencyViewModel.getUpdatedCurrencies()
    }

    private fun populateUI(viewState: ViewState) {
        binding.pbFragmentContainerLoading.isVisible = viewState is ViewState.Loading
        binding.clFragmentConvertContainer.isVisible = viewState !is ViewState.Loading

        when (viewState) {
            is ViewState.Success<*> -> {

            }

            is ViewState.Error -> {
                Snackbar.make(
                    binding.clFragmentConvertContainer,
                    viewState.error.message.toString(),
                    Snackbar.LENGTH_SHORT
                ).show()
            }

            else -> {}
        }
    }
}