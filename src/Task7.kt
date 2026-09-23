fun sqr(n: Double): Double = n * n

fun discriminant(a: Double, b: Double, c: Double): Double = sqr(b) - 4 * a * c

fun rootsNumber(a: Double, b: Double, c: Double): Int {
    val d = discriminant(a, b, c)
    return when {
        d > 0 -> 2
        d == 0.0 -> 1
        else -> 0
    }
}

fun quadraticRoot(a: Double, b: Double, c: Double) {
    val d = discriminant(a, b, c)
    when (rootsNumber(a, b, c)) {
        2 -> {
            val x1 = (-b + Math.sqrt(d)) / (2 * a)
            val x2 = (-b - Math.sqrt(d)) / (2 * a)
            println("Уравнение имеет два корня: x1 = $x1, x2 = $x2")
        }
        1 -> {
            val x = -b / (2 * a)
            println("Уравнение имеет один корень: x = $x")
        }
        else -> println("Уравнение не имеет действительных корней")
    }
}

fun main() {
    println("Решение квадратного уравнения ax^2 + bx + c = 0")
    println("Введите коэффициенты a, b, c:")
    val a = readln().toDouble()
    val b = readln().toDouble()
    val c = readln().toDouble()

    if (a == 0.0) {
        println("Коэффициент a не может быть равен 0 для квадратного уравнения.")
    } else {
        quadraticRoot(a, b, c)
    }
}