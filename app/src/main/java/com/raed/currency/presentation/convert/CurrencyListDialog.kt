package com.raed.currency.presentation.convert

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.doOnTextChanged
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.raed.currency.R
import com.raed.currency.databinding.DialogCurrencyListBinding
import com.raed.currency.presentation.uimodels.BaseObject
import com.raed.currency.presentation.uimodels.UICurrency


/**
 * Created By Raed Saeed on 22/04/2022
 */
class CurrencyListDialog : BottomSheetDialogFragment() {
    private lateinit var binding: DialogCurrencyListBinding
    private lateinit var func: (currency: UICurrency) -> Unit

    fun newInstance(
        currencyList: List<BaseObject>,
        func: (cur: UICurrency) -> Unit
    ): CurrencyListDialog {
        val args = Bundle()
        args.putParcelableArrayList("currency_list", ArrayList(currencyList))
        val fragment = CurrencyListDialog()
        fragment.arguments = args
        this.func = func
        return fragment
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
            DataBindingUtil.inflate(layoutInflater, R.layout.dialog_currency_list, container, false)

        val adapter = CurrencyAdapter()
        adapter.setOnCurrencyClick { currency, _ ->
            func.invoke(currency)
        }

        binding.rvDialogExchangeList.layoutManager = LinearLayoutManager(requireContext())
        binding.rvDialogExchangeList.adapter = adapter

        val itemList = arguments?.getParcelableArrayList<BaseObject>("currency_list")
        adapter.setItems(itemList)

        binding.etDialogExchangeSearch.doOnTextChanged { text, _, _, _ ->
            val newList = itemList?.filter {
                (it as UICurrency).symbol?.contains(text.toString())!!
            }
            adapter.setItems(newList)
        }

        return binding.root
    }
}