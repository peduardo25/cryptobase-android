package com.cryptobase.widgets

import android.content.Context
import android.support.v4.content.ContextCompat
import android.util.AttributeSet
import com.cryptobase.R
import com.cryptobase.app.BaseCustomView
import com.cryptobase.common.Layout
import kotlinx.android.synthetic.main.widget_coin_market_item.view.*

@Layout(id = R.layout.widget_coin_market_item)
class CoinMarketItem : BaseCustomView {

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    fun init(coin: CoinMarketData) {
        coinName.text = coin.name
        coinSymbol.text = coin.symbol
        coinUSD.text = coin.priceUsd.toString()
        coinBtcValue.text = coin.priceBtc.toString()
        coinValorization.text = coin.valorization.toString()

        if (coin.valorization >= 0) {
            coinValorization.setTextColor(ContextCompat.getColor(context, R.color.green_500))
        } else {
            coinValorization.setTextColor(ContextCompat.getColor(context, R.color.red_500))
        }
    }

    data class CoinMarketData(var name: String, var symbol: String, var priceUsd: Double, var priceBtc: Double, val valorization: Double)
}
