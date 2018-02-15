package com.cryptobase.coinmarketcap.holder

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cryptobase.R
import com.cryptobase.coinmarketcap.model.CoinMarket
import com.cryptobase.widgets.CoinMarketItem
import kotlinx.android.synthetic.main.holder_coin_market.view.*

class CoinMarketHolder(view: View) : RecyclerView.ViewHolder(LayoutInflater.from(view.context).inflate(R.layout.holder_coin_market, view as ViewGroup, false)) {

    lateinit var item: CoinMarketItem

    fun init(item: CoinMarket) {

        itemView.coinMarketItemList.init(CoinMarketItem.CoinMarketData(item.name, item.symbol, item.princeUsd, item.princeBtc, item.percentChange24h))
    }
}
