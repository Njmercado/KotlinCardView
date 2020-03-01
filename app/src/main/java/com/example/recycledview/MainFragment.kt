package com.example.recycledview


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycledview.data.User
import kotlinx.android.synthetic.main.fragment_main.view.*

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

        users.add(User("Jean", "Palacio","https://randomuser.me/api/portraits/men/67.jpg"))
        users.add(User("Nino", "Mercado","https://randomuser.me/api/portraits/men/3.jpg"))
        users.add(User("Juan", "Martinez", "https://randomuser.me/api/portraits/men/45.jpg"))
        adapter = MyUserRecyclerViewAdapter(users)

        view.recyclerv.layoutManager = LinearLayoutManager(context)
        view.recyclerv.adapter = adapter

        return view
    }
}