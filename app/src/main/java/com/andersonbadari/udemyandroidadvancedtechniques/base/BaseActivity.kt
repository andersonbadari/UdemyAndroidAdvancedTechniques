package com.andersonbadari.udemyandroidadvancedtechniques.base

import android.content.DialogInterface
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem

open class BaseActivity : AppCompatActivity() {

    open fun showError() {
        AlertDialog.Builder(this)
                .setCancelable(false)
                .setTitle("Error")
                .setMessage("Ocorreu algum erro. Por favor, tente mais tarde")
                .setPositiveButton("OK", object : DialogInterface.OnClickListener {
                    override fun onClick(p0: DialogInterface?, p1: Int) {
                        p0?.dismiss()
                    }
                })
                .create()
                .show()
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item?.itemId == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }

}