package com.andersonbadari.udemyandroidadvancedtechniques.custom

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import com.andersonbadari.udemyandroidadvancedtechniques.R
import com.andersonbadari.udemyandroidadvancedtechniques.feed.model.OfferModel
import kotlinx.android.synthetic.main.view_details.view.*

class CourseDetailView @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private var root: View = LayoutInflater.from(context).inflate(R.layout.view_details, this, false)

    fun bindData(offer: OfferModel) {
        custom_course_name.text = offer.courseName
        custom_course_discount.text = offer.discountPercentage
    }

}