package ru.netology

fun main() {

    val resultTime = agoToText(75600) // в секундах

    println("Пользователь был в сети $resultTime")
}

fun agoToText(timeUser: Int): String {
    return when {
        timeUser in 0..60 -> "только что"
        timeUser in 61..3600 -> "${timeUserMin(timeUser)} назад"
        timeUser in 3601..86400 -> "${timeUserHour(timeUser)} назад"
        timeUser in 86401..172800 -> "сегодня"
        timeUser in 172801..259200 -> "вчера"
        timeUser > 259201 -> "давно"
        else -> "[введены не  верные данные]"
    }

}

fun timeUserMin(timeUser: Int): String {
    val timeUserMinCalc = timeUser / 60
    return when {
        ((timeUserMinCalc % 10 == 1) && (timeUserMinCalc != 11))
                || (timeUserMinCalc == 1) -> "$timeUserMinCalc минуту"
        (timeUserMinCalc % 10 == 2) || (timeUserMinCalc % 10 == 3)
                || (timeUserMinCalc % 10 == 4) -> "$timeUserMinCalc минуты"
        else -> "$timeUserMinCalc минут"
    }
}

fun timeUserHour(timeUser: Int): String {
    val timeUserHourCalc = timeUser / 3600
    return when {
        ((timeUserHourCalc % 10 == 1) && (timeUserHourCalc != 11))
                || (timeUserHourCalc == 1) -> "$timeUserHourCalc час"
        (timeUserHourCalc % 10 == 2) || (timeUserHourCalc % 10 == 3)
                || (timeUserHourCalc % 10 == 4) -> "$timeUserHourCalc часа"
        else -> "$timeUserHourCalc часов"
    }
}