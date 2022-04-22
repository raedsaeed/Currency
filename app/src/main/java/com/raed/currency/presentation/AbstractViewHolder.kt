package com.raed.currency.presentation

import android.view.View
import androidx.recyclerview.widget.RecyclerView


/**
 * Created By Raed Saeed on 22/04/2022
 */
abstract class AbstractViewHolder<T>(itemView: View) : RecyclerView.ViewHolder(itemView) {
    abstract fun bind(item: T)
}