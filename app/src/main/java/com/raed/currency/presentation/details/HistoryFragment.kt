package com.raed.currency.presentation.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
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
class HistoryFragment : Fragment() {
    private lateinit var binding: FragmentListBinding
    private val viewModel: CurrencyViewModel by viewModels()

    private val baseCurrency: UICurrency? by lazy {
        requireParentFragment().arguments?.getParcelable(CurrencyDetailsFragment.FROM_CURRENCY) as? UICurrency
    }

    private lateinit var adapter: CurrencyAdapter
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
        viewModel.historicalValue.observe(viewLifecycleOwner) {
            populateUI(it)
        }
        viewModel.getHistoricalInfo(baseCurrency?.symbol.toString())
    }

    @Suppress("UNCHECKED_CAST")
    private fun populateUI(viewState: ViewState) {
        binding.pbFragmentListLoading.isVisible = viewState is ViewState.Loading
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

            else -> {
                binding.pbFragmentListLoading.isVisible = true
            }
        }
    }
}