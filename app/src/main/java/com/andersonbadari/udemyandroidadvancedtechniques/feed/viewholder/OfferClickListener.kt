package com.andersonbadari.udemyandroidadvancedtechniques.feed.viewholder

interface OfferClickListener {
    fun onBuyClick(discount: String, courseName: String)
    fun onInfoClick(discount: String, courseName: String)
}