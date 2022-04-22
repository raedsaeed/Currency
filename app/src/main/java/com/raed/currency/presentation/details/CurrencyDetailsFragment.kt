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

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCurrencyDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        fragmentAdapter = DetailsFragmentAdapter(this)
        binding.vpPager.adapter = fragmentAdapter

        TabLayoutMediator(binding.tabLayout, binding.vpPager) { tab, position ->
            tab.text = fragmentAdapter.getTitle(position)
        }.attach()
    }

}