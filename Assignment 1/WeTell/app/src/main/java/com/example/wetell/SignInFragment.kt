package com.example.wetell

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.wetell.databinding.FragmentSignInBinding

class SignInFragment : Fragment() {
    data class Account(
        val login: String,
        val password: String
    )

    private val accounts: MutableList<Account> = mutableListOf(
        Account("Mark","12345"),
        Account("Donny","45678"),
        Account("Kira","1475")

    )


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentSignInBinding>(inflater,R.layout.fragment_sign_in, container, false)
        binding.buttonLogin.setOnClickListener { view: View ->
            for (account in accounts )
            if (binding.loginEdit.text.toString() == account.login && binding.passwordEdit.text.toString() == account.password){
                view.findNavController().navigate(SignInFragmentDirections.actionSignInFragmentToTitleFragment(account.login))
            }
            else {
                Toast.makeText(activity, "Incorrect login or password", Toast.LENGTH_SHORT).show()
            }
        }
        return binding.root
    }

}