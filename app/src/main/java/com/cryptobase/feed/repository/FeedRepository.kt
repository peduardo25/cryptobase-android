package com.cryptobase.feed.repository

import com.prof.rssparser.Article
import com.prof.rssparser.Parser

class FeedRepository {

    private val GUIA_BITCOIN_URL = "https://guiadobitcoin.com.br/feed/"

    fun parseGuiaBitcoinFeed() {
        val parser = Parser()
        parser.execute(GUIA_BITCOIN_URL)

        parser.onFinish(object : Parser.OnTaskCompleted {
            override fun onTaskCompleted(list: ArrayList<Article>) {

                print(list.size)
            }

            override fun onError() {

            }
        })
    }
}
