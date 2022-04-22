package com.raed.currency.presentation.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.raed.currency.databinding.FragmentListBinding


/**
 * Created By Raed Saeed on 22/04/2022
 */
class ExchangeRateFragment : Fragment() {
    private lateinit var binding : FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentListBinding.inflate(inflater, container, false)
        return binding.root
    }
}