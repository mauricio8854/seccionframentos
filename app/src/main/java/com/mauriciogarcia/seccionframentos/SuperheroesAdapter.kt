package com.mauriciogarcia.seccionframentos

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

import kotlinx.android.synthetic.main.superheroes_item.view.*

class SuperheroesAdapter:RecyclerView.Adapter<SuperheroesAdapter.SuperheroesViewHolder> {

    private var listaSuperheroes:List<Superheroes>? =null
    private var context: Context? = null

    constructor(listaSuperheroes:List<Superheroes>, context: Context){
        this.listaSuperheroes= listaSuperheroes
        this.context=context
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroesViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        var view = LayoutInflater.from(context).inflate(R.layout.superheroes_item,parent,false)
        return SuperheroesViewHolder(view)

    }
    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            return listaSuperheroes?.size!!
    }

    override fun onBindViewHolder(holder: SuperheroesViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            var superheroes :Superheroes = listaSuperheroes!![position]
            holder.loadItem(superheroes)

    }



    class SuperheroesViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){

        fun loadItem(superheroes: Superheroes){
            itemView.tNombre.text=superheroes.nombre
           itemView.iFoto.setImageResource(superheroes.foto)
        }
    }

}