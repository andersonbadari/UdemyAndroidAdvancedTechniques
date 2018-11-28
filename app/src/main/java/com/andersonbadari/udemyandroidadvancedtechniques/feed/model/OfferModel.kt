package com.andersonbadari.udemyandroidadvancedtechniques.feed.model

import com.andersonbadari.udemyandroidadvancedtechniques.feed.viewholder.OfferClickListener

data class OfferModel(var discountPercentage: String = "", var courseName: String = "", var clickListener: OfferClickListener? = null) : FeedModel()