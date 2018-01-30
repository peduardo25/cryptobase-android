package com.cryptobase.feed.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.cryptobase.R
import com.cryptobase.app.BaseActivity
import com.cryptobase.feed.viewmodel.FeedViewModel
import com.github.salomonbrys.kodein.LazyKodein
import com.github.salomonbrys.kodein.android.appKodein
import com.github.salomonbrys.kodein.instance

class FeedActivity : BaseActivity() {

    private val kodein by lazy { LazyKodein(appKodein) }
    private val feedViewModel by kodein.instance<FeedViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        feedViewModel.bindBtcFeed()
    }
}
