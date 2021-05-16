package ru.netology

fun main() {

    val resultTime = agoToText(252) // в секундах

    println("Пользователь был в сети $resultTime")
}

fun agoToText(timeUser: Int): String {
val timeUserMin = timeUser / 60
val timeUserHour = timeUser / 3600
    return when {
        timeUser in 0..60 -> "только что"
        timeUser in 61..3600 -> "$timeUserMin минут(у) назад"
        timeUser in 3601..86400 -> "$timeUserHour час(ов) назад"
        timeUser in 86401..172800 -> "сегодня"
        timeUser in 172801..259200 -> "вчера"
        timeUser > 259201 -> "давно"
        else -> "[введены не  верные данные]"
    }
}