package com.gregkluska.cleanmessenger.framework.presentation.ui.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import com.gregkluska.cleanmessenger.framework.presentation.BaseApplication
import com.gregkluska.cleanmessenger.framework.presentation.theme.AppTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class AuthFragment : Fragment() {
    @Inject
    lateinit var application: BaseApplication

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return ComposeView(requireContext()).apply {
            setContent {

                AppTheme (
                    darkTheme = !application.isLight,
                    progressBarIsDisplayed = false,
                ) {
                }

            }
        }
    }
}