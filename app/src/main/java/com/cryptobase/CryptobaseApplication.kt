package com.cryptobase

import android.app.Application
import com.cryptobase.di.Injection
import com.github.salomonbrys.kodein.KodeinAware

class CryptobaseApplication: Application(), KodeinAware {

    override val kodein by Injection().graph
}