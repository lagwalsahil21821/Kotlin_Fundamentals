class Barista(
    val name: String
){
    fun makeCoffee(type: String, size: Int ): Coffee{
        println("$name makes Coffee of type $type and size $size")

        return Coffee(type,size)
    }
}
class Coffee(
    val type: String,
    val size: Int
)


class User(var name: String) {

    fun changeName(name: String) {

        println("Changed name from ${this.name} to $name")

        this.name = name
    }
}

fun main(){
    val barista = Barista("Jake")
    val coffee = barista.makeCoffee("Latte", 1)


    val user = User("Alpha")

    user.changeName("Beta") // Changed name from Alpha to Beta

    println(user.name) // Beta

}