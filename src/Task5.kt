fun main() {
    val array = intArrayOf(1, 3, 2, 5, 4, 7, 6, 9, 8)

    println("С использованием for:")
    for (i in 1 until array.size - 1) {
        if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
            println(array[i])
        }
    }

    println("С использованием while:")
    var i = 1
    while (i < array.size - 1) {
        if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
            println(array[i])
        }
        i++
    }
h
    println("С использованием forEach:")
    array.forEachIndexed { index, value ->
        if (index in 1 until array.size - 1) {
            if (value > array[index - 1] && value > array[index + 1]) {
                println(value)
            }
        }
    }
}
