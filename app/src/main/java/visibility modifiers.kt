open class Ship{
    protected var milesPassed = 0.0       // if you make it private then -> not been used by its subclass ElectricShip
                                // so we use protected visibility specifier
    fun printMilesPassed(){
        println(milesPassed)
    }
}

class ElectricalShip: Ship(){
    fun swimUsingEngine(distance: Double){
        milesPassed += distance
    }
}

internal fun add(a: Int, b: Int): Int{      // by internal visibility specifier this fun only used in this module
    return a+b
}

fun main(){
    val ship = ElectricalShip()
    ship.swimUsingEngine(10.0)
}