package com.example.recycledview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recycledview.data.User


class MyUserRecyclerViewAdapter(var list: MutableList<User>):RecyclerView.Adapter<MyUserRecyclerViewAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var va = LayoutInflater.from(parent?.context).inflate(R.layout.row,parent,false)
        return ViewHolder(va)
    }

    override fun getItemCount(): Int {
        return list.size

    }

    override fun onBindViewHolder(holder: MyUserRecyclerViewAdapter.ViewHolder, position: Int) {
        holder.bindItems(list[position])
    }


    class ViewHolder(view:View):RecyclerView.ViewHolder(view){
        fun bindItems(data: User){
            val nombre:TextView=itemView.findViewById(R.id.textViewUserName)
            val apellido:TextView=itemView.findViewById(R.id.textViewUserLastName)
            val imagen:ImageView=itemView.findViewById(R.id.UserPhoto)
            nombre.text = data.nombre
            apellido.text = data.lastName
            Glide.with(itemView.context).load(data.imgsrc).into(imagen)
        }
    }
}