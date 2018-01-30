package com.cryptobase.feed.viewmodel

import com.cryptobase.feed.repository.FeedRepository

class FeedViewModel(val feedRepository: FeedRepository) {

    fun bindBtcFeed() {
        feedRepository.parseGuiaBitcoinFeed()
    }
}