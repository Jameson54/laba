fun main() {
    println("Введите целое положительное число:")
    val input = readln()
    val number = input.toInt()
    val lastDigit = number % 10
    var temp = number
    while (temp >= 10) temp /= 10
    val firstDigit = temp
    println("Сумма первой и последней цифры = ${firstDigit + lastDigit}")
}