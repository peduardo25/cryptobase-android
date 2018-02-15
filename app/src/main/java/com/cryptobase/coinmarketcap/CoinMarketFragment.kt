package com.cryptobase.coinmarketcap

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cryptobase.R

open class CoinMarketFragment : Fragment() {

    companion object {
        fun newInstance(): CoinMarketFragment = CoinMarketFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_coin_market, container, false)
    }

}
