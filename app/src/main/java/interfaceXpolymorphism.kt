interface Animal{
    val breed: String       // property shouldn't have a value. It is the classes that are responsible
    fun pet()               // for specifying this property value
}

class Cat(
    val name: String,
    override val breed: String
): Animal{
    override fun pet() {
        println("Meow")
    }
}
class Dog(
    val name: String,
    override val breed: String
): Animal{
    override fun pet() {
        println("Waff")
    }
}

fun pet(animal: Animal){
    println("Petting ${animal.breed}")
    animal.pet()
}

fun main(){
    pet(Cat("Mayu", "Muchkin"))
    pet(Dog("Jarvo", "Border Collie"))

}