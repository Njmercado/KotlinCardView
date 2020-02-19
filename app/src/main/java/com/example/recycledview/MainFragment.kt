package com.example.recycledview


import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycledview.data.User
import kotlinx.android.synthetic.main.fragment_main.view.*
import kotlinx.android.synthetic.main.row.*

/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment() {

    val users = mutableListOf<User>()
    private var adapter : MyUserRecyclerViewAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_main, container, false)

        val value: Uri = Uri . parse ("https://randomuser.me/api/portraits/women/63.jpg")
        users.add(User("Jean", "Palacio", value))
        users.add(User("Nino", "Mercado", value))
        users.add(User("Juan", "Martinez", value))
        adapter = MyUserRecyclerViewAdapter(users)

        view.list.layoutManager = LinearLayoutManager(context)
        view.list.adapter = adapter

        return view
    }
}