package com.cryptobase.main

import android.content.res.ColorStateList
import android.os.Bundle
import android.support.v4.content.ContextCompat
import com.cryptobase.R
import com.cryptobase.app.BaseActivity
import com.cryptobase.coinmarketcap.CoinMarketFragment
import kotlinx.android.synthetic.main.activity_main.*

class HomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        populateView()
    }

    fun populateView() {
        setupViewPager()

        homeTabLayot.setupWithViewPager(viewPager)
        homeTabLayot.tabTextColors = ColorStateList.valueOf(ContextCompat.getColor(this, R.color.primary))
        homeTabLayot.setSelectedTabIndicatorColor(ContextCompat.getColor(this, R.color.primary))
        homeTabLayot.setSelectedTabIndicatorHeight(resources.getDimensionPixelSize(R.dimen.indicator_height))
        homeTabLayot.setTabTextColors(ContextCompat.getColor(this, R.color.grey_400), ContextCompat.getColor(this, R.color.primary))
    }

    private fun setupViewPager() {
        val adapter = HomeAdapter(supportFragmentManager)
        adapter.addFragment(CoinMarketFragment.newInstance(), "Teste 1")
        adapter.addFragment(CoinMarketFragment.newInstance(), "Teste 2")

        viewPager.adapter = adapter
    }
}
