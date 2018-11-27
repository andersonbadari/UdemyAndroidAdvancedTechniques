package com.andersonbadari.udemyandroidadvancedtechniques.custom

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import android.view.View
import android.widget.TextView
import com.andersonbadari.udemyandroidadvancedtechniques.R
import com.andersonbadari.udemyandroidadvancedtechniques.feed.model.OfferModel

class CourseDetailView @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    init {
        View.inflate(context, R.layout.view_details, this)
    }

    fun bindData(offer: OfferModel) {
        findViewById<TextView>(R.id.custom_course_name).text = offer.courseName
        findViewById<TextView>(R.id.custom_course_discount).text = offer.discountPercentage
    }

}