//Calling superclass constructor
/*
When a class is inherited from another class it takes all the behavior
 of the parent class. That includes its constructor properties,
 but to initialize them with some values, the parents' constructor
 needs to be called. That means, when you call a constructor of a
 subclass, it also needs to call its parent constructor.
  How is this done? When you specify a class that you inherit from,
  you also need to call the constructor of this class.
 */

open class DogA(val breed: String)

class Labrador(val name: String) : DogA("Labrador Retriever") // Here we call animals' constructor

fun main() {
    val lab = Labrador("Coco")
    println(lab.name) // Coco
    println(lab.breed) // Labrador Retriever
}


// *****************-----------------------******************

// make sure to comment above text before use this
/*
However, there is also a much easier option.
Inside Labrador you can define name without val.
In such a case, Labrador does not define name property,
but it does not need to - it is already defined by its parent.
The name parameter can be passed to the superclass constructor,
and both classes behave practically the same as in the previous example.
so need to use
    - open modifier
    - override : labrador(override val name: String): Dog(name)
 */

//open class Dog(val name: String)
//
//class Labrador(name: String) : Dog(name)
//
//fun main() {
//    val lab = Labrador("Coco")
//    println(lab.name) // Coco
//}