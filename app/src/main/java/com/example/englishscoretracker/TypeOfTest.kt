package com.example.englishscoretracker

data class TypeOfTest(
    val color: Int,
    val name: String
)

val typeOfTest = listOf(
    TypeOfTest(0xFFD32F2F.toInt(), "英検一次"),
    TypeOfTest(0xFF7B1FA2.toInt(), "英検二次"),
    TypeOfTest(0xFF1976D2.toInt(), "TOEIC"),
    TypeOfTest(0xFF388E3C.toInt(), "TOEIC SW"),
    TypeOfTest(0xFFFBC02D.toInt(), "TOEFL iBT"),
    TypeOfTest(0xFFF57C00.toInt(), "IELTS"),
    TypeOfTest(0xFFFFFFFF.toInt(), "White"),
)