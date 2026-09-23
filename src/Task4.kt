fun main() {
    println("Введите количество простых чисел n:")
    val n = readln().toInt()

    var count = 0
    var number = 2

    while (count < n) {
        if (isPrime(number)) {
            count++
            println("$count-ое число: $number")
        }
        number++
    }
}

fun isPrime(num: Int): Boolean {
    if (num < 2) return false
    for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) return false
    }
    return true
}