package com.raed.currency.presentation.details

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.raed.currency.R
import com.raed.currency.presentation.uimodels.UICurrency


/**
 * Created By Raed Saeed on 22/04/2022
 */
class DetailsFragmentAdapter(private val fragment: Fragment, private val currency: UICurrency?) :
    FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 2
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> HistoryFragment()
            else -> ExchangeRateFragment()
        }
    }

    fun getTitle(position: Int): String {
        return if (position == 0) {
            fragment.getString(R.string._info, currency?.symbol)
        } else {
            fragment.getString(R.string._rates, currency?.symbol)
        }
    }
}