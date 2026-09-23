fun main() {
    val a = (0..10).random()
    println("Программа загадала число от 0 до 10. Попробуйте угадать!")

    while (true) {
        println("Введите ваш вариант:")
        val b = readln().toInt()

        when {
            b > a -> println("Много")
            b < a -> println("Мало")
            else -> {
                println("Угадал")
                break
            }
        }
    }
}