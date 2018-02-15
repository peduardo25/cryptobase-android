package com.cryptobase.coinmarketcap.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class CoinMarket : Serializable {

    val id: String = ""
    val name: String = ""
    val symbol: String = ""
    val rank: String = ""
    @SerializedName("price_usd")
    val princeUsd : Double = 0.0
    @SerializedName("price_btc")
    val princeBtc : Double = 0.0

    @SerializedName("24h_volume_usd")
    val volume24h : String = ""
    @SerializedName("market_cap_usd")
    val marketCapUsd : String = ""
    @SerializedName("available_supply")
    val availableSupply : String = ""
    @SerializedName("max_supply")
    val maxSupply : String = ""
    @SerializedName("percent_change_1h")
    val percentChange1h : Double = 0.0
    @SerializedName("percent_change_24h")
    val percentChange24h : Double = 0.0
    @SerializedName("percent_change_7d")
    val percentChange7d : Double = 0.0
}
