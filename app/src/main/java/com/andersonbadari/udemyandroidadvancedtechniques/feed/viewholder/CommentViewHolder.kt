package com.andersonbadari.udemyandroidadvancedtechniques.feed.viewholder

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.andersonbadari.udemyandroidadvancedtechniques.R
import com.andersonbadari.udemyandroidadvancedtechniques.feed.model.CommentModel

class CommentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(model: CommentModel) {
        itemView.findViewById<TextView>(R.id.profile_name).text = model.name
        itemView.findViewById<TextView>(R.id.comment).text = model.comment
    }

}