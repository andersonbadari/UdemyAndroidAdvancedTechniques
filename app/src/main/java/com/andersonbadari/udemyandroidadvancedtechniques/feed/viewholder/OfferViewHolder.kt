package com.andersonbadari.udemyandroidadvancedtechniques.feed.viewholder

import android.view.View
import android.widget.Button
import android.widget.TextView
import com.andersonbadari.udemyandroidadvancedtechniques.R
import com.andersonbadari.udemyandroidadvancedtechniques.base.BaseViewHolder
import com.andersonbadari.udemyandroidadvancedtechniques.feed.model.OfferModel

class OfferViewHolder(itemView: View) : BaseViewHolder<OfferModel>(itemView) {

    override fun bind(model: OfferModel) {
        val formattedString = itemView.context.getString(R.string.offers, model.discountPercentage, model.courseName)
        itemView.findViewById<TextView>(R.id.offer_discount).text = formattedString

        itemView.findViewById<Button>(R.id.buy_now).setOnClickListener {
            model.clickListener?.onBuyClick(model.discountPercentage, model.courseName)
        }

        itemView.findViewById<TextView>(R.id.info).setOnClickListener {
            model.clickListener?.onInfoClick(model.discountPercentage, model.courseName)
        }

    }

}