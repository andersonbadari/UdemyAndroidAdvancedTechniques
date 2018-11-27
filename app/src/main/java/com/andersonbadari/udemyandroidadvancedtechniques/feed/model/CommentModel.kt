package com.andersonbadari.udemyandroidadvancedtechniques.feed.model

import com.andersonbadari.udemyandroidadvancedtechniques.feed.viewholder.CommentClickListener

data class CommentModel(var name: String = "", var comment: String = "", var clickListener: CommentClickListener? = null) : BaseModel()