package com.andersonbadari.udemyandroidadvancedtechniques.details

import android.os.Bundle
import com.andersonbadari.udemyandroidadvancedtechniques.R
import com.andersonbadari.udemyandroidadvancedtechniques.base.BaseActivity
import com.andersonbadari.udemyandroidadvancedtechniques.feed.model.OfferModel
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val discount = intent?.getStringExtra("DISC")?:""
        val courseName = intent?.getStringExtra("NAME")?:""
        supportActionBar?.title = courseName
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        details.bindData(OfferModel(discount,courseName))
        details.setHasPoints(false)
    }
}