package com.kei.neusics.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.kei.neusics.R
import com.kei.neusics.databinding.FragmentOverBinding

class OverFragment : Fragment(R.layout.fragment_over) {

    private lateinit var overBinding: FragmentOverBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        overBinding = FragmentOverBinding.bind(view)
        overBinding.btnTryAgain.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_overFragment_to_welcomeFragment)
        )
    }
}