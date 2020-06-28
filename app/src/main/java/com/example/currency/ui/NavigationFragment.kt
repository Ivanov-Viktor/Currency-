package com.example.currency.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.currency.R
import kotlinx.android.synthetic.main.fragment_navigation.*

class NavigationFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_navigation, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val currencyFragment = CurrencyFragment()
        val webViewFragment = WebViewFragment()

        dollarBtn.setOnClickListener {
            currencyFragment.arguments = Bundle().also {
                it.putInt("key", 1)
            }

            fragmentManager?.beginTransaction()
                ?.replace(R.id.fragmentContainer, currencyFragment)
                ?.addToBackStack(null)
                ?.commit()
        }

        euroBtn.setOnClickListener {
            currencyFragment.arguments = Bundle().also {
                it.putInt("key", 2)
            }
            fragmentManager?.beginTransaction()
                ?.replace(R.id.fragmentContainer, currencyFragment)
                ?.addToBackStack(null)
                ?.commit()
        }

        webViewBtn.setOnClickListener {
            fragmentManager?.beginTransaction()
                ?.replace(R.id.fragmentContainer, webViewFragment)
                ?.addToBackStack(null)
                ?.commit()
        }
    }
}