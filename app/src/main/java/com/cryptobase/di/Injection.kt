package com.cryptobase.di

import com.cryptobase.feed.repository.FeedRepository
import com.cryptobase.feed.viewmodel.FeedViewModel
import com.github.salomonbrys.kodein.*

class Injection {

    val graph = Kodein.lazy {
        bind<FeedRepository>() with provider {
            FeedRepository()
        }

        bind<FeedViewModel>() with provider {
            FeedViewModel(feedRepository = instance())
        }
    }
}
