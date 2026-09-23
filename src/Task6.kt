fun main() {
    val array = intArrayOf(2, 5, 3, 8, 1, 4)

    // через for
    var productFor = 1
    for (element in array) {
        productFor *= element
    }
    println("Произведение (for): $productFor")

    // через while
    var productWhile = 1
    var i = 0
    while (i < array.size) {
        productWhile *= array[i]
        i++
    }
    println("Произведение (while): $productWhile")

    // через forEach
    var productForEach = 1
    array.forEach { productForEach *= it }
    println("Произведение (forEach): $productForEach")

    // через reduce
    val productReduce = array.reduce { acc, element -> acc * element }
    println("Произведение (reduce): $productReduce")

    // Min и max
    println("Min элемент: ${array.min()}")
    println("Max элемент: ${array.max()}")
}