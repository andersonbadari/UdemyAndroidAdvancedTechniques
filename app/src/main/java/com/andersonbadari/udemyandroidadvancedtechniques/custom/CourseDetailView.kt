package com.andersonbadari.udemyandroidadvancedtechniques.custom

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import android.view.View
import android.widget.TextView
import com.andersonbadari.udemyandroidadvancedtechniques.R
import com.andersonbadari.udemyandroidadvancedtechniques.feed.model.OfferModel
import kotlinx.android.synthetic.main.view_details.view.*

class CourseDetailView @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private var hasPoints : Boolean = false
    private var isExpanded : Boolean = false

    init {
        View.inflate(context, R.layout.view_details, this)
    }

    fun bindData(offer: OfferModel) {
        findViewById<TextView>(R.id.custom_course_name).text = offer.courseName // + " (oferta imperdível somente hoje)"
        findViewById<TextView>(R.id.custom_course_discount).text = offer.discountPercentage
    }

    fun setHasPoints(hasPoints : Boolean) {
        this.hasPoints = hasPoints
        if (hasPoints) {
            viewswitch.visibility = View.VISIBLE
        } else {
            viewswitch.visibility = View.INVISIBLE
        }
    }

    fun getHasPoints(): Boolean {
        return hasPoints
    }

    fun setClicks() {
        // Se usuário clicar, abre o app do youtube com o vídeo promocional
        // se usuário clicar e segurar, somente copia o link.
    }

    fun changeTitleByDiscountValue() {
        // exibe o texto em negrito e sublinhado se a porcentagem for maior que 10%
        // Se for maior que 20%, aumenta a fonte
        // Maior que 50%, fonte fica com 25dp
    }
}