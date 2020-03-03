package com.example.recycledview


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.recycledview.data.User
import com.example.recycledview.databinding.FragmentPersonBinding

/**
 * A simple [Fragment] subclass.
 */
class PersonFragment : Fragment() {

    lateinit var user : User
    lateinit var binder : FragmentPersonBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_person, container, false)
        binder = DataBindingUtil.inflate(inflater,R.layout.fragment_person,container,false)
        return binder.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        user = arguments?.getParcelable("data")!!

        binder = DataBindingUtil.setContentView(this.requireActivity(), R.layout.fragment_person)
        binder.user = user
    }


}