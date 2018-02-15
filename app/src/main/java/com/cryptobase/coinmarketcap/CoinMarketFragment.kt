package com.cryptobase.coinmarketcap

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.cryptobase.R
import com.cryptobase.coinmarketcap.api.CoinMarketClient
import com.cryptobase.coinmarketcap.model.CoinMarket
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

open class CoinMarketFragment : Fragment() {

    private val mClient = CoinMarketClient.getInstance()

    companion object {
        fun newInstance(): CoinMarketFragment = CoinMarketFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_coin_market, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

     mClient.listCoinMarket().enqueue(object : Callback<List<CoinMarket>> {
         override fun onResponse(call: Call<List<CoinMarket>>, response: Response<List<CoinMarket>>) {
          val list = response.body()
         }

         override fun onFailure(call: Call<List<CoinMarket>>, t: Throwable) {
         }
     })

        Toast.makeText(context, "sdsad", Toast.LENGTH_LONG).show()
    }

}
