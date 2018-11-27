package com.andersonbadari.udemyandroidadvancedtechniques.checkout

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class CheckoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val discount = intent?.getStringExtra("DISC")
        val courseName = intent?.getStringExtra("NAME")
        supportActionBar?.title = "$courseName com desconto de $discount"
    }
}