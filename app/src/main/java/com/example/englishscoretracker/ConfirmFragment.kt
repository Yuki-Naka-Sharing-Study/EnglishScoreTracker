package com.example.englishscoretracker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment

class ConfirmFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val composeView = ComposeView(requireContext()).apply {
            setContent {
                ConfirmScreen()
            }
        }
        return composeView
    }
}

@Composable
fun ConfirmScreen() {
    Column {
        Text(text = "NO DATA")
    }
}