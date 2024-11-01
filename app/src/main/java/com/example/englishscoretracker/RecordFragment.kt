package com.example.englishscoretracker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.fragment.app.Fragment
import com.example.englishscoretracker.ui.theme.EnglishScoreTrackerTheme

class RecordFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val composeView = ComposeView(requireContext()).apply {
            setContent {
                RecordScreen()
            }
        }
        return composeView
    }
}

@Composable
fun RecordScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
    ) {
        ColorBoxGrid(colorBoxes = typeOfTest)
    }
}

@Preview(showBackground = true)
@Composable
private fun RecordScreenPreview() {
    EnglishScoreTrackerTheme {
        RecordScreen()
    }
}

@Composable
fun ColorBoxGrid(colorBoxes: List<TypeOfTest>) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(
            horizontal = 2.dp,
            vertical = 2.dp
        )
    ) {
        items(colorBoxes.chunked(2)) { rowOfColorBoxes ->
            RowOfColorBoxes(rowOfColorBoxes)
        }
    }
}

@Composable
fun RowOfColorBoxes(rowOfColorBoxes: List<TypeOfTest>) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(2.dp),
        horizontalArrangement = Arrangement.spacedBy(2.dp)
    ) {
        rowOfColorBoxes.forEach { colorBox ->
            ColorBoxItem(colorBox)
        }
    }
}

@Composable
fun ColorBoxItem(typeOfTest: TypeOfTest) {
    Box(
        modifier = Modifier
            .size(192.dp)
            .background(Color(typeOfTest.color)),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = typeOfTest.name,
            color = androidx.compose.ui.graphics.Color.White,
            fontSize = 28.sp
        )
    }
}