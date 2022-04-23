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
    private lateinit var currencyListener: (currency: UICurrency) -> Unit

    fun setCurrencySelectListener(currencyListener: (cur: UICurrency) -> Unit) {
        this.currencyListener = currencyListener
    }

    companion object {
        fun newInstance(currencyList: List<BaseObject>?): CurrencyListDialog {
            val args = Bundle()
            args.putParcelableArrayList(
                CURRENCY_LIST_KEY,
                ArrayList(currencyList?.toMutableList() ?: emptyList())
            )
            val fragment = CurrencyListDialog()
            fragment.arguments = args
            return fragment
        }

        private const val CURRENCY_LIST_KEY = "currency_list"
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
            currencyListener.invoke(currency)
            dismiss()
        }

        binding.rvDialogExchangeList.layoutManager = LinearLayoutManager(requireContext())
        binding.rvDialogExchangeList.adapter = adapter

        val itemList = arguments?.getParcelableArrayList<BaseObject>(CURRENCY_LIST_KEY)
        adapter.setItems(itemList)

        binding.etDialogExchangeSearch.doOnTextChanged { text, _, _, _ ->
            val newList = itemList?.filter {
                (it as UICurrency).symbol?.contains(text.toString(), true)!!
            }
            adapter.setItems(newList)
        }

        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.root.layoutParams = getDialogLayoutParams()
    }

    private fun getDialogLayoutParams(): ViewGroup.LayoutParams {
        val height = getHeight()
        val layoutParams: ViewGroup.LayoutParams = binding.clDialogCurrencyList.layoutParams
        layoutParams.height = height
        return layoutParams
    }

    private fun getHeight(): Int {
        return requireActivity().window?.decorView?.height?.div(2)!!
    }
}