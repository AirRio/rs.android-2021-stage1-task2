package subtask1

class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String {

        val dayOfWeek = listOf("понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье")

        val dayOfMonth = arrayOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
        val monthOfYear = listOf("января", "февраля", "марта", "апреля", "мая", "июня", "июля", "августа", "сентября", "октября", "ноября", "декабря")

        if(month.toInt() == 2)
        {
            if(year.toInt() % 4 == 0)
                dayOfMonth[1] = 29
        }

        val a = (14 - month.toInt()) / 12
        val y = year.toInt() - a
        val m = month.toInt() + 12 * a - 2
        val r = ( 7000 + (day.toInt() + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) ) % 7

        return if(day.toInt() <= dayOfMonth[month.toInt() - 1]) {
            "$day ${monthOfYear[month.toInt() - 1]}, ${dayOfWeek[r-1]}"
        } else
            "Такого дня не существует"
    }
}
