package com.cryptobase.coinmarketcap.api;


import com.cryptobase.coinmarketcap.model.CoinMarket;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class CoinMarketClient {

    public static final String BASE_URL = "https://api.coinmarketcap.com/v1/";
    private static CoinMarketClient instance;
    private final CoinMarketAPI meetupAPI;

    public static CoinMarketClient getInstance() {
        if (instance == null) {
            instance = new CoinMarketClient();
        }
        return instance;
    }

    private CoinMarketClient() {

        final Gson gson = new GsonBuilder()
                .setDateFormat("dd-MM-yyyy'T'HH:mm:ssZ")
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();

        final Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        meetupAPI = retrofit.create(CoinMarketAPI.class);
    }

    public Call<List<CoinMarket>> listCoinMarket() {

        return meetupAPI.listCoinMarket();
    }

}
