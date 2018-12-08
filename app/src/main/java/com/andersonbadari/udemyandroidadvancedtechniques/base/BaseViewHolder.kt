package com.andersonbadari.udemyandroidadvancedtechniques.base

import android.support.v7.widget.RecyclerView
import android.view.View

abstract class BaseViewHolder <MODEL> (itemView: View) : RecyclerView.ViewHolder(itemView) {
    abstract fun bind(model: MODEL)
}