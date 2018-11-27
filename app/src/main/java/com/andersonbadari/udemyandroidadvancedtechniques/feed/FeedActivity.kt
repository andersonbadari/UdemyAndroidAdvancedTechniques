package com.andersonbadari.udemyandroidadvancedtechniques.feed

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast
import com.andersonbadari.udemyandroidadvancedtechniques.R
import com.andersonbadari.udemyandroidadvancedtechniques.feed.model.BaseModel
import com.andersonbadari.udemyandroidadvancedtechniques.feed.model.CommentModel
import com.andersonbadari.udemyandroidadvancedtechniques.feed.model.OfferModel
import com.andersonbadari.udemyandroidadvancedtechniques.feed.viewholder.CommentClickListener
import com.andersonbadari.udemyandroidadvancedtechniques.feed.viewholder.OfferClickListener

class FeedActivity : AppCompatActivity() {

    /**

    - Listas (RecyclerView) com múltiplos tipos de itens;

    - Listas (RecyclerView) com múltiplos tipos de itens e cliques para cada tipo de item;

    - Listas (RecyclerView) com múltiplos tipos de itens e decorações (Decoration) para a separação dos itens da lista;

    - Exibições (Views) customizadas (encapsulamento de estados).

     */

    lateinit var mRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feed)

        getRecyclerviewReference()
        createRecyclerviewAdapter()
        decorateRecyclerview()
        setRecyclerviewClicks()

    }

    fun getRecyclerviewReference() {
        mRecyclerView = findViewById(R.id.list_feed)
    }

    fun createRecyclerviewAdapter() {
        // cria a popula o adapter
        recyclerViewBasicConfiguration()
        val adapter = FeedAdapter(generateList())
        mRecyclerView.adapter = adapter
    }

    fun recyclerViewBasicConfiguration() {
        mRecyclerView.layoutManager = LinearLayoutManager(this)
    }

    fun generateList(): ArrayList<BaseModel> {
        val mList: ArrayList<BaseModel> = ArrayList()
        mList.add(CommentModel("José Simões", "Curso topper. Positivei", provideCommentClickListener()))
        mList.add(CommentModel("Pedro Marques", "Curso topper. Positivei", provideCommentClickListener()))
        mList.add(OfferModel("25%", "Culinária lunar", provideOfferClickListener()))
        mList.add(CommentModel("Marcos Vasques", "Curso topper. Positivei", provideCommentClickListener()))
        mList.add(CommentModel("Getúlio Ignácio", "Curso topper. Positivei", provideCommentClickListener()))
        mList.add(OfferModel("45%", "Vôos Espaciais", provideOfferClickListener()))
        mList.add(CommentModel("Ricardo Pontes", "Curso topper. Positivei", provideCommentClickListener()))
        mList.add(CommentModel("Henrique Fontoura", "Curso topper. Positivei", provideCommentClickListener()))
        mList.add(OfferModel("35%", "Genética alienígena", provideOfferClickListener()))
        return mList
    }

    fun provideCommentClickListener(): CommentClickListener {
        val clickListener = object : CommentClickListener {
            override fun onClick(name: String) {
                Toast.makeText(this@FeedActivity, "$name recebeu um like!", Toast.LENGTH_SHORT).show()
            }
        }
        return clickListener
    }

    fun provideOfferClickListener(): OfferClickListener {
        val clickListener = object : OfferClickListener {
            override fun onClick(discount: String, courseName: String) {
                Toast.makeText(this@FeedActivity, "Comprando o curso $courseName com uma taxa de desconto de $discount em 3,2,1...", Toast.LENGTH_SHORT).show()
            }
        }

        return clickListener
    }

    fun decorateRecyclerview() {
        // decora os espaçamentos
        mRecyclerView.addItemDecoration(MarginItemDecoration(16))
    }

    fun setRecyclerviewClicks() {
        // seta as ações dos itens da lista
    }
}
