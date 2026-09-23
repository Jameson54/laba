fun main() {
    var count = 0
    var sum = 0.0

    println("Вводите числа (0 для завершения):")
    while (true) {
        val input = readln()
        val number = input.toDouble()
        if (number == 0.0) break
        count++
        sum += number
    }

    println("Количество введенных чисел: $count")
    println("Общая сумма: $sum")
    if (count > 0) {
        println("Среднее арифметическое: ${sum / count}")
    } else {
        println("Среднее арифметическое: не определено (нет чисел)")
    }
}