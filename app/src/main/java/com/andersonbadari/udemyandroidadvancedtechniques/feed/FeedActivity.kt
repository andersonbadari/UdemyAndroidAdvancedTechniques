package com.andersonbadari.udemyandroidadvancedtechniques.feed

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.andersonbadari.udemyandroidadvancedtechniques.R
import com.andersonbadari.udemyandroidadvancedtechniques.feed.model.BaseModel
import com.andersonbadari.udemyandroidadvancedtechniques.feed.model.CommentModel
import com.andersonbadari.udemyandroidadvancedtechniques.feed.model.OfferModel

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
        val mList : ArrayList<BaseModel> = ArrayList()
        mList.add(CommentModel("José da Silva Simões", "Curso topper. Positivei"))
        mList.add(CommentModel("José da Silva Simões", "Curso topper. Positivei"))
        mList.add(CommentModel("José da Silva Simões", "Curso topper. Positivei"))
        mList.add(OfferModel("25%", "Culinária Sulamericana"))
        mList.add(CommentModel("José da Silva Simões", "Curso topper. Positivei"))
        mList.add(CommentModel("José da Silva Simões", "Curso topper. Positivei"))
        mList.add(CommentModel("José da Silva Simões", "Curso topper. Positivei"))
        mList.add(OfferModel("25%", "Culinária Sulamericana"))
        mList.add(CommentModel("José da Silva Simões", "Curso topper. Positivei"))
        mList.add(CommentModel("José da Silva Simões", "Curso topper. Positivei"))
        mList.add(CommentModel("José da Silva Simões", "Curso topper. Positivei"))
        mList.add(OfferModel("25%", "Culinária Sulamericana"))
        return mList
    }

    fun decorateRecyclerview() {
        // decora os espaçamentos
    }

    fun setRecyclerviewClicks() {
        // seta as ações dos itens da lista
    }
}
