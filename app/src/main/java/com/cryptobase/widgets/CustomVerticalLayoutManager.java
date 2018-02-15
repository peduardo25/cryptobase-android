package com.cryptobase.widgets;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;

public class CustomVerticalLayoutManager extends LinearLayoutManager {
	private boolean isScrollEnabled;

	public CustomVerticalLayoutManager(Context context, boolean scrollEnabled) {
		super(context);
		this.isScrollEnabled = scrollEnabled;
	}

	@Override
	public boolean canScrollVertically() {
		return isScrollEnabled && super.canScrollVertically();
	}
}
