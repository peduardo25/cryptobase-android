package com.cryptobase.app

import android.content.Context
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper


class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        prepareToolbar()
    }

    private fun prepareToolbar() {
        if (getToolbar() == null)
            return

        setSupportActionBar(getToolbar())
        supportActionBar!!.setDisplayHomeAsUpEnabled(displayHomeAsUpEnabled())
    }

    fun displayHomeAsUpEnabled(): Boolean {
        return false
    }

    private fun getToolbar(): Toolbar? {
        return null
    }

    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase))
    }
}