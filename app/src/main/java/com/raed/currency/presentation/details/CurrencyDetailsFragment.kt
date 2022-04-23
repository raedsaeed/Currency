package com.raed.currency.presentation.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import com.raed.currency.databinding.FragmentCurrencyDetailsBinding
import dagger.hilt.android.AndroidEntryPoint


/**
 * Created By Raed Saeed on 22/04/2022
 */
@AndroidEntryPoint
class CurrencyDetailsFragment : Fragment() {
    private lateinit var binding: FragmentCurrencyDetailsBinding
    private lateinit var fragmentAdapter: DetailsFragmentAdapter

    companion object {
        const val CURRENCY_LIST = "currency_list"
        const val USD_CURRENCY = "usd_currency"
        const val FROM_CURRENCY = "from_currency"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCurrencyDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        fragmentAdapter = DetailsFragmentAdapter(
            this,
            arguments?.getParcelable(FROM_CURRENCY)
        )
        binding.vpPager.adapter = fragmentAdapter

        TabLayoutMediator(binding.tabLayout, binding.vpPager) { tab, position ->
            tab.text = fragmentAdapter.getTitle(position)
        }.attach()
    }

}