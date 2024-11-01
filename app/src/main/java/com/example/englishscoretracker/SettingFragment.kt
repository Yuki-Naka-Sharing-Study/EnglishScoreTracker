package com.example.englishscoretracker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.material.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.fragment.app.Fragment
import com.example.englishscoretracker.ui.theme.EnglishScoreTrackerTheme

class SettingFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val composeView = ComposeView(requireContext()).apply {
            setContent {
                SettingScreen()
            }
        }
        return composeView
    }
}

@Composable
fun SettingScreen() {
    Column(
        modifier = Modifier
            .padding(dimensionResource(id = R.dimen.space_16)),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SettingTextView()

        Spacer(
            modifier = Modifier.height(
                dimensionResource(id = R.dimen.space_16)
            )
        )

        AboutThisAppLazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = dimensionResource(id = R.dimen.space_16))
                .clip(RoundedCornerShape(dimensionResource(id = R.dimen.space_16)))
                .background(color = androidx.compose.ui.graphics.Color.LightGray)
        )
    }
}

@Composable
private fun SettingTextView() {
    Text(
        stringResource(id = R.string.setting_text),
        fontWeight = FontWeight.Bold
    )
}

@Preview(showBackground = true)
@Composable
private fun SettingTextViewPreview() {
    EnglishScoreTrackerTheme {
        SettingTextView()
    }
}

@Composable
private fun AboutThisAppLazyColumn(modifier: Modifier) {
    val itemList = listOf(
        stringResource(id = R.string.about_this_app),
        stringResource(id = R.string.contact),
        stringResource(id = R.string.review),
        stringResource(id = R.string.share_this_app),
        stringResource(id = R.string.version),
    )

    LazyColumn(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = dimensionResource(id = R.dimen.space_16))
            .clip(RoundedCornerShape(dimensionResource(id = R.dimen.space_16)))
            .background(color = androidx.compose.ui.graphics.Color.LightGray)
    ) {
        items(itemList.size) { index ->
            val item = itemList[index]
            val action = when (index) {
                0 -> {
                    { /* このアプリについて */ }
                }

                1 -> {
                    { /* お問い合わせ */ }
                }

                2 -> {
                    { /* レビューする */ }
                }

                3 -> {
                    { /* このアプリを共有する */ }
                }

                else -> {
                    { /* 何もしない */ }
                }
            }
            BasicText(
                text = item,
                modifier = Modifier.padding(dimensionResource(id = R.dimen.space_16)),
                style = TextStyle(
                    fontSize = dimensionResource(id = R.dimen.space_16).value.sp,
                    color = Color.Gray
                )
            )
            if (index < itemList.size - 1) {
                Divider(color = androidx.compose.ui.graphics.Color.Black)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun AboutThisAppLazyColumnPreview() {
    EnglishScoreTrackerTheme {
        AboutThisAppLazyColumn(modifier = Modifier)
    }
}