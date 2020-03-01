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
        users.add(User("Jorge", "Ramirez", "https://randomuser.me/api/portraits/men/50.jpg"))
        users.add(User("Jesus", "Ibañez", "https://randomuser.me/api/portraits/men/45.jpg"))
        users.add(User("Ivan", "Castañeda", "https://randomuser.me/api/portraits/men/46.jpg"))
        users.add(User("Ramon", "Segura", "https://randomuser.me/api/portraits/men/47.jpg"))
        users.add(User("Ruben", "Agudelo", "https://randomuser.me/api/portraits/men/48.jpg"))
        users.add(User("Teofilo", "Gutierrez", "https://randomuser.me/api/portraits/men/49.jpg"))
        users.add(User("Gabriel", "Fuentes", "https://randomuser.me/api/portraits/men/51.jpg"))
        users.add(User("Rodolfo", "Arruabarrena", "https://randomuser.me/api/portraits/men/52.jpg"))
        users.add(User("Romario", "Da silva", "https://randomuser.me/api/portraits/men/53.jpg"))
        users.add(User("Marcelo", "Bielsa", "https://randomuser.me/api/portraits/men/54.jpg"))
        users.add(User("Francisco", "Maturana", "https://randomuser.me/api/portraits/men/55.jpg"))
        users.add(User("Jairo", "Patiño", "https://randomuser.me/api/portraits/men/56.jpg"))
        users.add(User("Zlatan", "Osorio", "https://randomuser.me/api/portraits/men/57.jpg"))
        users.add(User("Marco", "Di Matteo", "https://randomuser.me/api/portraits/men/58.jpg"))
        users.add(User("Luca", "Toni", "https://randomuser.me/api/portraits/men/59.jpg"))
        users.add(User("Romulo", "Giaccherini", "https://randomuser.me/api/portraits/men/61.jpg"))
        users.add(User("Paolo", "Maldini", "https://randomuser.me/api/portraits/men/62.jpg"))


        adapter = MyUserRecyclerViewAdapter(users)

        view.recyclerv.layoutManager = LinearLayoutManager(context)
        view.recyclerv.adapter = adapter

        return view
    }
}