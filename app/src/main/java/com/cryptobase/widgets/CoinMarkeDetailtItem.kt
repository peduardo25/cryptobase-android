package com.cryptobase.widgets

import android.content.Context
import android.support.v4.content.ContextCompat
import android.util.AttributeSet
import com.cryptobase.R
import com.cryptobase.app.BaseCustomView
import com.cryptobase.common.Layout
import kotlinx.android.synthetic.main.widget_coin_market_detail_item.view.*

@Layout(id = R.layout.widget_coin_market_detail_item)
class CoinMarkeDetailtItem : BaseCustomView {

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    fun init(key: String, value: String) {
        coinKey.text = key
        coinValue.text = value
    }
}
