package com.example.englishscoretracker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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

@Composable
private fun DayText(dayString: String, modifier: Modifier = Modifier) {
    Text(
        text = "受験日",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
private fun DayTextPreview() {
    EnglishScoreTrackerTheme {
        DayText("受験日")
    }
}

@Composable
private fun GradeText(gradeString: String, modifier: Modifier = Modifier) {
    Text(
        text = "受験級",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
private fun GradeTextPreview() {
    EnglishScoreTrackerTheme {
        GradeText("受験級")
    }
}

@Composable
private fun ScoreText(scoreString: String, modifier: Modifier = Modifier) {
    Text(
        text = "スコア",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
private fun ScoreTextPreview() {
    EnglishScoreTrackerTheme {
        ScoreText("スコア")
    }
}

@Composable
private fun ReadingText(readingString: String, modifier: Modifier = Modifier) {
    Text(
        text = "Reading",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
private fun ReadingTextPreview() {
    EnglishScoreTrackerTheme {
        ReadingText("Reading")
    }
}

@Composable
private fun ReadingScoreText(readingScoreString: String, modifier: Modifier = Modifier) {
    Text(
        text = "850",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
private fun ReadingScoreTextPreview() {
    EnglishScoreTrackerTheme {
        ReadingScoreText("850")
    }
}