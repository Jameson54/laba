open class Vehicle(
    open val name: String = "Транспортное средство",
    open val speed: Int = 0
) {
    open fun start() {
        println("$name начал движение со скоростью $speed км/ч")
    }

    open fun stop() {
        println("$name остановился")
    }
}

class Boat : Vehicle("Лодка", 30) {
    override fun start() {
        println("$name начала движение со скоростью $speed км/ч")
    }

    override fun stop() {
        println("$name остановилась")
    }
}

class Airplane : Vehicle("Самолет", 800) {
    override fun start() {
        println("$name начал движение со скоростью $speed км/ч")
    }

    override fun stop() {
        println("$name остановился")
    }
}

class Tank : Vehicle("Танк", 50) {
    override fun start() {
        println("$name начал движение со скоростью $speed км/ч")
    }

    override fun stop() {
        println("$name остановился")
    }
}

fun main() {
    val boat = Boat()
    val airplane = Airplane()
    val tank = Tank()

    boat.start()
    boat.stop()

    airplane.start()
    airplane.stop()

    tank.start()
    tank.stop()
}