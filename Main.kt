fun main() {
    // 1. Вывод
    val str1 = "Занятие"
    println("Символы строки «Занятие»:")
    for (char in str1) {
        println(char)
    }

    // 2. Проверка номера
    fun isValidPhoneNumber(phone: String): Boolean {
        val regex = Regex("^\\+7\\d{10}$")
        return regex.matches(phone)
    }

    val phoneNumber = "+71234567890" // Пример номера телефона
    println("Номер телефона $phoneNumber валиден: ${isValidPhoneNumber(phoneNumber)}")

    // 3. Вывод символов строки 
    val str2 = "Занятие"
    val reversedStr = str2.reversed()
    println("Символы строки в обратном порядке: $reversedStr")

    // 4. Подсчет количества цифр в строке
    val str3 = "kotlin2023course"
    val digitCount = str3.count { it.isDigit() }
    println("Количество цифр в строке «kotlin2023course»: $digitCount")
}