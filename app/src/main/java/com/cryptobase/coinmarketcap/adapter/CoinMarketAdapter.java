package com.cryptobase.coinmarketcap.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.cryptobase.coinmarketcap.holder.CoinMarketHolder;
import com.cryptobase.coinmarketcap.model.CoinMarket;

import java.util.List;

public class CoinMarketAdapter extends RecyclerView.Adapter<CoinMarketHolder> {

	private final List<CoinMarket> mList;

	public CoinMarketAdapter(List<CoinMarket> list) {
		this.mList = list;
	}

	@Override
	public CoinMarketHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		return new CoinMarketHolder(parent);
	}

	@Override
	public void onBindViewHolder(CoinMarketHolder holder, int position) {
		holder.init(getItem(position));
	}

	@Override
	public int getItemCount() {
		return mList.size();
	}

	private CoinMarket getItem(int position) {
		return mList.get(position);
	}
}
