import java.nio.file.Files.move

open class Drone{
    open val look: String = "Black & White"

    open fun setOff(){
        move(0.0, 10.0,0.0)
    }
    open fun move(front: Double, up: Double, rotate: Double){
        println("Moving $front $up $rotate")
    }
}

class SuperHeroDrone: Drone(){
    override val look = "Super Hero Look"

    override fun setOff() {
        move(0.0,15.0 , 0.0)
    }
    override fun move(front: Double, up: Double, rotate: Double){
        println("Superhero is moving")
        super.move(front,up,rotate)
    }
}

fun main(){
    val drone:Drone = SuperHeroDrone()
    println(drone.look)
    drone.setOff()
    drone.move(15.0, 0.0 , 0.0)
}