/*
In some cases, you need to represent a pair of values.
For that, a class you can use is the Pair class.
This is a data class with two constructor properties,
you do not need to define it, as it is distributed with Kotlin.

In the below example, a pair with values of type Double and Char is created.
You can read those values using first and second properties.
You can also destructure it into variables.
 */

fun main(){
    val pairA = Pair(1.0, 'A')
    // to access
    println(pairA.first)
    println(pairA.second)

// we can also destructure them
    val (number, letter) = pairA
    println("number: $number")
    println("letter2: $letter")

// Another way: by "to" keyword
    println("by to keyword")
    val pairB = 2.0 to 'B'
    println(pairB.first)
    println(pairB.second)

// Triple
    println(); println()
    println("Triple: ")
    val pair = Triple(1F, "ABC", true)
    println(pair.first) // 1.0
    println(pair.second) // ABC
    println(pair.third) // true
    val (numbers, letters, boolean) = pair
    // the type of number is Double
    // the type of letters is Char
    // the type of boolean is Boolean
    println(numbers) // 1.0
    println(letters) // ABC
    println(boolean) // true

}