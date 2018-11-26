package com.andersonbadari.udemyandroidadvancedtechniques.feed

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.andersonbadari.udemyandroidadvancedtechniques.R
import com.andersonbadari.udemyandroidadvancedtechniques.feed.model.BaseModel
import com.andersonbadari.udemyandroidadvancedtechniques.feed.model.CommentModel
import com.andersonbadari.udemyandroidadvancedtechniques.feed.model.OfferModel
import com.andersonbadari.udemyandroidadvancedtechniques.feed.viewholder.CommentViewHolder
import com.andersonbadari.udemyandroidadvancedtechniques.feed.viewholder.EmptyViewHolder
import com.andersonbadari.udemyandroidadvancedtechniques.feed.viewholder.OfferViewHolder

class FeedAdapter(var mList: ArrayList<BaseModel>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        const val ITEM_TYPE_COMMENT = 0
        const val ITEM_TYPE_OFFER = 1
    }

    override fun onCreateViewHolder(parent: ViewGroup, type: Int): RecyclerView.ViewHolder {

        return when (type) {
            ITEM_TYPE_COMMENT -> {
                val root = LayoutInflater.from(parent.context).inflate(R.layout.item_type_1, parent, false)
                CommentViewHolder(root)
            }
            ITEM_TYPE_OFFER -> {
                val root = LayoutInflater.from(parent.context).inflate(R.layout.item_type_2, parent, false)
                OfferViewHolder(root)
            }
            else -> {
                val root = LayoutInflater.from(parent.context).inflate(R.layout.item_type_empty, parent, false)
                EmptyViewHolder(root)
            }
        }

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is CommentViewHolder -> {
                holder.bind(mList[position] as CommentModel)
            }
            is OfferViewHolder -> {
                holder.bind(mList[position] as OfferModel)
            }
        }
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    override fun getItemViewType(position: Int): Int {
        return when (mList[position]) {
            is CommentModel -> ITEM_TYPE_COMMENT
            is OfferModel -> ITEM_TYPE_OFFER
            else -> -1
        }
    }

}