package com.andersonbadari.udemyandroidadvancedtechniques.feed

import android.graphics.Rect
import android.support.v7.widget.RecyclerView
import android.view.View

class HorizontalItemDecoration(private val spaceHeight: Int) : RecyclerView.ItemDecoration() {
    override fun getItemOffsets(outRect: Rect, view: View,
                                parent: RecyclerView, state: RecyclerView.State) {
        with(outRect) {
            left =  spaceHeight
            right = spaceHeight
        }
    }
}