package com.andersonbadari.udemyandroidadvancedtechniques.checkout

import android.content.DialogInterface
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.MenuItem
import android.widget.Toast
import com.andersonbadari.udemyandroidadvancedtechniques.R
import com.andersonbadari.udemyandroidadvancedtechniques.base.BaseActivity
import com.andersonbadari.udemyandroidadvancedtechniques.feed.model.OfferModel
import kotlinx.android.synthetic.main.activity_checkout.*

class CheckoutActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout)

        val discount = intent?.getStringExtra("DISC")?:""
        val courseName = intent?.getStringExtra("NAME")?:""
        supportActionBar?.title = courseName
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        details.bindData(OfferModel(discount,courseName))
        details.setHasPoints(true)

        finish_checkout.setOnClickListener {
            // faz consulta numa api e retorna erro
            showError()
        }
    }

    override fun showError() {
        Toast.makeText(this, "Erro", Toast.LENGTH_SHORT).show()
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