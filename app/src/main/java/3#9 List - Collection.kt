import android.text.TextUtils.isEmpty

fun main(){
// Creating list
    var list = listOf("A", "B", "C")
    println(list)

// result type is List<T>
    val ints: List<Int> = listOf(1, 2, 3)
    println(ints) // [1, 2, 3]

// add or remove elements
    list = list + "D" - "B"
    println("modified list: $list")

// Size of the list
    println(list.size)

// To check if a list is empty, you can compare its size to 0, or you can use the isEmpty method.
    println(list.size == 0)
    println("using isEmpty(): ${list.isEmpty()}")

// getting element at certain position
    println()
    println("getting element at certain position")
    println(list[0])
    println(list[1])
    println(list[2])

// you can not  modify
    // list[1] = "B" // it will error

// checking if the list contain  that element

    println("check whether element is present or not: ")
    println(list.contains("A")) // true
    println(list.contains("Z")) // false
    println("A" in list) // true
    println("Z" in list) // false

// iterate
    println("Iteration of list:")
    for (i in list) {
        print(i)
    }
    println()
// Mutable variables
    val letter = mutableListOf("a","b","c","d")

// now you can modify this internally
// add or remove
    println("Mutable variables: ")
    letter.add("A")
    letter.remove("c")
    println(letter)

//You can also change an element at a certain position using box brackets with index and assignment.
    letter[1] = "B"
    println(letter)
}