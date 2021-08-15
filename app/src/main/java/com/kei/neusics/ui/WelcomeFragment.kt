package com.kei.neusics.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.kei.neusics.R
import com.kei.neusics.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment(R.layout.fragment_welcome) {

    private lateinit var welcomeBinding: FragmentWelcomeBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        welcomeBinding = FragmentWelcomeBinding.bind(view)
        welcomeBinding.btnStart.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_welcomeFragment_to_quizFragment)
        )
    }

}