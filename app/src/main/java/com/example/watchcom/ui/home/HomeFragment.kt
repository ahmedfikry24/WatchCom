package com.example.watchcom.ui.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.example.watchcom.R
import com.example.watchcom.databinding.FragmentHomeBinding
import com.example.watchcom.ui.base.BaseFragment

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>() {
    override val layOutId = R.layout.fragment_home
    override val viewModel: HomeViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}