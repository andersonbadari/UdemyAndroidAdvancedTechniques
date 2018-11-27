package com.andersonbadari.udemyandroidadvancedtechniques.details

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.andersonbadari.udemyandroidadvancedtechniques.R
import com.andersonbadari.udemyandroidadvancedtechniques.feed.model.OfferModel
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val discount = intent?.getStringExtra("DISC")?:""
        val courseName = intent?.getStringExtra("NAME")?:""
        supportActionBar?.title = courseName

        details.bindData(OfferModel(discount,courseName))
    }
}