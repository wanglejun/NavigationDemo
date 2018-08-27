package com.navigation.demo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_a.*

class FragmentA : android.support.v4.app.Fragment() {
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val bundle = Bundle()
        bundle.putString("param", "I AM FROM FRAGMENT-A")
        to_fragmentb_btn.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_fragmentA_to_fragmentB)
        }


        to_fragmentC_btn.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_fragmentA_to_fragmentC, bundle)
        }

        to_fragmentD_btn.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_fragmentA_to_fragmentD))

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_a, container, false)
    }
}