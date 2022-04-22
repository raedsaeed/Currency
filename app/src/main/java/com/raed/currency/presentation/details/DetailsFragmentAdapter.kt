package com.raed.currency.presentation.details

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.raed.currency.R


/**
 * Created By Raed Saeed on 22/04/2022
 */
class DetailsFragmentAdapter(private val fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 2
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> HistoryFragment()
            else -> ExchangeRateFragment()
        }
    }

    fun getTitle(position: Int): String {
        if (position == 0) {
            return fragment.getString(R.string.historical_info)
        } else {
            return fragment.getString(R.string.exchange_rates)
        }
    }
}