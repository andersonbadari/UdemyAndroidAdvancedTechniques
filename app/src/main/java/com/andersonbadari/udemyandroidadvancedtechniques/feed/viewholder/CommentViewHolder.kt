package com.andersonbadari.udemyandroidadvancedtechniques.feed.viewholder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.andersonbadari.udemyandroidadvancedtechniques.R
import com.andersonbadari.udemyandroidadvancedtechniques.base.BaseViewHolder
import com.andersonbadari.udemyandroidadvancedtechniques.feed.model.CommentModel

class CommentViewHolder(itemView: View) : BaseViewHolder<CommentModel>(itemView) {

    override fun bind(model: CommentModel) {
        itemView.findViewById<TextView>(R.id.profile_name).text = model.name
        itemView.findViewById<TextView>(R.id.comment).text = model.comment

        itemView.findViewById<ImageView>(R.id.like).setOnClickListener {
            model.clickListener?.onClick(model.name)
        }
    }


}