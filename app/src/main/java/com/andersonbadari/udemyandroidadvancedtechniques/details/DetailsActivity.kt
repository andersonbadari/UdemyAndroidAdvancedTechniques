package com.andersonbadari.udemyandroidadvancedtechniques.details

import android.content.DialogInterface
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
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
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        details.bindData(OfferModel(discount,courseName))
        details.setHasPoints(false)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        if (item?.itemId == android.R.id.home) {
            if (details.getHasPoints()) {
                AlertDialog.Builder(this)
                        .setCancelable(false)
                        .setTitle("Tem certeza?")
                        .setMessage("Promoção poderá ser perdida")
                        .setPositiveButton("SIM", object : DialogInterface.OnClickListener {
                            override fun onClick(p0: DialogInterface?, p1: Int) {
                                finish()
                            }
                        })
                        .setNegativeButton("NÃO", object : DialogInterface.OnClickListener {
                            override fun onClick(p0: DialogInterface?, p1: Int) {
                                p0?.dismiss()
                            }
                        })
                        .create()
                        .show()
            } else {
                finish()
            }
        }

        return super.onOptionsItemSelected(item)
    }
}