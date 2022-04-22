package com.raed.currency.domain.interfaces

import androidx.databinding.ViewDataBinding
import com.raed.currency.presentation.AbstractViewHolder
import com.raed.currency.presentation.uimodels.BaseObject


/**
 * Created By Raed Saeed on 22/04/2022
 */
interface TypeFactory {
    fun createViewHolder(
        viewDataBinding: ViewDataBinding,
        viewType: Int
    ): AbstractViewHolder<BaseObject>

    fun type(base: BaseObject?): Int
}