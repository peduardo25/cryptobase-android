package com.cryptobase

import android.app.Application
import com.cryptobase.di.Injection
import com.github.salomonbrys.kodein.KodeinAware
import uk.co.chrisjenx.calligraphy.CalligraphyConfig



class CryptobaseApplication: Application(), KodeinAware {

    override val kodein by Injection().graph

    override fun onCreate() {
        super.onCreate()

        CalligraphyConfig.initDefault(CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Roboto-RobotoRegular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        )
    }
}