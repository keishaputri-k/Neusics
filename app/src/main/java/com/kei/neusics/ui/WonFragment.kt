package com.kei.neusics.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.kei.neusics.R
import com.kei.neusics.databinding.FragmentWonBinding

class WonFragment : Fragment(R.layout.fragment_won) {

    private lateinit var wonBinding: FragmentWonBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        wonBinding = FragmentWonBinding.bind(view)
        wonBinding.btnFinish.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_wonFragment_to_welcomeFragment)
        )
    }
}