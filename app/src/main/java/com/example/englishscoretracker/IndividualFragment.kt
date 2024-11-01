package com.example.englishscoretracker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
    Column(

    ) {
        Row(
            modifier = Modifier.
                fillMaxWidth(),
            horizontalArrangement = Arrangement.End,
        ) {
            TrashIcon()
            Spacer(modifier = Modifier.width(16.dp))
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            horizontalArrangement = Arrangement.Start
        ) {
            Spacer(modifier = Modifier.width(16.dp))
            DayText("")
            Spacer(modifier = Modifier.width(16.dp))
            DayUserEditedText("")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            horizontalArrangement = Arrangement.Start
        ) {
            Spacer(modifier = Modifier.width(16.dp))
            GradeText("")
            Spacer(modifier = Modifier.width(16.dp))
            GradeUserEditedText("")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            horizontalArrangement = Arrangement.Start
        ) {
            Spacer(modifier = Modifier.width(16.dp))
            ScoreText("")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            horizontalArrangement = Arrangement.Start
        ) {
            Spacer(modifier = Modifier.width(16.dp))
            ReadingText("")
            Spacer(modifier = Modifier.width(16.dp))
            ReadingScoreText("")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            horizontalArrangement = Arrangement.Start
        ) {
            Spacer(modifier = Modifier.width(16.dp))
            ListeningText("")
            Spacer(modifier = Modifier.width(16.dp))
            ListeningScoreText("")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            horizontalArrangement = Arrangement.Start
        ) {
            Spacer(modifier = Modifier.width(16.dp))
            WritingText("")
            Spacer(modifier = Modifier.width(16.dp))
            WritingScoreText("")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            horizontalArrangement = Arrangement.Start
        ) {
            Spacer(modifier = Modifier.width(16.dp))
            SpeakingText("")
            Spacer(modifier = Modifier.width(16.dp))
            SpeakingScoreText("")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            horizontalArrangement = Arrangement.Start
        ) {
            Spacer(modifier = Modifier.width(16.dp))
            MemoText("")
            Spacer(modifier = Modifier.width(16.dp))
            MemoUserEditedText("")
        }
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
fun TrashIcon() {
    IconButton(onClick = {}) {
        Icon(
            imageVector = Icons.Filled.Delete,
            contentDescription = "ゴミ箱アイコン",
            modifier = Modifier.size(24.dp),
            tint = MaterialTheme.colorScheme.primary
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TrashIconPreview() {
    EnglishScoreTrackerTheme {
        TrashIcon()
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
private fun DayUserEditedText(dayUserEditedString: String, modifier: Modifier = Modifier) {
    Text(
        text = "2024年11月1日",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
private fun DayUserEditedTextPreview() {
    EnglishScoreTrackerTheme {
        DayUserEditedText("2024年11月1日")
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
private fun GradeUserEditedText(gradeUserEditedString: String, modifier: Modifier = Modifier) {
    Text(
        text = "準一級",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
private fun GradeUserEditedTextPreview() {
    EnglishScoreTrackerTheme {
        GradeUserEditedText("準一級")
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

@Composable
private fun ListeningText(listeningString: String, modifier: Modifier = Modifier) {
    Text(
        text = "Listening",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
private fun ListeningTextPreview() {
    EnglishScoreTrackerTheme {
        ListeningText("Listening")
    }
}

@Composable
private fun ListeningScoreText(listeningScoreString: String, modifier: Modifier = Modifier) {
    Text(
        text = "850",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
private fun ListeningScoreTextPreview() {
    EnglishScoreTrackerTheme {
        ListeningScoreText("850")
    }
}

@Composable
private fun WritingText(writingString: String, modifier: Modifier = Modifier) {
    Text(
        text = "Writing",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
private fun WritingTextPreview() {
    EnglishScoreTrackerTheme {
        WritingText("Writing")
    }
}

@Composable
private fun WritingScoreText(writingScoreString: String, modifier: Modifier = Modifier) {
    Text(
        text = "850",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
private fun WritingScoreTextPreview() {
    EnglishScoreTrackerTheme {
        WritingScoreText("850")
    }
}

@Composable
private fun SpeakingText(speakingString: String, modifier: Modifier = Modifier) {
    Text(
        text = "Speaking",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
private fun SpeakingTextPreview() {
    EnglishScoreTrackerTheme {
        SpeakingText("Speaking")
    }
}

@Composable
private fun SpeakingScoreText(speakingScoreString: String, modifier: Modifier = Modifier) {
    Text(
        text = "850",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
private fun SpeakingScoreTextPreview() {
    EnglishScoreTrackerTheme {
        SpeakingScoreText("850")
    }
}

@Composable
private fun MemoText(memoString: String, modifier: Modifier = Modifier) {
    Text(
        text = "Memo",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
private fun MemoTextPreview() {
    EnglishScoreTrackerTheme {
        MemoText("Memo")
    }
}

@Composable
private fun MemoUserEditedText(memoUserEditedString: String, modifier: Modifier = Modifier) {
    Text(
        text = "I got perfect score!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
private fun MemoUserEditedTextPreview() {
    EnglishScoreTrackerTheme {
        MemoUserEditedText("I got perfect score!")
    }
}