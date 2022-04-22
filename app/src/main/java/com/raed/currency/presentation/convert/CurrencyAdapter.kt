package com.raed.currency.presentation.convert

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.raed.currency.R
import com.raed.currency.databinding.ItemCurrencyBinding
import com.raed.currency.databinding.ItemCurrencyHistoryBinding
import com.raed.currency.databinding.ItemExchangeRateBinding
import com.raed.currency.domain.interfaces.TypeFactory
import com.raed.currency.presentation.AbstractViewHolder
import com.raed.currency.presentation.uimodels.BaseObject
import com.raed.currency.presentation.uimodels.UICurrency
import com.raed.currency.utils.format


/**
 * Created By Raed Saeed on 22/04/2022
 */
class CurrencyAdapter : RecyclerView.Adapter<AbstractViewHolder<BaseObject>>() {
    private val typeFactory = object : TypeFactory {
        override fun createViewHolder(
            viewDataBinding: ViewDataBinding,
            viewType: Int
        ): AbstractViewHolder<BaseObject> {
            return when (viewType) {
                R.layout.item_currency -> CurrencyViewHolder(viewDataBinding)
                R.layout.item_currency_history -> CurrencyHistoryViewHolder(viewDataBinding)
                else -> CurrencyExchangeRateViewHolder(viewDataBinding)
            }
        }

        override fun type(base: BaseObject?): Int {
            return base?.resourceId ?: 0
        }
    }

    private var listener: OnCurrencyClick? = null
    private var items: List<BaseObject>? = null

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AbstractViewHolder<BaseObject> {
        val viewBinding = DataBindingUtil.inflate<ViewDataBinding>(
            LayoutInflater.from(parent.context),
            viewType,
            parent,
            false
        )
        return typeFactory.createViewHolder(viewBinding, viewType)
    }

    override fun onBindViewHolder(holder: AbstractViewHolder<BaseObject>, position: Int) {
        items?.get(position)?.let {
            holder.bind(it)
        }
    }

    override fun getItemCount(): Int {
        return items?.size ?: 0
    }

    override fun getItemViewType(position: Int): Int {
        return typeFactory.type(items?.get(position))
    }

    fun interface OnCurrencyClick {
        fun onCurrencySelection(currency: UICurrency, position: Int)
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setItems(items: List<BaseObject>?) {
        this.items = items
        notifyDataSetChanged()
    }

    fun setOnCurrencyClick(listener: OnCurrencyClick) {
        this.listener = listener
    }

    inner class CurrencyViewHolder(viewBinding: ViewDataBinding) :
        AbstractViewHolder<BaseObject>(viewBinding.root), View.OnClickListener {
        private val binding = viewBinding as ItemCurrencyBinding

        init {
            binding.tvItemCurrencySymbol.setOnClickListener(this)
        }

        override fun bind(item: BaseObject) {
            val element = (item as UICurrency)
            binding.tvItemCurrencySymbol.text = element.symbol
        }

        override fun onClick(v: View?) {
            items?.get(adapterPosition)?.let {
                listener?.onCurrencySelection(it as UICurrency, adapterPosition)
            }
        }
    }

    inner class CurrencyHistoryViewHolder(viewBinding: ViewDataBinding) :
        AbstractViewHolder<BaseObject>(viewBinding.root) {
        private val binding = viewBinding as ItemCurrencyHistoryBinding

        override fun bind(item: BaseObject) {
            val element = (item as UICurrency)
            binding.tvItemHistoryCurrencySymbol.text = element.symbol
            binding.tvItemHistoryCurrencyRate.text = element.value.format()
            binding.tvItemHistoryDate.text = element.date
        }
    }

    inner class CurrencyExchangeRateViewHolder(viewBinding: ViewDataBinding) :
        AbstractViewHolder<BaseObject>(viewBinding.root) {
        private val binding = viewBinding as ItemExchangeRateBinding

        override fun bind(item: BaseObject) {
            val element = (item as UICurrency)
            binding.tvItemExchangeRateCurrencySymbol.text = element.symbol
            binding.tvItemExchangeRateAmount.text = element.value.format()
        }
    }
}