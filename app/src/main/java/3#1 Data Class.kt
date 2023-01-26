data class DogX(val name: String, val age: Int)     // data modifier is used so modify, display, comparison become easy

fun main(){
    // comparing two string
    println("A" == "A") // true

    // But happens if we will compare two instances
    val dog1 = DogX("cookie",1)
    val dog2 = DogX("pluto", 7)
    val dog3 = DogX("cookie", 1)
    println("Comparing instances: "
    )
    println(dog1 == dog2)   //false
    println(dog1 == dog3)   // false but if you use data modifier then behaviour of equality changes


// Destructuring:

    // when you are interesting in reading the value of instance,
    // classic way to get them is like
    println(dog1.name)
    println(dog1.age)

    val (name, age) = dog1  // first variable is associated with the first property of primary constructor and 2nd with second and so on
    println()               // it doesn't matter what name I give it, like if we replace name with firstname then that will be okay
    println("Destructuring: ")
    println(name)
    println(age)


// copy function : to modify instances
    println()
    val newDog = dog1.copy(age = dog1.age + 3)
    println("Copy function: ")
    println(dog1)
    println(newDog)





}
