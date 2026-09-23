class ArrayProcessor(private val array: IntArray) {

    fun sumOfPositive(): Int {
        var sum = 0
        for (element in array) {
            if (element > 0) sum += element
        }
        return sum
    }

    fun product(): Long {
        var product: Long = 1
        for (element in array) {
            product *= element
        }
        return product
    }

    fun average(): Double {
        if (array.isEmpty()) return 0.0
        return array.sum().toDouble() / array.size
    }
}

fun main() {
    val array = intArrayOf(1, -2, 3, -4, 5, 6)
    val processor = ArrayProcessor(array)

    println("Сумма положительных элементов: ${processor.sumOfPositive()}")
    println("Произведение элементов: ${processor.product()}")
    println("Среднее арифметическое: ${processor.average()}")
}