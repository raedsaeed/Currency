package com.raed.currency.presentation.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.raed.currency.data.ViewState
import com.raed.currency.databinding.FragmentListBinding
import com.raed.currency.presentation.convert.CurrencyAdapter
import com.raed.currency.presentation.convert.CurrencyViewModel
import com.raed.currency.presentation.uimodels.BaseObject
import com.raed.currency.presentation.uimodels.UICurrency
import dagger.hilt.android.AndroidEntryPoint


/**
 * Created By Raed Saeed on 22/04/2022
 */

@AndroidEntryPoint
class ExchangeRateFragment : Fragment() {
    private lateinit var binding: FragmentListBinding
    private val viewModel: CurrencyViewModel by viewModels()
    private val currencyList: List<UICurrency> by lazy {
        requireParentFragment().arguments?.getParcelableArrayList(CurrencyDetailsFragment.CURRENCY_LIST)
            ?: emptyList()
    }

    private val baseCurrency: UICurrency? by lazy {
        requireParentFragment().arguments?.getParcelable(CurrencyDetailsFragment.FROM_CURRENCY) as? UICurrency
    }

    private lateinit var adapter: CurrencyAdapter

    companion object {
        val TOP_CURRENCY_LIST = listOf(
            "USD",
            "AED",
            "SAR",
            "BHD",
            "EGP",
            "JOD",
            "OMR",
            "KWD",
            "CAD",
            "EUR",
            "CHF",
            "GBP",
            "KYD"
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentListBinding.inflate(inflater, container, false)

        adapter = CurrencyAdapter()
        binding.rvFragmentList.layoutManager = LinearLayoutManager(requireContext())
        binding.rvFragmentList.adapter = adapter
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.convertedValue.observe(viewLifecycleOwner) {
            populateUI(it)
        }
        viewModel.getExchangeRates(baseCurrency?.symbol.toString(), TOP_CURRENCY_LIST, currencyList)
    }

    @Suppress("UNCHECKED_CAST")
    private fun populateUI(viewState: ViewState) {
        when (viewState) {
            is ViewState.Success<*> -> {
                adapter.setItems(viewState.item as? List<BaseObject>)
            }

            is ViewState.Error -> {
                Snackbar.make(
                    binding.root,
                    viewState.error.message.toString(),
                    Snackbar.LENGTH_SHORT
                ).show()
            }

            else -> {}
        }
    }
}