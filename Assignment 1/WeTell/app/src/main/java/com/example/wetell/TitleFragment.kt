package com.example.wetell

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.wetell.databinding.FragmentTitleBinding

class TitleFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater,R.layout.fragment_title,container,false)
     //   val args = TitleFragmentArgs.fromBundle(requireArguments())
      //  binding.apply {
      //      binding.name.text = "Name: ${args.login}"
      //      invalidateAll()
      //  }


        return binding.root
    }


}