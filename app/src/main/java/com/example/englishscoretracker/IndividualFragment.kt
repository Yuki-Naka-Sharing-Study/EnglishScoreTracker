package com.example.englishscoretracker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.preview.Preview
import androidx.fragment.app.Fragment
import com.example.englishscoretracker.ui.theme.EnglishScoreTrackerTheme

class IndividualFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val composeView = ComposeView(requireContext()).apply {
            setContent {
                IndividualScreen()
            }
        }
        return composeView
    }
}

@Composable
fun IndividualScreen() {
    Column {
        Text(text = "made feature/individual-fragment branch and IndividualFragment.")
    }
}

@Preview(showBackground = true)
@Composable
fun IndividualScreenPreview() {
    EnglishScoreTrackerTheme {
        IndividualScreen()
    }
}
