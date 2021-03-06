package com.overwork.pension.other

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.GridView

class MyGridView : GridView {

    private var haveScrollbar = true

    constructor(context: Context) : super(context) {

    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle) {}

    fun setHaveScrollbar(haveScrollbar: Boolean) {
        this.haveScrollbar = haveScrollbar
    }

    public override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val expandSpec = View.MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE shr 2,
                View.MeasureSpec.AT_MOST)
        super.onMeasure(widthMeasureSpec, expandSpec)
    }
}
