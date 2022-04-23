package com.raed.currency.presentation.convert

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.google.android.material.snackbar.Snackbar
import com.raed.currency.data.ViewState
import com.raed.currency.databinding.FragmentConvertBinding
import com.raed.currency.presentation.uimodels.BaseObject
import com.raed.currency.presentation.uimodels.UICurrency
import com.raed.currency.utils.CurrencyUtils
import com.raed.currency.utils.format
import com.raed.currency.utils.toFloatOrZero
import dagger.hilt.android.AndroidEntryPoint

/**
 * Created By Raed Saeed on 22/04/2022
 */
@AndroidEntryPoint
class ConvertFragment : Fragment() {
    private lateinit var binding: FragmentConvertBinding
    private val currencyViewModel: CurrencyViewModel by viewModels()
    private var currencyList: List<BaseObject>? = null

    private var usdCurrency: UICurrency? = null
    private var fromCurrency: UICurrency? = null
    private var quoteCurrency: UICurrency? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentConvertBinding.inflate(inflater, container, false)

        currencyViewModel.currenciesValue.observe(viewLifecycleOwner) {
            populateUI(it)
        }

        binding.btnFragmentConvertSwap.setOnClickListener {
            swapCurrency()
        }
        binding.etFragmentConvertBaseAmount.doOnTextChanged { text, _, _, _ ->
            findExchangeRate(text)
        }

        binding.tvFragmentConvertBase.setOnClickListener {
            val dialog = CurrencyListDialog.newInstance(currencyList)
            dialog.setCurrencySelectListener {
                fromCurrency = it
                populateCurrency("1", fromCurrency, quoteCurrency)
            }
            dialog.show(childFragmentManager, null)
        }

        binding.tvFragmentConvertQuote.setOnClickListener {
            val dialog = CurrencyListDialog.newInstance(currencyList)
            dialog.setCurrencySelectListener {
                quoteCurrency = it
                populateCurrency("1", fromCurrency, quoteCurrency)
            }
            dialog.show(childFragmentManager, null)
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

    @Suppress("UNCHECKED_CAST")
    private fun populateUI(viewState: ViewState) {
        binding.pbFragmentContainerLoading.isVisible = viewState is ViewState.Loading
        binding.clFragmentConvertContainer.isVisible =
            viewState !is ViewState.Loading && viewState !is ViewState.Error

        when (viewState) {
            is ViewState.Success<*> -> {
                populateUI(viewState.item as List<UICurrency>)
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

    private fun populateUI(currencyList: List<BaseObject>) {
        this.currencyList = currencyList
        usdCurrency = currencyList.first { (it as UICurrency).symbol == "USD" } as? UICurrency
        fromCurrency = usdCurrency
        quoteCurrency = currencyList.first { (it as UICurrency).symbol == "EGP" } as? UICurrency
        populateCurrency("1", fromCurrency, quoteCurrency)
    }

    private fun populateCurrency(amount : String, fromCurrency: UICurrency?, quoteCurrency: UICurrency?) {
        binding.tvFragmentConvertBase.text = fromCurrency?.symbol
        binding.tvFragmentConvertQuote.text = quoteCurrency?.symbol
        binding.etFragmentConvertBaseAmount.setText(amount)
    }


    private fun swapCurrency() {
        val tempCurrency = fromCurrency
        fromCurrency = quoteCurrency
        quoteCurrency = tempCurrency
        populateCurrency(binding.etFragmentConvertBaseAmount.text.toString(), fromCurrency, quoteCurrency)
    }

    private fun findExchangeRate(text: CharSequence?) {
        val base = text?.toString().toFloatOrZero()
        if (base > 0) {
            binding.tvFragmentConvertQuoteValue.text =
                getConvertedValue(base, usdCurrency, fromCurrency, quoteCurrency)
        } else {
            binding.tvFragmentConvertQuoteValue.text = "0"
        }
    }

    private fun getConvertedValue(
        base: Float,
        usdCurrency: UICurrency?,
        fromCurrency: UICurrency?,
        quoteCurrency: UICurrency?
    ): String {
        return CurrencyUtils.convertAssetToAnother(
            base,
            usdCurrency,
            fromCurrency,
            quoteCurrency
        ).format()
    }
}

