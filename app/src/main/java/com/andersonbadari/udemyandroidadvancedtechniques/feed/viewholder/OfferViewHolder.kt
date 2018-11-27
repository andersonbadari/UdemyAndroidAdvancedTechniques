package com.andersonbadari.udemyandroidadvancedtechniques.feed.viewholder

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.andersonbadari.udemyandroidadvancedtechniques.R
import com.andersonbadari.udemyandroidadvancedtechniques.feed.model.OfferModel

class OfferViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(model: OfferModel) {
        val formattedString = itemView.context.getString(R.string.offers, model.discountPercentage, model.courseName)
        itemView.findViewById<TextView>(R.id.offer_discount).text = formattedString

        itemView.findViewById<Button>(R.id.buy_now).setOnClickListener {
            model.clickListener?.onClick(model.discountPercentage, model.courseName)
        }

    }

}