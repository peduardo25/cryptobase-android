package com.cryptobase.coinmarketcap.api;

import com.cryptobase.coinmarketcap.model.CoinMarket;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CoinMarketAPI {

    @GET("ticker")
    Call<List<CoinMarket>> listCoinMarket();
}
