package com.example.recycledview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycledview.data.User
import kotlinx.android.synthetic.main.row.view.*

class MyUserRecyclerViewAdapter (
    private val mValues: List<User> ) : RecyclerView.Adapter<MyUserRecyclerViewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)
        return this.ViewHolder(view)
    }

    override fun getItemCount():
        Int = mValues.size

    override fun onBindViewHolder(holder: MyUserRecyclerViewAdapter.ViewHolder, position: Int) {
        val item = mValues[position]
        holder.textViewName.text = item.nombre
        holder.textViewLastName.text = item.lastName
        holder.image.setImageURI(item.image)
    }

    inner class ViewHolder(private val mView: View) : RecyclerView.ViewHolder(mView) {

        val textViewName: TextView = mView.textViewUserName
        val textViewLastName: TextView = mView.textViewUserLastName
        val image: ImageView = mView.image
    }
}