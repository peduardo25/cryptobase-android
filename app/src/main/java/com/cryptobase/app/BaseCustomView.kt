package com.cryptobase.app

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.RelativeLayout
import com.cryptobase.common.Layout

abstract class BaseCustomView : RelativeLayout {

    constructor(context: Context) : super(context) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init(context)
    }

    private fun init(context: Context) {
        val cls = javaClass
        if (!cls.isAnnotationPresent(Layout::class.java)) return
        val annotation = cls.getAnnotation(Layout::class.java)
        val layout = annotation as Layout

        LayoutInflater.from(context).inflate(layout.id, this)
    }
}
